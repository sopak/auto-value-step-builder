
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;

@Generated("cz.jcode.auto.value.step.builder.AutoValueStepBuilderExtension")
public final class AutoValue_NoBuilderAddress<T> extends $AutoValue_NoBuilderAddress<T> {

    AutoValue_NoBuilderAddress(
             T title,
             T street,
            @javax.annotation.Nullable com.google.common.collect.ImmutableList<T> streetParts,
             T city,
             T postcode,
             T countryCode
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

    public interface BuildStep<T> extends java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T>>
    {
        cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T> build();
    }

    public interface BuilderStep<T> {
        OptionalStep<T> optional();
    }

    public interface OptionalStep<T> extends BuildStep<T>
    {
        OptionalStep<T> streetParts(com.google.common.collect.ImmutableList<T> streetParts);
    }

    public interface BuilderLazyStep<T> {
        OptionalLazyStep<T> optional();
    }

    public interface OptionalLazyStep<T> extends BuildStep<T>
    {
        OptionalLazyStep<T> streetParts(java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> streetPartsSupplier);
        OptionalLazyStep<T> streetParts(com.google.common.collect.ImmutableList<T> streetParts);
    }

    public interface TitleStep<T>
    {
        StreetStep<T> title(T title);
    }

    public interface TitleLazyStep<T>
    {
        StreetLazyStep<T> title(java.util.function.Supplier<T> titleSupplier);
        StreetLazyStep<T> title(T title);
    }

    public interface StreetStep<T>
    {
        CityStep<T> street(T street);
    }

    public interface StreetLazyStep<T>
    {
        CityLazyStep<T> street(java.util.function.Supplier<T> streetSupplier);
        CityLazyStep<T> street(T street);
    }

    public interface CityStep<T>
    {
        PostcodeStep<T> city(T city);
    }

    public interface CityLazyStep<T>
    {
        PostcodeLazyStep<T> city(java.util.function.Supplier<T> citySupplier);
        PostcodeLazyStep<T> city(T city);
    }

    public interface PostcodeStep<T>
    {
        CountryCodeStep<T> postcode(T postcode);
    }

    public interface PostcodeLazyStep<T>
    {
        CountryCodeLazyStep<T> postcode(java.util.function.Supplier<T> postcodeSupplier);
        CountryCodeLazyStep<T> postcode(T postcode);
    }

    public interface CountryCodeStep<T>
    {
        BuilderStep<T> countryCode(T countryCode);
    }

    public interface CountryCodeLazyStep<T>
    {
        BuilderLazyStep<T> countryCode(java.util.function.Supplier<T> countryCodeSupplier);
        BuilderLazyStep<T> countryCode(T countryCode);
    }

    public static <T> TitleStep<T> step()
    {
        return StepBuilder.<T>step();
    }

    public static class StepBuilder<T> implements TitleStep<T>, StreetStep<T>, CityStep<T>, PostcodeStep<T>, CountryCodeStep<T>, BuilderStep<T>, OptionalStep<T> {
        private T title;
        private T street;
        private com.google.common.collect.ImmutableList<T> streetParts;
        private T city;
        private T postcode;
        private T countryCode;
        private boolean streetPartsIsSet;
        public static <T> TitleStep<T> step()
        {
            return new StepBuilder<T>();
        }
        @Override
        public StreetStep<T> title(T title)
        {
            if (title == null) {
                throw new NullPointerException("Null title");
            }
            this.title = title;
            return this;
        }
        @Override
        public CityStep<T> street(T street)
        {
            if (street == null) {
                throw new NullPointerException("Null street");
            }
            this.street = street;
            return this;
        }
        @Override
        public PostcodeStep<T> city(T city)
        {
            if (city == null) {
                throw new NullPointerException("Null city");
            }
            this.city = city;
            return this;
        }
        @Override
        public CountryCodeStep<T> postcode(T postcode)
        {
            if (postcode == null) {
                throw new NullPointerException("Null postcode");
            }
            this.postcode = postcode;
            return this;
        }
        @Override
        public BuilderStep<T> countryCode(T countryCode)
        {
            if (countryCode == null) {
                throw new NullPointerException("Null countryCode");
            }
            this.countryCode = countryCode;
            return this;
        }
        @Override
        public OptionalStep<T> streetParts(com.google.common.collect.ImmutableList<T> streetParts)
        {
            this.streetParts = streetParts;
            this.streetPartsIsSet = true;
            return this;
        }
        @Override
        public OptionalStep<T> optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T> build()
        {
            return new AutoValue_NoBuilderAddress<T>(
                    title,
                    street,
                    streetParts,
                    city,
                    postcode,
                    countryCode
                );
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T> get() {
            return build();
        }
    }

    public static <T> TitleLazyStep<T> lazyStep()
    {
        return LazyStepBuilder.<T>lazyStep();
    }

    public static class LazyStepBuilder<T> implements TitleLazyStep<T>, StreetLazyStep<T>, CityLazyStep<T>, PostcodeLazyStep<T>, CountryCodeLazyStep<T>, BuilderLazyStep<T>, OptionalLazyStep<T> {
        private java.util.function.Supplier<T> titleSupplier;
        private T title;
        private java.util.function.Supplier<T> streetSupplier;
        private T street;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> streetPartsSupplier;
        private com.google.common.collect.ImmutableList<T> streetParts;
        private java.util.function.Supplier<T> citySupplier;
        private T city;
        private java.util.function.Supplier<T> postcodeSupplier;
        private T postcode;
        private java.util.function.Supplier<T> countryCodeSupplier;
        private T countryCode;
        private boolean streetPartsIsSet;
        public static <T> TitleLazyStep<T> lazyStep()
        {
            return new LazyStepBuilder<T>();
        }
        @Override
        public StreetLazyStep<T> title(java.util.function.Supplier<T> titleSupplier)
        {
            if (titleSupplier == null) {
                throw new NullPointerException("Null titleSupplier");
            }
            this.title = null;
            this.titleSupplier = titleSupplier;
            return this;
        }
        @Override
        public StreetLazyStep<T> title(T title)
        {
            if (title == null) {
                throw new NullPointerException("Null title");
            }
            this.titleSupplier = null;
            this.title = title;
            return this;
        }
        @Override
        public CityLazyStep<T> street(java.util.function.Supplier<T> streetSupplier)
        {
            if (streetSupplier == null) {
                throw new NullPointerException("Null streetSupplier");
            }
            this.street = null;
            this.streetSupplier = streetSupplier;
            return this;
        }
        @Override
        public CityLazyStep<T> street(T street)
        {
            if (street == null) {
                throw new NullPointerException("Null street");
            }
            this.streetSupplier = null;
            this.street = street;
            return this;
        }
        @Override
        public PostcodeLazyStep<T> city(java.util.function.Supplier<T> citySupplier)
        {
            if (citySupplier == null) {
                throw new NullPointerException("Null citySupplier");
            }
            this.city = null;
            this.citySupplier = citySupplier;
            return this;
        }
        @Override
        public PostcodeLazyStep<T> city(T city)
        {
            if (city == null) {
                throw new NullPointerException("Null city");
            }
            this.citySupplier = null;
            this.city = city;
            return this;
        }
        @Override
        public CountryCodeLazyStep<T> postcode(java.util.function.Supplier<T> postcodeSupplier)
        {
            if (postcodeSupplier == null) {
                throw new NullPointerException("Null postcodeSupplier");
            }
            this.postcode = null;
            this.postcodeSupplier = postcodeSupplier;
            return this;
        }
        @Override
        public CountryCodeLazyStep<T> postcode(T postcode)
        {
            if (postcode == null) {
                throw new NullPointerException("Null postcode");
            }
            this.postcodeSupplier = null;
            this.postcode = postcode;
            return this;
        }
        @Override
        public BuilderLazyStep<T> countryCode(java.util.function.Supplier<T> countryCodeSupplier)
        {
            if (countryCodeSupplier == null) {
                throw new NullPointerException("Null countryCodeSupplier");
            }
            this.countryCode = null;
            this.countryCodeSupplier = countryCodeSupplier;
            return this;
        }
        @Override
        public BuilderLazyStep<T> countryCode(T countryCode)
        {
            if (countryCode == null) {
                throw new NullPointerException("Null countryCode");
            }
            this.countryCodeSupplier = null;
            this.countryCode = countryCode;
            return this;
        }
        @Override
        public OptionalLazyStep<T> streetParts(java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> streetPartsSupplier)
        {
            this.streetParts = null;
            this.streetPartsSupplier = streetPartsSupplier;
            this.streetPartsIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep<T> streetParts(com.google.common.collect.ImmutableList<T> streetParts)
        {
            this.streetPartsSupplier = null;
            this.streetParts = streetParts;
            this.streetPartsIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep<T> optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T> build()
        {
            return new AutoValue_NoBuilderAddress<T>(
                    null == titleSupplier ? title : titleSupplier.get(),
                    null == streetSupplier ? street : streetSupplier.get(),
                    null == streetPartsSupplier ? streetParts : streetPartsSupplier.get(),
                    null == citySupplier ? city : citySupplier.get(),
                    null == postcodeSupplier ? postcode : postcodeSupplier.get(),
                    null == countryCodeSupplier ? countryCode : countryCodeSupplier.get()
                );
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress<T> get() {
            return build();
        }
    }

}

