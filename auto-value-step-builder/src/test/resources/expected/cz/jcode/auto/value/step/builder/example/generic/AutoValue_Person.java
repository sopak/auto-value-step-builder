
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.common.collect.ImmutableList;
import java.util.Date;
import javax.annotation.Generated;

@Generated("cz.jcode.auto.value.step.builder.AutoValueStepBuilderExtension")
public final class AutoValue_Person<T, H, W> extends $AutoValue_Person<T, H, W> {

    AutoValue_Person(
             java.lang.Integer id,
             com.google.common.collect.ImmutableList<T> names,
             com.google.common.collect.ImmutableList<T> phones,
             H homeAddress,
            @javax.annotation.Nullable W workAddress,
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

    public interface BuildStep<T, H, W> extends java.util.function.Supplier<cz.jcode.auto.value.step.builder.example.generic.Person<T,H,W>>
    {
        cz.jcode.auto.value.step.builder.example.generic.Person<T,H,W> build();
    }

    public interface BuilderStep<T, H, W> {
        OptionalStep<T, H, W> optional();
    }

    public interface OptionalStep<T, H, W> extends BuildStep<T, H, W>
    {
        OptionalStep<T, H, W> workAddress(W workAddress);
        OptionalStep<T, H, W> birthday(java.util.Date birthday);
    }

    public interface BuilderLazyStep<T, H, W> {
        OptionalLazyStep<T, H, W> optional();
    }

    public interface OptionalLazyStep<T, H, W> extends BuildStep<T, H, W>
    {
        OptionalLazyStep<T, H, W> workAddress(java.util.function.Supplier<W> workAddressSupplier);
        OptionalLazyStep<T, H, W> workAddress(W workAddress);
        OptionalLazyStep<T, H, W> birthday(java.util.function.Supplier<java.util.Date> birthdaySupplier);
        OptionalLazyStep<T, H, W> birthday(java.util.Date birthday);
    }

    public interface IdStep<T, H, W>
    {
        NamesStep<T, H, W> id(java.lang.Integer id);
    }

    public interface IdLazyStep<T, H, W>
    {
        NamesLazyStep<T, H, W> id(java.util.function.Supplier<java.lang.Integer> idSupplier);
        NamesLazyStep<T, H, W> id(java.lang.Integer id);
    }

    public interface NamesStep<T, H, W>
    {
        PhonesStep<T, H, W> names(com.google.common.collect.ImmutableList<T> names);
    }

    public interface NamesLazyStep<T, H, W>
    {
        PhonesLazyStep<T, H, W> names(java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> namesSupplier);
        PhonesLazyStep<T, H, W> names(com.google.common.collect.ImmutableList<T> names);
    }

    public interface PhonesStep<T, H, W>
    {
        HomeAddressStep<T, H, W> phones(com.google.common.collect.ImmutableList<T> phones);
    }

    public interface PhonesLazyStep<T, H, W>
    {
        HomeAddressLazyStep<T, H, W> phones(java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> phonesSupplier);
        HomeAddressLazyStep<T, H, W> phones(com.google.common.collect.ImmutableList<T> phones);
    }

    public interface HomeAddressStep<T, H, W>
    {
        BuilderStep<T, H, W> homeAddress(H homeAddress);
    }

    public interface HomeAddressLazyStep<T, H, W>
    {
        BuilderLazyStep<T, H, W> homeAddress(java.util.function.Supplier<H> homeAddressSupplier);
        BuilderLazyStep<T, H, W> homeAddress(H homeAddress);
    }

    public static <T, H, W> IdStep<T, H, W> step()
    {
        return StepBuilder.<T, H, W>step();
    }

    public static class StepBuilder<T, H, W> implements IdStep<T, H, W>, NamesStep<T, H, W>, PhonesStep<T, H, W>, HomeAddressStep<T, H, W>, BuilderStep<T, H, W>, OptionalStep<T, H, W> {
        private java.lang.Integer id;
        private com.google.common.collect.ImmutableList<T> names;
        private com.google.common.collect.ImmutableList<T> phones;
        private H homeAddress;
        private W workAddress;
        private java.util.Date birthday;
        private boolean workAddressIsSet;
        private boolean birthdayIsSet;
        public static <T, H, W> IdStep<T, H, W> step()
        {
            return new StepBuilder<T, H, W>();
        }
        @Override
        public NamesStep<T, H, W> id(java.lang.Integer id)
        {
            if (id == null) {
                throw new NullPointerException("Null id");
            }
            this.id = id;
            return this;
        }
        @Override
        public PhonesStep<T, H, W> names(com.google.common.collect.ImmutableList<T> names)
        {
            if (names == null) {
                throw new NullPointerException("Null names");
            }
            this.names = names;
            return this;
        }
        @Override
        public HomeAddressStep<T, H, W> phones(com.google.common.collect.ImmutableList<T> phones)
        {
            if (phones == null) {
                throw new NullPointerException("Null phones");
            }
            this.phones = phones;
            return this;
        }
        @Override
        public BuilderStep<T, H, W> homeAddress(H homeAddress)
        {
            if (homeAddress == null) {
                throw new NullPointerException("Null homeAddress");
            }
            this.homeAddress = homeAddress;
            return this;
        }
        @Override
        public OptionalStep<T, H, W> workAddress(W workAddress)
        {
            this.workAddress = workAddress;
            this.workAddressIsSet = true;
            return this;
        }
        @Override
        public OptionalStep<T, H, W> birthday(java.util.Date birthday)
        {
            this.birthday = birthday;
            this.birthdayIsSet = true;
            return this;
        }
        @Override
        public OptionalStep<T, H, W> optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.Person<T,H,W> build()
        {
            Person.Builder<T, H, W> builder = cz.jcode.auto.value.step.builder.example.generic.Person.<T, H, W>builder();
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
        public cz.jcode.auto.value.step.builder.example.generic.Person<T,H,W> get() {
            return build();
        }
    }

    public static <T, H, W> IdLazyStep<T, H, W> lazyStep()
    {
        return LazyStepBuilder.<T, H, W>lazyStep();
    }

    public static class LazyStepBuilder<T, H, W> implements IdLazyStep<T, H, W>, NamesLazyStep<T, H, W>, PhonesLazyStep<T, H, W>, HomeAddressLazyStep<T, H, W>, BuilderLazyStep<T, H, W>, OptionalLazyStep<T, H, W> {
        private java.util.function.Supplier<java.lang.Integer> idSupplier;
        private java.lang.Integer id;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> namesSupplier;
        private com.google.common.collect.ImmutableList<T> names;
        private java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> phonesSupplier;
        private com.google.common.collect.ImmutableList<T> phones;
        private java.util.function.Supplier<H> homeAddressSupplier;
        private H homeAddress;
        private java.util.function.Supplier<W> workAddressSupplier;
        private W workAddress;
        private java.util.function.Supplier<java.util.Date> birthdaySupplier;
        private java.util.Date birthday;
        private boolean workAddressIsSet;
        private boolean birthdayIsSet;
        public static <T, H, W> IdLazyStep<T, H, W> lazyStep()
        {
            return new LazyStepBuilder<T, H, W>();
        }
        @Override
        public NamesLazyStep<T, H, W> id(java.util.function.Supplier<java.lang.Integer> idSupplier)
        {
            if (idSupplier == null) {
                throw new NullPointerException("Null idSupplier");
            }
            this.id = null;
            this.idSupplier = idSupplier;
            return this;
        }
        @Override
        public NamesLazyStep<T, H, W> id(java.lang.Integer id)
        {
            if (id == null) {
                throw new NullPointerException("Null id");
            }
            this.idSupplier = null;
            this.id = id;
            return this;
        }
        @Override
        public PhonesLazyStep<T, H, W> names(java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> namesSupplier)
        {
            if (namesSupplier == null) {
                throw new NullPointerException("Null namesSupplier");
            }
            this.names = null;
            this.namesSupplier = namesSupplier;
            return this;
        }
        @Override
        public PhonesLazyStep<T, H, W> names(com.google.common.collect.ImmutableList<T> names)
        {
            if (names == null) {
                throw new NullPointerException("Null names");
            }
            this.namesSupplier = null;
            this.names = names;
            return this;
        }
        @Override
        public HomeAddressLazyStep<T, H, W> phones(java.util.function.Supplier<com.google.common.collect.ImmutableList<T>> phonesSupplier)
        {
            if (phonesSupplier == null) {
                throw new NullPointerException("Null phonesSupplier");
            }
            this.phones = null;
            this.phonesSupplier = phonesSupplier;
            return this;
        }
        @Override
        public HomeAddressLazyStep<T, H, W> phones(com.google.common.collect.ImmutableList<T> phones)
        {
            if (phones == null) {
                throw new NullPointerException("Null phones");
            }
            this.phonesSupplier = null;
            this.phones = phones;
            return this;
        }
        @Override
        public BuilderLazyStep<T, H, W> homeAddress(java.util.function.Supplier<H> homeAddressSupplier)
        {
            if (homeAddressSupplier == null) {
                throw new NullPointerException("Null homeAddressSupplier");
            }
            this.homeAddress = null;
            this.homeAddressSupplier = homeAddressSupplier;
            return this;
        }
        @Override
        public BuilderLazyStep<T, H, W> homeAddress(H homeAddress)
        {
            if (homeAddress == null) {
                throw new NullPointerException("Null homeAddress");
            }
            this.homeAddressSupplier = null;
            this.homeAddress = homeAddress;
            return this;
        }
        @Override
        public OptionalLazyStep<T, H, W> workAddress(java.util.function.Supplier<W> workAddressSupplier)
        {
            this.workAddress = null;
            this.workAddressSupplier = workAddressSupplier;
            this.workAddressIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep<T, H, W> workAddress(W workAddress)
        {
            this.workAddressSupplier = null;
            this.workAddress = workAddress;
            this.workAddressIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep<T, H, W> birthday(java.util.function.Supplier<java.util.Date> birthdaySupplier)
        {
            this.birthday = null;
            this.birthdaySupplier = birthdaySupplier;
            this.birthdayIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep<T, H, W> birthday(java.util.Date birthday)
        {
            this.birthdaySupplier = null;
            this.birthday = birthday;
            this.birthdayIsSet = true;
            return this;
        }
        @Override
        public OptionalLazyStep<T, H, W> optional()
        {
            return this;
        }
        @Override
        public cz.jcode.auto.value.step.builder.example.generic.Person<T,H,W> build()
        {
            Person.Builder<T, H, W> builder = cz.jcode.auto.value.step.builder.example.generic.Person.<T, H, W>builder();
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
        public cz.jcode.auto.value.step.builder.example.generic.Person<T,H,W> get() {
            return build();
        }
    }

}

