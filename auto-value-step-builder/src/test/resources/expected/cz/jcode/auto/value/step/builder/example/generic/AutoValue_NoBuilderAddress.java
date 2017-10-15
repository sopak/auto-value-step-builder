
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;

@Generated("cz.jcode.auto.value.step.builder.AutoValueStepBuilderExtension")
public final class AutoValue_NoBuilderAddress<T1> extends $AutoValue_NoBuilderAddress<T1> {

    AutoValue_NoBuilderAddress(
             T1 title,
             T1 street,
            @javax.annotation.Nullable com.google.common.collect.ImmutableList<T1> streetParts,
             T1 city,
             T1 postcode,
             T1 countryCode
        ){
        super(
            title,
            street,
            streetParts,
            city,
            postcode,
            countryCode
        );
    }

    public interface BuildStep<T1> extends java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T1>>
    {
        cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T1> build();
    }

    public interface BuilderStep<T1> {
        OptionalStep<T1> optional();
    }

    public interface OptionalStep<T1> extends BuildStep<T1>
    {
        OptionalStep<T1> streetParts(com.google.common.collect.ImmutableList<T1> streetParts);
    }

    public interface BuilderLazyStep<T1> {
        OptionalLazyStep<T1> optional();
    }

    public interface OptionalLazyStep<T1> extends BuildStep<T1>
    {
        OptionalLazyStep<T1> streetParts(java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> streetPartsSupplier);
        OptionalLazyStep<T1> streetParts(com.google.common.collect.ImmutableList<T1> streetParts);
    }

    public interface TitleStep<T1>
    {
        StreetStep<T1> title(T1 title);
    }

    public interface TitleLazyStep<T1>
    {
        StreetLazyStep<T1> title(java.util.function.Supplier<T1> titleSupplier);
        StreetLazyStep<T1> title(T1 title);
    }

    public interface StreetStep<T1>
    {
        CityStep<T1> street(T1 street);
    }

    public interface StreetLazyStep<T1>
    {
        CityLazyStep<T1> street(java.util.function.Supplier<T1> streetSupplier);
        CityLazyStep<T1> street(T1 street);
    }

    public interface CityStep<T1>
    {
        PostcodeStep<T1> city(T1 city);
    }

    public interface CityLazyStep<T1>
    {
        PostcodeLazyStep<T1> city(java.util.function.Supplier<T1> citySupplier);
        PostcodeLazyStep<T1> city(T1 city);
    }

    public interface PostcodeStep<T1>
    {
        CountryCodeStep<T1> postcode(T1 postcode);
    }

    public interface PostcodeLazyStep<T1>
    {
        CountryCodeLazyStep<T1> postcode(java.util.function.Supplier<T1> postcodeSupplier);
        CountryCodeLazyStep<T1> postcode(T1 postcode);
    }

    public interface CountryCodeStep<T1>
    {
        BuilderStep<T1> countryCode(T1 countryCode);
    }

    public interface CountryCodeLazyStep<T1>
    {
        BuilderLazyStep<T1> countryCode(java.util.function.Supplier<T1> countryCodeSupplier);
        BuilderLazyStep<T1> countryCode(T1 countryCode);
    }

    public static <T1> TitleStep<T1> step()
    {
        return StepBuilder.<T1>step();
    }

    public static class StepBuilder<T1> implements TitleStep<T1>, StreetStep<T1>, CityStep<T1>, PostcodeStep<T1>, CountryCodeStep<T1>, BuilderStep<T1>, OptionalStep<T1> {
        private T1 title = null;
        private T1 street = null;
        private com.google.common.collect.ImmutableList<T1> streetParts = null;
        private T1 city = null;
        private T1 postcode = null;
        private T1 countryCode = null;
        public static <T1> TitleStep<T1> step()
        {
            return new StepBuilder<T1>();
        }
        @Override
        public StreetStep<T1> title(T1 title)
        {
            if (title == null) {
                throw new NullPointerException("Null title");
            }
            this.title = title;
            return this;
        }
        @Override
        public CityStep<T1> street(T1 street)
        {
            if (street == null) {
                throw new NullPointerException("Null street");
            }
            this.street = street;
            return this;
        }
        @Override
        public PostcodeStep<T1> city(T1 city)
        {
            if (city == null) {
                throw new NullPointerException("Null city");
            }
            this.city = city;
            return this;
        }
        @Override
        public CountryCodeStep<T1> postcode(T1 postcode)
        {
            if (postcode == null) {
                throw new NullPointerException("Null postcode");
            }
            this.postcode = postcode;
            return this;
        }
        @Override
        public BuilderStep<T1> countryCode(T1 countryCode)
        {
            if (countryCode == null) {
                throw new NullPointerException("Null countryCode");
            }
            this.countryCode = countryCode;
            return this;
        }
        @Override
        public OptionalStep<T1> streetParts(com.google.common.collect.ImmutableList<T1> streetParts)
        {
            this.streetParts = streetParts;
            return this;
        }
        @Override
        public OptionalStep<T1> optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T1> build()
        {
            return new AutoValue_NoBuilderAddress<T1>(
                    title,
                    street,
                    streetParts,
                    city,
                    postcode,
                    countryCode
                );
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T1> get() {
            return build();
        }
    }

