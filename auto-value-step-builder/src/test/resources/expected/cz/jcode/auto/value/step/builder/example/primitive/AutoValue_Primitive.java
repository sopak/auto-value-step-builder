
package cz.jcode.auto.value.step.builder.example.primitive;

import javax.annotation.Generated;

@Generated("cz.jcode.auto.value.step.builder.AutoValueStepBuilderExtension")
public final class AutoValue_Primitive extends $AutoValue_Primitive {

    AutoValue_Primitive(
             int primitiveInt,
             long primitiveLong,
             double primitiveDouble,
             float primitiveFloat,
             boolean primitiveBoolean,
             byte primitiveByte,
             char primitiveChar
        ){
        super(
            primitiveInt,
            primitiveLong,
            primitiveDouble,
            primitiveFloat,
            primitiveBoolean,
            primitiveByte,
            primitiveChar
        );
    }

    public interface BuildStep extends java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.primitive.Primitive>
    {
        cz.jcode.auto.value.step.builder.example.primitive.Primitive build();
    }

    public interface BuilderStep extends BuildStep {
    }

    public interface BuilderLazyStep extends BuildStep {
    }

    public interface PrimitiveIntStep
    {
        PrimitiveLongStep primitiveInt(int primitiveInt);
    }

    public interface PrimitiveIntLazyStep
    {
        PrimitiveLongLazyStep primitiveInt(java.util.function.Supplier<java.lang.Integer> primitiveIntSupplier);
        PrimitiveLongLazyStep primitiveInt(int primitiveInt);
    }

    public interface PrimitiveLongStep
    {
        PrimitiveDoubleStep primitiveLong(long primitiveLong);
    }

    public interface PrimitiveLongLazyStep
    {
        PrimitiveDoubleLazyStep primitiveLong(java.util.function.Supplier<java.lang.Long> primitiveLongSupplier);
        PrimitiveDoubleLazyStep primitiveLong(long primitiveLong);
    }

    public interface PrimitiveDoubleStep
    {
        PrimitiveFloatStep primitiveDouble(double primitiveDouble);
    }

    public interface PrimitiveDoubleLazyStep
    {
        PrimitiveFloatLazyStep primitiveDouble(java.util.function.Supplier<java.lang.Double> primitiveDoubleSupplier);
        PrimitiveFloatLazyStep primitiveDouble(double primitiveDouble);
    }

    public interface PrimitiveFloatStep
    {
        PrimitiveBooleanStep primitiveFloat(float primitiveFloat);
    }

    public interface PrimitiveFloatLazyStep
    {
        PrimitiveBooleanLazyStep primitiveFloat(java.util.function.Supplier<java.lang.Float> primitiveFloatSupplier);
        PrimitiveBooleanLazyStep primitiveFloat(float primitiveFloat);
    }

    public interface PrimitiveBooleanStep
    {
        PrimitiveByteStep primitiveBoolean(boolean primitiveBoolean);
    }

    public interface PrimitiveBooleanLazyStep
    {
        PrimitiveByteLazyStep primitiveBoolean(java.util.function.Supplier<java.lang.Boolean> primitiveBooleanSupplier);
        PrimitiveByteLazyStep primitiveBoolean(boolean primitiveBoolean);
    }

    public interface PrimitiveByteStep
    {
        PrimitiveCharStep primitiveByte(byte primitiveByte);
    }

    public interface PrimitiveByteLazyStep
    {
        PrimitiveCharLazyStep primitiveByte(java.util.function.Supplier<java.lang.Byte> primitiveByteSupplier);
        PrimitiveCharLazyStep primitiveByte(byte primitiveByte);
    }

    public interface PrimitiveCharStep
    {
        BuilderStep primitiveChar(char primitiveChar);
    }

    public interface PrimitiveCharLazyStep
    {
        BuilderLazyStep primitiveChar(java.util.function.Supplier<java.lang.Character> primitiveCharSupplier);
        BuilderLazyStep primitiveChar(char primitiveChar);
    }

    public static PrimitiveIntStep step()
    {
        return StepBuilder.step();
    }

