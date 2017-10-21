/*
 * Copyright 2017 Kamil Sopko (https://github.com/sopak) and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.jcode.auto.value.step.builder;

import com.google.auto.common.MoreTypes;
import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.AutoValueExtension;
import com.google.common.base.CaseFormat;
import com.google.common.collect.ImmutableList;

import javax.annotation.Nullable;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Types;
import java.util.*;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

public class Generator {
    private final AutoValueExtension.Context context;
    private final String className;
    private final String classToExtend;
    private final boolean isFinal;

    public Generator(AutoValueExtension.Context context, String className, String classToExtend, boolean isFinal) {
        this.context = context;
        this.className = className;
        this.classToExtend = classToExtend;
        this.isFinal = isFinal;
    }

    public String generate() {

        Types typeUtils = context.processingEnvironment().getTypeUtils();
        String pkg = context.packageName();
        TypeElement type = context.autoValueClass();
        DeclaredType declaredType = MoreTypes.asDeclared(type.asType());
        Set<TypeMirror> types = new TypeMirrorSet();
        types.addAll(returnTypesOf(context.properties().values()));
        TypeElement generatedTypeElement =
                context.processingEnvironment().getElementUtils().getTypeElement("javax.annotation.Generated");
        if (generatedTypeElement != null) {
            types.add(generatedTypeElement.asType());
        }
        TypeMirror javaUtilArrays = getTypeMirror(Arrays.class);

        TypeSimplifier typeSimplifier = new TypeSimplifier(typeUtils, pkg, types, declaredType);
        AutoValueStepBuilderTemplateVars vars = new AutoValueStepBuilderTemplateVars(context.processingEnvironment());
        vars.props = ImmutableList.copyOf(
                context.properties()
                        .entrySet().stream()
                        .map(
                                entry -> new Property(
                                        typeUtils,
                                        entry.getValue(),
                                        entry.getKey()
                                )
                        )
                        .collect(toList())
        );

        vars.required = ImmutableList.copyOf(
                vars.props.stream()
                        .filter(Property::isRequired)
                        .collect(toList()));

        Optional<Property> first = vars.required.stream().findFirst();
        Optional<Property> last = vars.required.stream().reduce((left, right) -> right);

        first.ifPresent(i -> {
            i.setAsFirst();
            vars.firstRequired = i;
        });
        first.ifPresent(i -> {
            i.setAsLast();
            vars.lastRequired = i;
        });
        last.ifPresent(i -> {
            i.setAsLast();
            vars.lastRequired = i;
        });

        Property prev = null;
        for (Property property : vars.required) {
            if (!property.isFirst()) {
                property.setPrev(prev);
            }
            prev = property;
        }

        vars.optional = ImmutableList.copyOf(
                vars.props
                        .stream().filter(Property::isOptional)
                        .collect(toList())
        );

        vars.pkg = context.packageName();
        vars.generated = "Generated";
        vars.types = context.processingEnvironment().getTypeUtils();

        vars.imports = typeSimplifier.typesToImport();
        vars.generated = generatedTypeElement == null
                ? ""
                : typeSimplifier.simplify(generatedTypeElement.asType());
        vars.arrays = typeSimplifier.simplify(javaUtilArrays);

        vars.originalClassName = declaredType.toString();
        vars.implementedClassName = declaredType.toString().replace(".", "_");
        vars.formalTypes = typeSimplifier.formalTypeParametersString(type);
        vars.className = className;
        vars.classToExtend = classToExtend;
        vars.isFinal = isFinal;

        Optional<? extends Element> builderElement = context.autoValueClass()
                .getEnclosedElements().stream()
                .filter(element -> null != element.getAnnotation(AutoValue.Builder.class))
                .findFirst();
        if (builderElement.isPresent()) {
            vars.builderTypeName = typeSimplifier.simplify(builderElement.get().asType());

            vars.builderTypeCreator = "new AutoValue_" + vars.builderTypeName + "()";

            context.autoValueClass()
                    .getEnclosedElements().stream()
                    .filter(element -> element.getKind() == ElementKind.METHOD)
                    .filter(method -> ((ExecutableElement) method).getReturnType().toString().equals(builderElement.get().asType().toString()))
                    .findFirst()
                    .ifPresent(
                            method -> vars.builderTypeCreator = (vars.originalClassName.replaceAll("<.*>", "") + "." + vars.formalTypes + method.getSimpleName() + "()")
                    );
        }
        return vars.toText();
    }

    private Set<TypeMirror> returnTypesOf(Collection<ExecutableElement> methods) {
        return methods.stream()
                .map(m -> m.getReturnType())
                .collect(toCollection(TypeMirrorSet::new));
    }

    private TypeMirror getTypeMirror(Class<?> c) {
        return context.processingEnvironment().getElementUtils().getTypeElement(c.getName()).asType();
    }

    public class Property {
        private ExecutableElement element;
        private String name;
        private String type;
        private String nonPrimitiveType;
        private boolean primitive = false;
        private boolean first = false;
        private boolean last = false;
        private Property prev = null;
        private Property next = null;

        public Property(Types typeUtils, ExecutableElement element, String name) {
            this.element = element;
            this.name = name;
            this.type = element.getReturnType().toString();
            if (element.getReturnType().getKind().isPrimitive()) {
                PrimitiveType primitiveType = (PrimitiveType) element.getReturnType();
                this.nonPrimitiveType = typeUtils.boxedClass(primitiveType).toString();
                this.primitive=true;
            } else {
                this.nonPrimitiveType = element.getReturnType().toString();
            }
        }

        public boolean isOptional() {
            return null != element.getAnnotation(Nullable.class);
        }

        public boolean isRequired() {
            return !this.isOptional();
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String getNonPrimitiveType() {
            return nonPrimitiveType;
        }

        public boolean isPrimitive() {
            return primitive;
        }

        @Override
        public String toString() {
            return name;
        }

        public String getStepInterface() {
            return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, getName() + "Step");
        }

        public String getLazyStepInterface() {
            return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, getName() + "LazyStep");
        }

        public String getNextType() {
            if (next == null) {
                return "BuilderStep";
            }
            return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, next.getName() + "Step");
        }

        public String getNextLazyType() {
            if (next == null) {
                return "BuilderLazyStep";
            }
            return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, next.getName() + "LazyStep");
        }

        public ExecutableElement getElement() {
            return element;
        }

        public void setAsFirst() {
            first = true;
        }

        public void setAsLast() {
            last = true;
        }

        public boolean isFirst() {
            return first;
        }

        public boolean isLast() {
            return last;
        }

        public void setPrev(Property prev) {

            this.prev = prev;
            prev.next = this;
        }

        public Property getPrev() {
            return prev;
        }

        public Property getNext() {
            return next;
        }
    }
}
