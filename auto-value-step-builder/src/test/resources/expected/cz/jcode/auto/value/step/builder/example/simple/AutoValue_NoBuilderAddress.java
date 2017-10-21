
package cz.jcode.auto.value.step.builder.example.simple;

import com.google.common.collect.ImmutableList;
import javax.annotation.Generated;

@Generated("cz.jcode.auto.value.step.builder.AutoValueStepBuilderExtension")
public final class AutoValue_NoBuilderAddress extends $AutoValue_NoBuilderAddress {

    AutoValue_NoBuilderAddress(
             java.lang.String title,
             java.lang.String street,
            @javax.annotation.Nullable com.google.common.collect.ImmutableList<java.lang.String> streetParts,
             java.lang.String city,
             java.lang.String postcode,
             java.lang.String countryCode
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

    public interface BuildStep extends java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.simple.NoBuilderAddress>
    {
        cz.jcode.auto.value.step.builder.example.simple.NoBuilderAddress build();
    }

    public interface BuilderStep {
        OptionalStep optional();
    }

    public interface OptionalStep extends BuildStep
    {
        OptionalStep streetParts(com.google.common.collect.ImmutableList<java.lang.String> streetParts);
    }

    public interface BuilderLazyStep {
        OptionalLazyStep optional();
    }

    public interface OptionalLazyStep extends BuildStep
    {
        OptionalLazyStep streetParts(java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> streetPartsSupplier);
        OptionalLazyStep streetParts(com.google.common.collect.ImmutableList<java.lang.String> streetParts);
    }

    public interface TitleStep
    {
        StreetStep title(java.lang.String title);
    }

    public interface TitleLazyStep
    {
        StreetLazyStep title(java.util.function.Supplier<java.lang.String> titleSupplier);
        StreetLazyStep title(java.lang.String title);
    }

    public interface StreetStep
    {
        CityStep street(java.lang.String street);
    }

    public interface StreetLazyStep
    {
        CityLazyStep street(java.util.function.Supplier<java.lang.String> streetSupplier);
        CityLazyStep street(java.lang.String street);
    }

    public interface CityStep
    {
        PostcodeStep city(java.lang.String city);
    }

    public interface CityLazyStep
    {
        PostcodeLazyStep city(java.util.function.Supplier<java.lang.String> citySupplier);
        PostcodeLazyStep city(java.lang.String city);
    }

    public interface PostcodeStep
    {
        CountryCodeStep postcode(java.lang.String postcode);
    }

    public interface PostcodeLazyStep
    {
        CountryCodeLazyStep postcode(java.util.function.Supplier<java.lang.String> postcodeSupplier);
        CountryCodeLazyStep postcode(java.lang.String postcode);
    }

    public interface CountryCodeStep
    {
        BuilderStep countryCode(java.lang.String countryCode);
    }

    public interface CountryCodeLazyStep
    {
        BuilderLazyStep countryCode(java.util.function.Supplier<java.lang.String> countryCodeSupplier);
        BuilderLazyStep countryCode(java.lang.String countryCode);
    }

    public static TitleStep step()
    {
        return StepBuilder.step();
    }

    public static class StepBuilder implements TitleStep, StreetStep, CityStep, PostcodeStep, CountryCodeStep, BuilderStep, OptionalStep {
        private java.lang.String title;
        private java.lang.String street;
        private com.google.common.collect.ImmutableList<java.lang.String> streetParts;
        private java.lang.String city;
        private java.lang.String postcode;
        private java.lang.String countryCode;
        public static TitleStep step()
        {
            return new StepBuilder();
        }
        @Override
        public StreetStep title(java.lang.String title)
        {
            if (title == null) {
                throw new NullPointerException("Null title");
            }
            this.title = title;
            return this;
        }
        @Override
        public CityStep street(java.lang.String street)
        {
            if (street == null) {
                throw new NullPointerException("Null street");
            }
            this.street = street;
            return this;
        }
        @Override
        public PostcodeStep city(java.lang.String city)
        {
            if (city == null) {
                throw new NullPointerException("Null city");
            }
            this.city = city;
            return this;
        }
        @Override
        public CountryCodeStep postcode(java.lang.String postcode)
        {
            if (postcode == null) {
                throw new NullPointerException("Null postcode");
            }
            this.postcode = postcode;
            return this;
        }
        @Override
        public BuilderStep countryCode(java.lang.String countryCode)
        {
            if (countryCode == null) {
                throw new NullPointerException("Null countryCode");
            }
            this.countryCode = countryCode;
            return this;
        }
        @Override
        public OptionalStep streetParts(com.google.common.collect.ImmutableList<java.lang.String> streetParts)
        {
            this.streetParts = streetParts;
            return this;
        }
        @Override
        public OptionalStep optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.simple.NoBuilderAddress build()
        {
            return new AutoValue_NoBuilderAddress(
                    title,
                    street,
                    streetParts,
                    city,
                    postcode,
                    countryCode
                );
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.simple.NoBuilderAddress get() {
            return build();
        }
    }

    public static TitleLazyStep lazyStep()
    {
        return LazyStepBuilder.lazyStep();
    }

    public static class LazyStepBuilder implements TitleLazyStep, StreetLazyStep, CityLazyStep, PostcodeLazyStep, CountryCodeLazyStep, BuilderLazyStep, OptionalLazyStep {
        private java.util.function.Supplier<java.lang.String> titleSupplier;
        private java.lang.String title;
        private java.util.function.Supplier<java.lang.String> streetSupplier;
        private java.lang.String street;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> streetPartsSupplier;
        private com.google.common.collect.ImmutableList<java.lang.String> streetParts;
        private java.util.function.Supplier<java.lang.String> citySupplier;
        private java.lang.String city;
        private java.util.function.Supplier<java.lang.String> postcodeSupplier;
        private java.lang.String postcode;
        private java.util.function.Supplier<java.lang.String> countryCodeSupplier;
        private java.lang.String countryCode;
        public static TitleLazyStep lazyStep()
        {
            return new LazyStepBuilder();
        }
        @Override
        public StreetLazyStep title(java.util.function.Supplier<java.lang.String> titleSupplier)
        {
            if (titleSupplier == null) {
                throw new NullPointerException("Null titleSupplier");
            }
            this.title = null;
            this.titleSupplier = titleSupplier;
            return this;
        }
        @Override
        public StreetLazyStep title(java.lang.String title)
        {
            if (title == null) {
                throw new NullPointerException("Null title");
            }
            this.titleSupplier = null;
            this.title = title;
            return this;
        }
        @Override
        public CityLazyStep street(java.util.function.Supplier<java.lang.String> streetSupplier)
        {
            if (streetSupplier == null) {
                throw new NullPointerException("Null streetSupplier");
            }
            this.street = null;
            this.streetSupplier = streetSupplier;
            return this;
        }
        @Override
        public CityLazyStep street(java.lang.String street)
        {
            if (street == null) {
                throw new NullPointerException("Null street");
            }
            this.streetSupplier = null;
            this.street = street;
            return this;
        }
        @Override
        public PostcodeLazyStep city(java.util.function.Supplier<java.lang.String> citySupplier)
        {
            if (citySupplier == null) {
                throw new NullPointerException("Null citySupplier");
            }
            this.city = null;
            this.citySupplier = citySupplier;
            return this;
        }
        @Override
        public PostcodeLazyStep city(java.lang.String city)
        {
            if (city == null) {
                throw new NullPointerException("Null city");
            }
            this.citySupplier = null;
            this.city = city;
            return this;
        }
        @Override
        public CountryCodeLazyStep postcode(java.util.function.Supplier<java.lang.String> postcodeSupplier)
        {
            if (postcodeSupplier == null) {
                throw new NullPointerException("Null postcodeSupplier");
            }
            this.postcode = null;
            this.postcodeSupplier = postcodeSupplier;
            return this;
        }
        @Override
        public CountryCodeLazyStep postcode(java.lang.String postcode)
        {
            if (postcode == null) {
                throw new NullPointerException("Null postcode");
            }
            this.postcodeSupplier = null;
            this.postcode = postcode;
            return this;
        }
        @Override
        public BuilderLazyStep countryCode(java.util.function.Supplier<java.lang.String> countryCodeSupplier)
        {
            if (countryCodeSupplier == null) {
                throw new NullPointerException("Null countryCodeSupplier");
            }
            this.countryCode = null;
            this.countryCodeSupplier = countryCodeSupplier;
            return this;
        }
        @Override
        public BuilderLazyStep countryCode(java.lang.String countryCode)
        {
            if (countryCode == null) {
                throw new NullPointerException("Null countryCode");
            }
            this.countryCodeSupplier = null;
            this.countryCode = countryCode;
            return this;
        }
        @Override
        public OptionalLazyStep streetParts(java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> streetPartsSupplier)
        {
            this.streetPartsSupplier = streetPartsSupplier;
            return this;
        }
        @Override
        public OptionalLazyStep streetParts(com.google.common.collect.ImmutableList<java.lang.String> streetParts)
        {
            this.streetPartsSupplier = null;
            this.streetParts = streetParts;
            return this;
        }
        @Override
        public OptionalLazyStep optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.simple.NoBuilderAddress build()
        {
            return new AutoValue_NoBuilderAddress(
                    null == titleSupplier ? title : titleSupplier.get(),
                    null == streetSupplier ? street : streetSupplier.get(),
                    null == streetPartsSupplier ? streetParts : streetPartsSupplier.get(),
                    null == citySupplier ? city : citySupplier.get(),
                    null == postcodeSupplier ? postcode : postcodeSupplier.get(),
                    null == countryCodeSupplier ? countryCode : countryCodeSupplier.get()
                );
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.simple.NoBuilderAddress get() {
            return build();
        }
    }

}

