
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.common.collect.ImmutableList;
import java.util.Date;
import javax.annotation.Generated;

@Generated("cz.jcode.auto.value.step.builder.AutoValueStepBuilderExtension")
public final class AutoValue_Person<T1, T2, T3> extends $AutoValue_Person<T1, T2, T3> {

    AutoValue_Person(
             java.lang.Integer id,
             com.google.common.collect.ImmutableList<T1> names,
             com.google.common.collect.ImmutableList<T1> phones,
             T2 homeAddress,
            @javax.annotation.Nullable T3 workAddress,
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

    public interface BuildStep<T1, T2, T3> extends java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.generic.Person<T1,T2,T3>>
    {
        cz.jcode.auto.value.step.builder.example.generic.Person<T1,T2,T3> build();
    }

    public interface BuilderStep<T1, T2, T3> {
        OptionalStep<T1, T2, T3> optional();
    }

    public interface OptionalStep<T1, T2, T3> extends BuildStep<T1, T2, T3>
    {
        OptionalStep<T1, T2, T3> workAddress(T3 workAddress);
        OptionalStep<T1, T2, T3> birthday(java.util.Date birthday);
    }

    public interface BuilderLazyStep<T1, T2, T3> {
        OptionalLazyStep<T1, T2, T3> optional();
    }

    public interface OptionalLazyStep<T1, T2, T3> extends BuildStep<T1, T2, T3>
    {
        OptionalLazyStep<T1, T2, T3> workAddress(java.util.function.Supplier<T3> workAddressSupplier);
        OptionalLazyStep<T1, T2, T3> workAddress(T3 workAddress);
        OptionalLazyStep<T1, T2, T3> birthday(java.util.function.Supplier<java.util.Date> birthdaySupplier);
        OptionalLazyStep<T1, T2, T3> birthday(java.util.Date birthday);
    }

    public interface IdStep<T1, T2, T3>
    {
        NamesStep<T1, T2, T3> id(java.lang.Integer id);
    }

    public interface IdLazyStep<T1, T2, T3>
    {
        NamesLazyStep<T1, T2, T3> id(java.util.function.Supplier<java.lang.Integer> idSupplier);
        NamesLazyStep<T1, T2, T3> id(java.lang.Integer id);
    }

    public interface NamesStep<T1, T2, T3>
    {
        PhonesStep<T1, T2, T3> names(com.google.common.collect.ImmutableList<T1> names);
    }

    public interface NamesLazyStep<T1, T2, T3>
    {
        PhonesLazyStep<T1, T2, T3> names(java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> namesSupplier);
        PhonesLazyStep<T1, T2, T3> names(com.google.common.collect.ImmutableList<T1> names);
    }

    public interface PhonesStep<T1, T2, T3>
    {
        HomeAddressStep<T1, T2, T3> phones(com.google.common.collect.ImmutableList<T1> phones);
    }

    public interface PhonesLazyStep<T1, T2, T3>
    {
        HomeAddressLazyStep<T1, T2, T3> phones(java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> phonesSupplier);
        HomeAddressLazyStep<T1, T2, T3> phones(com.google.common.collect.ImmutableList<T1> phones);
    }

    public interface HomeAddressStep<T1, T2, T3>
    {
        BuilderStep<T1, T2, T3> homeAddress(T2 homeAddress);
    }

    public interface HomeAddressLazyStep<T1, T2, T3>
    {
        BuilderLazyStep<T1, T2, T3> homeAddress(java.util.function.Supplier<T2> homeAddressSupplier);
        BuilderLazyStep<T1, T2, T3> homeAddress(T2 homeAddress);
    }

    public static <T1, T2, T3> IdStep<T1, T2, T3> step()
    {
        return StepBuilder.<T1, T2, T3>step();
    }

    public static class StepBuilder<T1, T2, T3> implements IdStep<T1, T2, T3>, NamesStep<T1, T2, T3>, PhonesStep<T1, T2, T3>, HomeAddressStep<T1, T2, T3>, BuilderStep<T1, T2, T3>, OptionalStep<T1, T2, T3> {
        private java.lang.Integer id = null;
        private com.google.common.collect.ImmutableList<T1> names = null;
        private com.google.common.collect.ImmutableList<T1> phones = null;
        private T2 homeAddress = null;
        private T3 workAddress = null;
        private java.util.Date birthday = null;
        public static <T1, T2, T3> IdStep<T1, T2, T3> step()
        {
            return new StepBuilder<T1, T2, T3>();
        }
        @Override
        public NamesStep<T1, T2, T3> id(java.lang.Integer id)
        {
            if (id == null) {
                throw new NullPointerException("Null id");
            }
            this.id = id;
            return this;
        }
        @Override
        public PhonesStep<T1, T2, T3> names(com.google.common.collect.ImmutableList<T1> names)
        {
            if (names == null) {
                throw new NullPointerException("Null names");
            }
            this.names = names;
            return this;
        }
        @Override
        public HomeAddressStep<T1, T2, T3> phones(com.google.common.collect.ImmutableList<T1> phones)
        {
            if (phones == null) {
                throw new NullPointerException("Null phones");
            }
            this.phones = phones;
            return this;
        }
        @Override
        public BuilderStep<T1, T2, T3> homeAddress(T2 homeAddress)
        {
            if (homeAddress == null) {
                throw new NullPointerException("Null homeAddress");
            }
            this.homeAddress = homeAddress;
            return this;
        }
        @Override
        public OptionalStep<T1, T2, T3> workAddress(T3 workAddress)
        {
            this.workAddress = workAddress;
            return this;
        }
        @Override
        public OptionalStep<T1, T2, T3> birthday(java.util.Date birthday)
        {
            this.birthday = birthday;
            return this;
        }
        @Override
        public OptionalStep<T1, T2, T3> optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.Person<T1,T2,T3> build()
        {
            return cz.jcode.auto.value.step.builder.example.generic.Person.<T1, T2, T3>builder()
                .id(id)
                .names(names)
                .phones(phones)
                .homeAddress(homeAddress)
                .workAddress(workAddress)
                .birthday(birthday)
                .build();
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.Person<T1,T2,T3> get() {
            return build();
        }
    }

    public static <T1, T2, T3> IdLazyStep<T1, T2, T3> lazyStep()
    {
        return LazyStepBuilder.<T1, T2, T3>lazyStep();
    }

    public static class LazyStepBuilder<T1, T2, T3> implements IdLazyStep<T1, T2, T3>, NamesLazyStep<T1, T2, T3>, PhonesLazyStep<T1, T2, T3>, HomeAddressLazyStep<T1, T2, T3>, BuilderLazyStep<T1, T2, T3>, OptionalLazyStep<T1, T2, T3> {
        private java.util.function.Supplier<java.lang.Integer> idSupplier = null;
        private java.lang.Integer id = null;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> namesSupplier = null;
        private com.google.common.collect.ImmutableList<T1> names = null;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> phonesSupplier = null;
        private com.google.common.collect.ImmutableList<T1> phones = null;
        private java.util.function.Supplier<T2> homeAddressSupplier = null;
        private T2 homeAddress = null;
        private java.util.function.Supplier<T3> workAddressSupplier = null;
        private T3 workAddress = null;
        private java.util.function.Supplier<java.util.Date> birthdaySupplier = null;
        private java.util.Date birthday = null;
        public static <T1, T2, T3> IdLazyStep<T1, T2, T3> lazyStep()
        {
            return new LazyStepBuilder<T1, T2, T3>();
        }
        @Override
        public NamesLazyStep<T1, T2, T3> id(java.util.function.Supplier<java.lang.Integer> idSupplier)
        {
            if (idSupplier == null) {
                throw new NullPointerException("Null idSupplier");
            }
            this.id = null;
            this.idSupplier = idSupplier;
            return this;
        }
        @Override
        public NamesLazyStep<T1, T2, T3> id(java.lang.Integer id)
        {
            if (id == null) {
                throw new NullPointerException("Null id");
            }
            this.idSupplier = null;
            this.id = id;
            return this;
        }
        @Override
        public PhonesLazyStep<T1, T2, T3> names(java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> namesSupplier)
        {
            if (namesSupplier == null) {
                throw new NullPointerException("Null namesSupplier");
            }
            this.names = null;
            this.namesSupplier = namesSupplier;
            return this;
        }
        @Override
        public PhonesLazyStep<T1, T2, T3> names(com.google.common.collect.ImmutableList<T1> names)
        {
            if (names == null) {
                throw new NullPointerException("Null names");
            }
            this.namesSupplier = null;
            this.names = names;
            return this;
        }
        @Override
        public HomeAddressLazyStep<T1, T2, T3> phones(java.util.function.Supplier<com.google.common.collect.ImmutableList<T1>> phonesSupplier)
        {
            if (phonesSupplier == null) {
                throw new NullPointerException("Null phonesSupplier");
            }
            this.phones = null;
            this.phonesSupplier = phonesSupplier;
            return this;
        }
        @Override
        public HomeAddressLazyStep<T1, T2, T3> phones(com.google.common.collect.ImmutableList<T1> phones)
        {
            if (phones == null) {
                throw new NullPointerException("Null phones");
            }
            this.phonesSupplier = null;
            this.phones = phones;
            return this;
        }
        @Override
        public BuilderLazyStep<T1, T2, T3> homeAddress(java.util.function.Supplier<T2> homeAddressSupplier)
        {
            if (homeAddressSupplier == null) {
                throw new NullPointerException("Null homeAddressSupplier");
            }
            this.homeAddress = null;
            this.homeAddressSupplier = homeAddressSupplier;
            return this;
        }
        @Override
        public BuilderLazyStep<T1, T2, T3> homeAddress(T2 homeAddress)
        {
            if (homeAddress == null) {
                throw new NullPointerException("Null homeAddress");
            }
            this.homeAddressSupplier = null;
            this.homeAddress = homeAddress;
            return this;
        }
        @Override
        public OptionalLazyStep<T1, T2, T3> workAddress(java.util.function.Supplier<T3> workAddressSupplier)
        {
            this.workAddressSupplier = workAddressSupplier;
            return this;
        }
        @Override
        public OptionalLazyStep<T1, T2, T3> workAddress(T3 workAddress)
        {
            this.workAddressSupplier = null;
            this.workAddress = workAddress;
            return this;
        }
        @Override
        public OptionalLazyStep<T1, T2, T3> birthday(java.util.function.Supplier<java.util.Date> birthdaySupplier)
        {
            this.birthdaySupplier = birthdaySupplier;
            return this;
        }
        @Override
        public OptionalLazyStep<T1, T2, T3> birthday(java.util.Date birthday)
        {
            this.birthdaySupplier = null;
            this.birthday = birthday;
            return this;
        }
        @Override
        public OptionalLazyStep<T1, T2, T3> optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.Person<T1,T2,T3> build()
        {
            return cz.jcode.auto.value.step.builder.example.generic.Person.<T1, T2, T3>builder()
                .id(null == id ? idSupplier.get() : id)
                .names(null == names ? namesSupplier.get() : names)
                .phones(null == phones ? phonesSupplier.get() : phones)
                .homeAddress(null == homeAddress ? homeAddressSupplier.get() : homeAddress)
                .workAddress(null == workAddress ? (null == workAddressSupplier ? null : workAddressSupplier.get()) : workAddress)
                .birthday(null == birthday ? (null == birthdaySupplier ? null : birthdaySupplier.get()) : birthday)
                .build();
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.Person<T1,T2,T3> get() {
            return build();
        }
    }

}

