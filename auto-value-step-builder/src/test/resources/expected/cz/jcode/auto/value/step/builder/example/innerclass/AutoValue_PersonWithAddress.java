
package cz.jcode.auto.value.step.builder.example.innerclass;

import com.google.common.collect.ImmutableList;
import java.util.Date;
import javax.annotation.Generated;

@Generated("cz.jcode.auto.value.step.builder.AutoValueStepBuilderExtension")
public final class AutoValue_PersonWithAddress extends $AutoValue_PersonWithAddress {

    AutoValue_PersonWithAddress(
             java.lang.Integer id,
             com.google.common.collect.ImmutableList<java.lang.String> names,
             com.google.common.collect.ImmutableList<java.lang.String> phones,
             cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address homeAddress,
            @javax.annotation.Nullable cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address workAddress,
            @javax.annotation.Nullable java.util.Date birthday
        ){
        super(
            id,
            names,
            phones,
            homeAddress,
            workAddress,
            birthday
        );
    }

    public interface BuildStep extends java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress>
    {
        cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress build();
    }

    public interface BuilderStep {
        OptionalStep optional();
    }

    public interface OptionalStep extends BuildStep
    {
        OptionalStep workAddress(cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address workAddress);
        OptionalStep birthday(java.util.Date birthday);
    }

    public interface BuilderLazyStep {
        OptionalLazyStep optional();
    }

    public interface OptionalLazyStep extends BuildStep
    {
        OptionalLazyStep workAddress(java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address> workAddressSupplier);
        OptionalLazyStep workAddress(cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address workAddress);
        OptionalLazyStep birthday(java.util.function.Supplier<java.util.Date> birthdaySupplier);
        OptionalLazyStep birthday(java.util.Date birthday);
    }

    public interface IdStep
    {
        NamesStep id(java.lang.Integer id);
    }

    public interface IdLazyStep
    {
        NamesLazyStep id(java.util.function.Supplier<java.lang.Integer> idSupplier);
        NamesLazyStep id(java.lang.Integer id);
    }

    public interface NamesStep
    {
        PhonesStep names(com.google.common.collect.ImmutableList<java.lang.String> names);
    }

    public interface NamesLazyStep
    {
        PhonesLazyStep names(java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> namesSupplier);
        PhonesLazyStep names(com.google.common.collect.ImmutableList<java.lang.String> names);
    }

    public interface PhonesStep
    {
        HomeAddressStep phones(com.google.common.collect.ImmutableList<java.lang.String> phones);
    }

    public interface PhonesLazyStep
    {
        HomeAddressLazyStep phones(java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> phonesSupplier);
        HomeAddressLazyStep phones(com.google.common.collect.ImmutableList<java.lang.String> phones);
    }

    public interface HomeAddressStep
    {
        BuilderStep homeAddress(cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address homeAddress);
    }

    public interface HomeAddressLazyStep
    {
        BuilderLazyStep homeAddress(java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address> homeAddressSupplier);
        BuilderLazyStep homeAddress(cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address homeAddress);
    }

    public static IdStep step()
    {
        return StepBuilder.step();
    }

    public static class StepBuilder implements IdStep, NamesStep, PhonesStep, HomeAddressStep, BuilderStep, OptionalStep {
        private java.lang.Integer id;
        private com.google.common.collect.ImmutableList<java.lang.String> names;
        private com.google.common.collect.ImmutableList<java.lang.String> phones;
        private cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address homeAddress;
        private cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address workAddress;
        private java.util.Date birthday;
        private boolean workAddressIsSet;
        private boolean birthdayIsSet;
        public static IdStep step()
        {
            return new StepBuilder();
        }
        @Override
        public NamesStep id(java.lang.Integer id)
        {
            if (id == null) {
                throw new NullPointerException("Null id");
            }
            this.id = id;
            return this;
        }
        @Override
        public PhonesStep names(com.google.common.collect.ImmutableList<java.lang.String> names)
        {
            if (names == null) {
                throw new NullPointerException("Null names");
            }
            this.names = names;
            return this;
        }
        @Override
        public HomeAddressStep phones(com.google.common.collect.ImmutableList<java.lang.String> phones)
        {
            if (phones == null) {
                throw new NullPointerException("Null phones");
            }
            this.phones = phones;
            return this;
        }
        @Override
        public BuilderStep homeAddress(cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address homeAddress)
        {
            if (homeAddress == null) {
                throw new NullPointerException("Null homeAddress");
            }
            this.homeAddress = homeAddress;
            return this;
        }
        @Override
        public OptionalStep workAddress(cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address workAddress)
        {
            this.workAddress = workAddress;
            this.workAddressIsSet = true;
            return this;
        }
        @Override
        public OptionalStep birthday(java.util.Date birthday)
        {
            this.birthday = birthday;
            this.birthdayIsSet = true;
            return this;
        }
        @Override
        public OptionalStep optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress build()
        {
            PersonWithAddress.Builder builder = cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.builder();
            builder.id(id);
            builder.names(names);
            builder.phones(phones);
            builder.homeAddress(homeAddress);
            if(workAddressIsSet){
                builder.workAddress(workAddress);
            }
            if(birthdayIsSet){
                builder.birthday(birthday);
            }
            return builder.build();
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress get() {
            return build();
        }
    }

