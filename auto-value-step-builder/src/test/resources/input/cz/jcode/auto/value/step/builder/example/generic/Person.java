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
public abstract class Person<T1, T2, T3> {
    public abstract Integer id();

    public abstract ImmutableList<T1> names();

    public abstract ImmutableList<T1> phones();

    public abstract T2 homeAddress();

    @Nullable
    public abstract T3 workAddress();

    @Nullable
    public abstract Date birthday();

    public static <T1, T2, T3> AutoValue_Person.IdStep<T1, T2, T3> step() {
        return AutoValue_Person.<T1, T2, T3>step();
    }

    public static <T1, T2, T3> AutoValue_Person.IdLazyStep<T1, T2, T3> lazyStep() {
        return AutoValue_Person.<T1, T2, T3>lazyStep();
    }

    public static <T1, T2, T3> Builder<T1, T2, T3> builder() {
        return new AutoValue_Person.Builder<T1, T2, T3>();
    }

    public abstract Builder<T1, T2, T3> toBuilder();

    @AutoValue.Builder
    public abstract static class Builder<T1, T2, T3> {
        public abstract Builder<T1, T2, T3> id(Integer id);

        public abstract Builder<T1, T2, T3> names(ImmutableList<T1> names);

        public abstract Builder<T1, T2, T3> phones(ImmutableList<T1> phones);

        public abstract Builder<T1, T2, T3> homeAddress(T2 homeAddress);

        public abstract Builder<T1, T2, T3> workAddress(T3 workAddress);

        public abstract Builder<T1, T2, T3> birthday(Date birthday);

        public abstract Person<T1, T2, T3> build();
    }
}