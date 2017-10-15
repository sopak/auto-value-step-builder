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
package cz.jcode.auto.value.step.builder.example.innerclass;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import cz.jcode.auto.value.step.builder.AutoValueStepBuilder;

import javax.annotation.Nullable;
import java.util.Date;

@AutoValue
@AutoValueStepBuilder
public abstract class PersonWithAddress {
    public abstract Integer id();

    public abstract ImmutableList<String> names();

    public abstract ImmutableList<String> phones();

    public abstract Address homeAddress();

    @Nullable
    public abstract Address workAddress();

    @Nullable
    public abstract Date birthday();

    public static AutoValue_PersonWithAddress.IdStep step() {
        return AutoValue_PersonWithAddress.step();
    }

    public static AutoValue_PersonWithAddress.IdLazyStep lazyStep() {
        return AutoValue_PersonWithAddress.lazyStep();
    }

    public static Builder builder() {
        return new AutoValue_PersonWithAddress.Builder();
    }

    public abstract Builder toBuilder();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder id(Integer id);

        public abstract Builder names(ImmutableList<String> names);

        public abstract Builder phones(ImmutableList<String> phones);

        public abstract Builder homeAddress(Address homeAddress);

        public abstract Builder workAddress(Address workAddress);

        public abstract Builder birthday(Date birthday);

        public abstract PersonWithAddress build();
    }


    @AutoValue
    @AutoValueStepBuilder
    public static abstract class Address {
        public abstract String title();

        public abstract String street();

        @Nullable
        public abstract ImmutableList<String> streetParts();

        public abstract String city();

        public abstract String postcode();

        public abstract String countryCode();

        public static AutoValue_PersonWithAddress_Address.TitleStep step() {
            return AutoValue_PersonWithAddress_Address.step();
        }

        public static AutoValue_PersonWithAddress_Address.TitleLazyStep lazyStep() {
            return AutoValue_PersonWithAddress_Address.lazyStep();
        }

        public static AddressBuilder builder() {
            return new AutoValue_PersonWithAddress_Address.Builder();
        }

        public abstract AddressBuilder toBuilder();

        @AutoValue.Builder
        public abstract static class AddressBuilder {
            public abstract AddressBuilder title(String title);

            public abstract AddressBuilder street(String street);

            public abstract AddressBuilder streetParts(ImmutableList<String> streetParts);

            public abstract AddressBuilder city(String city);

            public abstract AddressBuilder postcode(String postcode);

            public abstract AddressBuilder countryCode(String countryCode);

            public abstract Address build();
        }
    }

}
