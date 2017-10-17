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
package cz.jcode.auto.value.step.builder.example.generic;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;
import cz.jcode.auto.value.step.builder.AutoValueStepBuilder;

import javax.annotation.Nullable;

@AutoValue
@AutoValueStepBuilder
public abstract class Address<T> {
    public abstract T title();

    public abstract T street();

    @Nullable
    public abstract ImmutableList<T> streetParts();

    public abstract T city();

    public abstract T postcode();

    public abstract T countryCode();

    public static <T> AutoValue_Address.TitleStep<T> step() {
        return AutoValue_Address.<T>step();
    }

    public static <T> AutoValue_Address.TitleLazyStep<T> lazyStep() {
        return AutoValue_Address.<T>lazyStep();
    }

    public static <T> Builder<T> builder() {
        return new AutoValue_Address.Builder<T>();
    }

    public abstract Builder<T> toBuilder();

    @AutoValue.Builder
    public abstract static class Builder<T> {
        public abstract Builder<T> title(T title);

        public abstract Builder<T> street(T street);

        public abstract Builder<T> streetParts(ImmutableList<T> streetParts);

        public abstract Builder<T> city(T city);

        public abstract Builder<T> postcode(T postcode);

        public abstract Builder<T> countryCode(T countryCode);

        public abstract Address<T> build();
    }
}
