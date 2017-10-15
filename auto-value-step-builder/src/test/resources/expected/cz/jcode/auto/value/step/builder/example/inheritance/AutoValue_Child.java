
package cz.jcode.auto.value.step.builder.example.inheritance;

import javax.annotation.Generated;

@Generated("cz.jcode.auto.value.step.builder.AutoValueStepBuilderExtension")
public final class AutoValue_Child extends $AutoValue_Child {

    AutoValue_Child(
             java.lang.Integer parentNumber,
             java.lang.Integer childNumber
        ){
        super(
            parentNumber,
            childNumber
        );
    }

    public interface BuildStep extends java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.inheritance.Child>
    {
        cz.jcode.auto.value.step.builder.example.inheritance.Child build();
    }

    public interface BuilderStep extends BuildStep {
    }

    public interface BuilderLazyStep extends BuildStep {
    }

    public interface ParentNumberStep
    {
        ChildNumberStep parentNumber(java.lang.Integer parentNumber);
    }

    public interface ParentNumberLazyStep
    {
        ChildNumberLazyStep parentNumber(java.util.function.Supplier<java.lang.Integer> parentNumberSupplier);
        ChildNumberLazyStep parentNumber(java.lang.Integer parentNumber);
    }

    public interface ChildNumberStep
    {
        BuilderStep childNumber(java.lang.Integer childNumber);
    }

    public interface ChildNumberLazyStep
    {
        BuilderLazyStep childNumber(java.util.function.Supplier<java.lang.Integer> childNumberSupplier);
        BuilderLazyStep childNumber(java.lang.Integer childNumber);
    }

    public static ParentNumberStep step()
    {
        return StepBuilder.step();
    }

    public static class StepBuilder implements ParentNumberStep, ChildNumberStep, BuilderStep {
        private java.lang.Integer parentNumber = null;
        private java.lang.Integer childNumber = null;
        public static ParentNumberStep step()
        {
            return new StepBuilder();
        }
        @Override
        public ChildNumberStep parentNumber(java.lang.Integer parentNumber)
        {
            if (parentNumber == null) {
                throw new NullPointerException("Null parentNumber");
            }
            this.parentNumber = parentNumber;
            return this;
        }
        @Override
        public BuilderStep childNumber(java.lang.Integer childNumber)
        {
            if (childNumber == null) {
                throw new NullPointerException("Null childNumber");
            }
            this.childNumber = childNumber;
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.inheritance.Child build()
        {
            return cz.jcode.auto.value.step.builder.example.inheritance.Child.builder()
                .parentNumber(parentNumber)
                .childNumber(childNumber)
                .build();
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.inheritance.Child get() {
            return build();
        }
    }

    public static ParentNumberLazyStep lazyStep()
    {
        return LazyStepBuilder.lazyStep();
    }

    public static class LazyStepBuilder implements ParentNumberLazyStep, ChildNumberLazyStep, BuilderLazyStep {
        private java.util.function.Supplier<java.lang.Integer> parentNumberSupplier = null;
        private java.lang.Integer parentNumber = null;
        private java.util.function.Supplier<java.lang.Integer> childNumberSupplier = null;
        private java.lang.Integer childNumber = null;
        public static ParentNumberLazyStep lazyStep()
        {
            return new LazyStepBuilder();
        }
        @Override
        public ChildNumberLazyStep parentNumber(java.util.function.Supplier<java.lang.Integer> parentNumberSupplier)
        {
            if (parentNumberSupplier == null) {
                throw new NullPointerException("Null parentNumberSupplier");
            }
            this.parentNumber = null;
            this.parentNumberSupplier = parentNumberSupplier;
            return this;
        }
        @Override
        public ChildNumberLazyStep parentNumber(java.lang.Integer parentNumber)
        {
            if (parentNumber == null) {
                throw new NullPointerException("Null parentNumber");
            }
            this.parentNumberSupplier = null;
            this.parentNumber = parentNumber;
            return this;
        }
        @Override
        public BuilderLazyStep childNumber(java.util.function.Supplier<java.lang.Integer> childNumberSupplier)
        {
            if (childNumberSupplier == null) {
                throw new NullPointerException("Null childNumberSupplier");
            }
            this.childNumber = null;
            this.childNumberSupplier = childNumberSupplier;
            return this;
        }
        @Override
        public BuilderLazyStep childNumber(java.lang.Integer childNumber)
        {
            if (childNumber == null) {
                throw new NullPointerException("Null childNumber");
            }
            this.childNumberSupplier = null;
            this.childNumber = childNumber;
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.inheritance.Child build()
        {
            return cz.jcode.auto.value.step.builder.example.inheritance.Child.builder()
                .parentNumber(null == parentNumber ? parentNumberSupplier.get() : parentNumber)
                .childNumber(null == childNumber ? childNumberSupplier.get() : childNumber)
                .build();
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.inheritance.Child get() {
            return build();
        }
    }

}

