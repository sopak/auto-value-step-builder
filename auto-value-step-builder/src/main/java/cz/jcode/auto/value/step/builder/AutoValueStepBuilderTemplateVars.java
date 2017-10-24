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

import com.google.auto.value.processor.escapevelocity.Template;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedSet;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.util.Types;

// the fields in this class are only read via reflection
@SuppressWarnings("unused" )
class AutoValueStepBuilderTemplateVars extends TemplateVars
{

    ImmutableList<Generator.Property> required;

    Generator.Property firstRequired;

    Generator.Property lastRequired;

    ImmutableList<Generator.Property> optional;


    /**
     * The properties defined by the parent class's abstract methods. The elements of this set are
     * in the same order as the original abstract method declarations in the AutoValue class.
     */
    ImmutableList<Generator.Property> props;

    /**
     * The type utilities returned by {@link ProcessingEnvironment#getTypeUtils()}.
     */
    Types types;

    /**
     * The fully-qualified names of the classes to be imported in the generated class.
     */
    ImmutableSortedSet<String> imports;

    /**
     * The spelling of the {@code Generated} class: {@code Generated} or {@code
     * javax.annotation.Generated}. Empty if the class is not available.
     */
    String generated;

    /**
     * The spelling of the java.util.Arrays class: Arrays or java.util.Arrays.
     */
    String arrays;

    /**
     * The package of the class with the {@code @AutoValue} annotation and its generated subclass.
     */
    String pkg;
    String originalClassName;
    String implementedClassName;
    String className;
    String finalClassName;
    String classToExtend;

    /**
     * True if the generated class should be final (there are no extensions that
     * will generate subclasses)
     */
    Boolean isFinal = false;
    /**
     * The formal generic signature of the class with the {@code @AutoValue} annotation and its
     * generated subclass. This is empty, or contains type variables with optional bounds,
     * for example {@code <K, V extends K>}.
     */
    String formalTypes;
    /**
     * The name of the builder type as it should appear in source code, or empty if there is no
     * builder type. If class {@code Address} contains {@code @AutoValue.Builder} class Builder
     * then this will typically be {@code "Address.Builder"}.
     */
    String builderTypeName = "";

    String builderTypeCreator = "";


    private static final Template TEMPLATE = parsedTemplateForResource("autovalue.vm");
    ProcessingEnvironment processingEnvironment;

    public AutoValueStepBuilderTemplateVars(ProcessingEnvironment processingEnvironment)
    {
        this.processingEnvironment = processingEnvironment;
    }


    @Override
    Template parsedTemplate()
    {
        return TEMPLATE;
    }
}
