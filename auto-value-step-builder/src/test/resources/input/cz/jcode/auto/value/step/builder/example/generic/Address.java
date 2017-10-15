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
public abstract class Address<T1> {
    public abstract T1 title();

    public abstract T1 street();

    @Nullable
    public abstract ImmutableList<T1> streetParts();

    public abstract T1 city();

    public abstract T1 postcode();

    public abstract T1 countryCode();

    public static <T1> AutoValue_Address.TitleStep<T1> step() {
        return AutoValue_Address.<T1>step();
    }

    public static <T1> AutoValue_Address.TitleLazyStep<T1> lazyStep() {
        return AutoValue_Address.<T1>lazyStep();
    }

    public static <T1> Builder<T1> builder() {
        return new AutoValue_Address.Builder<T1>();
    }

    public abstract Builder<T1> toBuilder();

    @AutoValue.Builder
    public abstract static class Builder<T1> {
        public abstract Builder<T1> title(T1 title);

        public abstract Builder<T1> street(T1 street);

        public abstract Builder<T1> streetParts(ImmutableList<T1> streetParts);

        public abstract Builder<T1> city(T1 city);

        public abstract Builder<T1> postcode(T1 postcode);

        public abstract Builder<T1> countryCode(T1 countryCode);

        public abstract Address<T1> build();
    }
}