    public static class StepBuilder implements PrimitiveIntStep, PrimitiveLongStep, PrimitiveDoubleStep, PrimitiveFloatStep, PrimitiveBooleanStep, PrimitiveByteStep, PrimitiveCharStep, BuilderStep {
        private int primitiveInt;
        private long primitiveLong;
        private double primitiveDouble;
        private float primitiveFloat;
        private boolean primitiveBoolean;
        private byte primitiveByte;
        private char primitiveChar;
        public static PrimitiveIntStep step()
        {
            return new StepBuilder();
        }
        @Override
        public PrimitiveLongStep primitiveInt(int primitiveInt)
        {
            this.primitiveInt = primitiveInt;
            return this;
        }
        @Override
        public PrimitiveDoubleStep primitiveLong(long primitiveLong)
        {
            this.primitiveLong = primitiveLong;
            return this;
        }
        @Override
        public PrimitiveFloatStep primitiveDouble(double primitiveDouble)
        {
            this.primitiveDouble = primitiveDouble;
            return this;
        }
        @Override
        public PrimitiveBooleanStep primitiveFloat(float primitiveFloat)
        {
            this.primitiveFloat = primitiveFloat;
            return this;
        }
        @Override
        public PrimitiveByteStep primitiveBoolean(boolean primitiveBoolean)
        {
            this.primitiveBoolean = primitiveBoolean;
            return this;
        }
        @Override
        public PrimitiveCharStep primitiveByte(byte primitiveByte)
        {
            this.primitiveByte = primitiveByte;
            return this;
        }
        @Override
        public BuilderStep primitiveChar(char primitiveChar)
        {
            this.primitiveChar = primitiveChar;
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.primitive.Primitive build()
        {
            return new AutoValue_Primitive(
                    primitiveInt,
                    primitiveLong,
                    primitiveDouble,
                    primitiveFloat,
                    primitiveBoolean,
                    primitiveByte,
                    primitiveChar
                );
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.primitive.Primitive get() {
            return build();
        }
    }

    public static PrimitiveIntLazyStep lazyStep()
    {
        return LazyStepBuilder.lazyStep();
    }

    public static class LazyStepBuilder implements PrimitiveIntLazyStep, PrimitiveLongLazyStep, PrimitiveDoubleLazyStep, PrimitiveFloatLazyStep, PrimitiveBooleanLazyStep, PrimitiveByteLazyStep, PrimitiveCharLazyStep, BuilderLazyStep {
        private java.util.function.Supplier<java.lang.Integer> primitiveIntSupplier;
        private int primitiveInt;
        private java.util.function.Supplier<java.lang.Long> primitiveLongSupplier;
        private long primitiveLong;
        private java.util.function.Supplier<java.lang.Double> primitiveDoubleSupplier;
        private double primitiveDouble;
        private java.util.function.Supplier<java.lang.Float> primitiveFloatSupplier;
        private float primitiveFloat;
        private java.util.function.Supplier<java.lang.Boolean> primitiveBooleanSupplier;
        private boolean primitiveBoolean;
        private java.util.function.Supplier<java.lang.Byte> primitiveByteSupplier;
        private byte primitiveByte;
        private java.util.function.Supplier<java.lang.Character> primitiveCharSupplier;
        private char primitiveChar;
        public static PrimitiveIntLazyStep lazyStep()
        {
            return new LazyStepBuilder();
        }
        @Override
        public PrimitiveLongLazyStep primitiveInt(java.util.function.Supplier<java.lang.Integer> primitiveIntSupplier)
        {
            this.primitiveIntSupplier = primitiveIntSupplier;
            return this;
        }
        @Override
        public PrimitiveLongLazyStep primitiveInt(int primitiveInt)
        {
            this.primitiveIntSupplier = null;
            this.primitiveInt = primitiveInt;
            return this;
        }
        @Override
        public PrimitiveDoubleLazyStep primitiveLong(java.util.function.Supplier<java.lang.Long> primitiveLongSupplier)
        {
            this.primitiveLongSupplier = primitiveLongSupplier;
            return this;
        }
        @Override
        public PrimitiveDoubleLazyStep primitiveLong(long primitiveLong)
        {
            this.primitiveLongSupplier = null;
            this.primitiveLong = primitiveLong;
            return this;
        }
        @Override
        public PrimitiveFloatLazyStep primitiveDouble(java.util.function.Supplier<java.lang.Double> primitiveDoubleSupplier)
        {
            this.primitiveDoubleSupplier = primitiveDoubleSupplier;
            return this;
        }
        @Override
        public PrimitiveFloatLazyStep primitiveDouble(double primitiveDouble)
        {
            this.primitiveDoubleSupplier = null;
            this.primitiveDouble = primitiveDouble;
            return this;
        }
        @Override
        public PrimitiveBooleanLazyStep primitiveFloat(java.util.function.Supplier<java.lang.Float> primitiveFloatSupplier)
        {
            this.primitiveFloatSupplier = primitiveFloatSupplier;
            return this;
        }
        @Override
        public PrimitiveBooleanLazyStep primitiveFloat(float primitiveFloat)
        {
            this.primitiveFloatSupplier = null;
            this.primitiveFloat = primitiveFloat;
            return this;
        }
        @Override
        public PrimitiveByteLazyStep primitiveBoolean(java.util.function.Supplier<java.lang.Boolean> primitiveBooleanSupplier)
        {
            this.primitiveBooleanSupplier = primitiveBooleanSupplier;
            return this;
        }
        @Override
        public PrimitiveByteLazyStep primitiveBoolean(boolean primitiveBoolean)
        {
            this.primitiveBooleanSupplier = null;
            this.primitiveBoolean = primitiveBoolean;
            return this;
        }
        @Override
        public PrimitiveCharLazyStep primitiveByte(java.util.function.Supplier<java.lang.Byte> primitiveByteSupplier)
        {
            this.primitiveByteSupplier = primitiveByteSupplier;
            return this;
        }
        @Override
        public PrimitiveCharLazyStep primitiveByte(byte primitiveByte)
        {
            this.primitiveByteSupplier = null;
            this.primitiveByte = primitiveByte;
            return this;
        }
        @Override
        public BuilderLazyStep primitiveChar(java.util.function.Supplier<java.lang.Character> primitiveCharSupplier)
        {
            this.primitiveCharSupplier = primitiveCharSupplier;
            return this;
        }
        @Override
        public BuilderLazyStep primitiveChar(char primitiveChar)
        {
            this.primitiveCharSupplier = null;
            this.primitiveChar = primitiveChar;
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.primitive.Primitive build()
        {
            return new AutoValue_Primitive(
                    null == primitiveIntSupplier ? primitiveInt : primitiveIntSupplier.get(),
                    null == primitiveLongSupplier ? primitiveLong : primitiveLongSupplier.get(),
                    null == primitiveDoubleSupplier ? primitiveDouble : primitiveDoubleSupplier.get(),
                    null == primitiveFloatSupplier ? primitiveFloat : primitiveFloatSupplier.get(),
                    null == primitiveBooleanSupplier ? primitiveBoolean : primitiveBooleanSupplier.get(),
                    null == primitiveByteSupplier ? primitiveByte : primitiveByteSupplier.get(),
                    null == primitiveCharSupplier ? primitiveChar : primitiveCharSupplier.get()
                );
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.primitive.Primitive get() {
            return build();
        }
    }

}

