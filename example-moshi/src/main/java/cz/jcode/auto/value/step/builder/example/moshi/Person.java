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
import java.util.Date;

@AutoValue
@AutoValueStepBuilder
public abstract class Person {
    public abstract Integer id();

    public abstract ImmutableList<String> names();

    public abstract ImmutableList<String> phones();

    public abstract Address homeAddress();

    @Nullable
    public abstract NoBuilderAddress workAddress();

    @Nullable
    public abstract Date birthday();

    public static JsonAdapter<Person> jsonAdapter(Moshi moshi) {
        return new AutoValue_Person.MoshiJsonAdapter(moshi);
    }

    public static AutoValue_Person.IdStep step() {
        return AutoValue_Person.step();
    }

    public static AutoValue_Person.IdLazyStep lazyStep() {
        return AutoValue_Person.lazyStep();
    }

    public static Builder builder() {
        return new AutoValue_Person.Builder();
    }

    public abstract Builder toBuilder();

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder id(Integer id);

        public abstract Builder names(ImmutableList<String> names);

        public abstract Builder phones(ImmutableList<String> phones);

        public abstract Builder homeAddress(Address homeAddress);

        public abstract Builder workAddress(NoBuilderAddress workAddress);

        public abstract Builder birthday(Date birthday);

        public abstract Person build();
    }
}
