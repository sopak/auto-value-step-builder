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
package cz.jcode.auto.value.step.builder.example.moshi;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import cz.jcode.auto.value.step.builder.AutoValueStepBuilder;

import javax.annotation.Nullable;

@AutoValue
@AutoValueStepBuilder
public abstract class Address {
    public abstract String title();

    public abstract String street();

    @Nullable
    public abstract ImmutableList<String> streetParts();

    public abstract String city();

    public abstract String postcode();

    public abstract String countryCode();

    public static JsonAdapter<Address> jsonAdapter(Moshi moshi) {
        return new AutoValue_Address.MoshiJsonAdapter(moshi);
    }

    public static AutoValue_Address.TitleStep step() {
        return AutoValue_Address.step();
    }

    public static AutoValue_Address.TitleLazyStep lazyStep() {
        return AutoValue_Address.lazyStep();
    }

    public static Builder builder() {
        return new AutoValue_Address.Builder();
    }

    public abstract Builder toBuilder();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder title(String title);

        public abstract Builder street(String street);

        public abstract Builder streetParts(ImmutableList<String> streetParts);

        public abstract Builder city(String city);

        public abstract Builder postcode(String postcode);

        public abstract Builder countryCode(String countryCode);

        public abstract Address build();
    }
}