    public static IdLazyStep lazyStep()
    {
        return LazyStepBuilder.lazyStep();
    }

    public static class LazyStepBuilder implements IdLazyStep, NamesLazyStep, PhonesLazyStep, HomeAddressLazyStep, BuilderLazyStep, OptionalLazyStep {
        private java.util.function.Supplier<java.lang.Integer> idSupplier;
        private java.lang.Integer id;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> namesSupplier;
        private com.google.common.collect.ImmutableList<java.lang.String> names;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> phonesSupplier;
        private com.google.common.collect.ImmutableList<java.lang.String> phones;
        private java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address> homeAddressSupplier;
        private cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address homeAddress;
        private java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address> workAddressSupplier;
        private cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address workAddress;
        private java.util.function.Supplier<java.util.Date> birthdaySupplier;
        private java.util.Date birthday;
        private boolean workAddressIsSet;
        private boolean birthdayIsSet;
        public static IdLazyStep lazyStep()
        {
            return new LazyStepBuilder();
        }
        @Override
        public NamesLazyStep id(java.util.function.Supplier<java.lang.Integer> idSupplier)
        {
            if (idSupplier == null) {
                throw new NullPointerException("Null idSupplier");
            }
            this.id = null;
            this.idSupplier = idSupplier;
            return this;
        }
        @Override
        public NamesLazyStep id(java.lang.Integer id)
        {
            if (id == null) {
                throw new NullPointerException("Null id");
            }
            this.idSupplier = null;
            this.id = id;
            return this;
        }
        @Override
        public PhonesLazyStep names(java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> namesSupplier)
        {
            if (namesSupplier == null) {
                throw new NullPointerException("Null namesSupplier");
            }
            this.names = null;
            this.namesSupplier = namesSupplier;
            return this;
        }
        @Override
        public PhonesLazyStep names(com.google.common.collect.ImmutableList<java.lang.String> names)
        {
            if (names == null) {
                throw new NullPointerException("Null names");
            }
            this.namesSupplier = null;
            this.names = names;
            return this;
        }
        @Override
        public HomeAddressLazyStep phones(java.util.function.Supplier<com.google.common.collect.ImmutableList<java.lang.String>> phonesSupplier)
        {
            if (phonesSupplier == null) {
                throw new NullPointerException("Null phonesSupplier");
            }
            this.phones = null;
            this.phonesSupplier = phonesSupplier;
            return this;
        }
        @Override
        public HomeAddressLazyStep phones(com.google.common.collect.ImmutableList<java.lang.String> phones)
        {
            if (phones == null) {
                throw new NullPointerException("Null phones");
            }
            this.phonesSupplier = null;
            this.phones = phones;
            return this;
        }
        @Override
        public BuilderLazyStep homeAddress(java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address> homeAddressSupplier)
        {
            if (homeAddressSupplier == null) {
                throw new NullPointerException("Null homeAddressSupplier");
            }
            this.homeAddress = null;
            this.homeAddressSupplier = homeAddressSupplier;
            return this;
        }
        @Override
        public BuilderLazyStep homeAddress(cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address homeAddress)
        {
            if (homeAddress == null) {
                throw new NullPointerException("Null homeAddress");
            }
            this.homeAddressSupplier = null;
            this.homeAddress = homeAddress;
            return this;
        }
        @Override
        public OptionalLazyStep workAddress(java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address> workAddressSupplier)
        {
            this.workAddress = null;
            this.workAddressSupplier = workAddressSupplier;
            this.workAddressIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep workAddress(cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.Address workAddress)
        {
            this.workAddressSupplier = null;
            this.workAddress = workAddress;
            this.workAddressIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep birthday(java.util.function.Supplier<java.util.Date> birthdaySupplier)
        {
            this.birthday = null;
            this.birthdaySupplier = birthdaySupplier;
            this.birthdayIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep birthday(java.util.Date birthday)
        {
            this.birthdaySupplier = null;
            this.birthday = birthday;
            this.birthdayIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress build()
        {
            PersonWithAddress.Builder builder = cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress.builder();
            builder.id(null == idSupplier ? id : idSupplier.get());
            builder.names(null == namesSupplier ? names : namesSupplier.get());
            builder.phones(null == phonesSupplier ? phones : phonesSupplier.get());
            builder.homeAddress(null == homeAddressSupplier ? homeAddress : homeAddressSupplier.get());
            if(workAddressIsSet){
                builder.workAddress(null == workAddressSupplier ? workAddress : workAddressSupplier.get());
            }
            if(birthdayIsSet){
                builder.birthday(null == birthdaySupplier ? birthday : birthdaySupplier.get());
            }
            return builder.build();
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress get() {
            return build();
        }
    }

}

