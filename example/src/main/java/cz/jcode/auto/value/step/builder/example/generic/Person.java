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
import java.util.Date;

@AutoValue
@AutoValueStepBuilder
public abstract class Person<T, H, W> {
    public abstract Integer id();

    public abstract ImmutableList<T> names();

    public abstract ImmutableList<T> phones();

    public abstract H homeAddress();

    @Nullable
    public abstract W workAddress();

    @Nullable
    public abstract Date birthday();

    public static <T, H, W> AutoValue_Person.IdStep<T, H, W> step() {
        return AutoValue_Person.<T, H, W>step();
    }

    public static <T, H, W> AutoValue_Person.IdLazyStep<T, H, W> lazyStep() {
        return AutoValue_Person.<T, H, W>lazyStep();
    }

    public static <T, H, W> Builder<T, H, W> builder() {
        return new AutoValue_Person.Builder<T, H, W>();
    }

    public abstract Builder<T, H, W> toBuilder();

    @AutoValue.Builder
    public abstract static class Builder<T, H, W> {
        public abstract Builder<T, H, W> id(Integer id);

        public abstract Builder<T, H, W> names(ImmutableList<T> names);

        public abstract Builder<T, H, W> phones(ImmutableList<T> phones);

        public abstract Builder<T, H, W> homeAddress(H homeAddress);

        public abstract Builder<T, H, W> workAddress(W workAddress);

        public abstract Builder<T, H, W> birthday(Date birthday);

        public abstract Person<T, H, W> build();
    }
}