    public static <T1> TitleLazyStep<T1> lazyStep()
    {
        return LazyStepBuilder.<T1>lazyStep();
    }

    public static class LazyStepBuilder<T1> implements TitleLazyStep<T1>, StreetLazyStep<T1>, CityLazyStep<T1>, PostcodeLazyStep<T1>, CountryCodeLazyStep<T1>, BuilderLazyStep<T1>, OptionalLazyStep<T1> {
        private java.util.function.Supplier<T1> titleSupplier = null;
        private T1 title = null;
        private java.util.function.Supplier<T1> streetSupplier = null;
        private T1 street = null;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> streetPartsSupplier = null;
        private com.google.common.collect.ImmutableList<T1> streetParts = null;
        private java.util.function.Supplier<T1> citySupplier = null;
        private T1 city = null;
        private java.util.function.Supplier<T1> postcodeSupplier = null;
        private T1 postcode = null;
        private java.util.function.Supplier<T1> countryCodeSupplier = null;
        private T1 countryCode = null;
        public static <T1> TitleLazyStep<T1> lazyStep()
        {
            return new LazyStepBuilder<T1>();
        }
        @Override
        public StreetLazyStep<T1> title(java.util.function.Supplier<T1> titleSupplier)
        {
            if (titleSupplier == null) {
                throw new NullPointerException("Null titleSupplier");
            }
            this.title = null;
            this.titleSupplier = titleSupplier;
            return this;
        }
        @Override
        public StreetLazyStep<T1> title(T1 title)
        {
            if (title == null) {
                throw new NullPointerException("Null title");
            }
            this.titleSupplier = null;
            this.title = title;
            return this;
        }
        @Override
        public CityLazyStep<T1> street(java.util.function.Supplier<T1> streetSupplier)
        {
            if (streetSupplier == null) {
                throw new NullPointerException("Null streetSupplier");
            }
            this.street = null;
            this.streetSupplier = streetSupplier;
            return this;
        }
        @Override
        public CityLazyStep<T1> street(T1 street)
        {
            if (street == null) {
                throw new NullPointerException("Null street");
            }
            this.streetSupplier = null;
            this.street = street;
            return this;
        }
        @Override
        public PostcodeLazyStep<T1> city(java.util.function.Supplier<T1> citySupplier)
        {
            if (citySupplier == null) {
                throw new NullPointerException("Null citySupplier");
            }
            this.city = null;
            this.citySupplier = citySupplier;
            return this;
        }
        @Override
        public PostcodeLazyStep<T1> city(T1 city)
        {
            if (city == null) {
                throw new NullPointerException("Null city");
            }
            this.citySupplier = null;
            this.city = city;
            return this;
        }
        @Override
        public CountryCodeLazyStep<T1> postcode(java.util.function.Supplier<T1> postcodeSupplier)
        {
            if (postcodeSupplier == null) {
                throw new NullPointerException("Null postcodeSupplier");
            }
            this.postcode = null;
            this.postcodeSupplier = postcodeSupplier;
            return this;
        }
        @Override
        public CountryCodeLazyStep<T1> postcode(T1 postcode)
        {
            if (postcode == null) {
                throw new NullPointerException("Null postcode");
            }
            this.postcodeSupplier = null;
            this.postcode = postcode;
            return this;
        }
        @Override
        public BuilderLazyStep<T1> countryCode(java.util.function.Supplier<T1> countryCodeSupplier)
        {
            if (countryCodeSupplier == null) {
                throw new NullPointerException("Null countryCodeSupplier");
            }
            this.countryCode = null;
            this.countryCodeSupplier = countryCodeSupplier;
            return this;
        }
        @Override
        public BuilderLazyStep<T1> countryCode(T1 countryCode)
        {
            if (countryCode == null) {
                throw new NullPointerException("Null countryCode");
            }
            this.countryCodeSupplier = null;
            this.countryCode = countryCode;
            return this;
        }
        @Override
        public OptionalLazyStep<T1> streetParts(java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> streetPartsSupplier)
        {
            this.streetPartsSupplier = streetPartsSupplier;
            return this;
        }
        @Override
        public OptionalLazyStep<T1> streetParts(com.google.common.collect.ImmutableList<T1> streetParts)
        {
            this.streetPartsSupplier = null;
            this.streetParts = streetParts;
            return this;
        }
        @Override
        public OptionalLazyStep<T1> optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T1> build()
        {
            return new AutoValue_NoBuilderAddress<T1>(
                    null == title ? (null == titleSupplier ? null : titleSupplier.get()) : title,
                    null == street ? (null == streetSupplier ? null : streetSupplier.get()) : street,
                    null == streetParts ? (null == streetPartsSupplier ? null : streetPartsSupplier.get()) : streetParts,
                    null == city ? (null == citySupplier ? null : citySupplier.get()) : city,
                    null == postcode ? (null == postcodeSupplier ? null : postcodeSupplier.get()) : postcode,
                    null == countryCode ? (null == countryCodeSupplier ? null : countryCodeSupplier.get()) : countryCode
                );
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T1> get() {
            return build();
        }
    }

}

