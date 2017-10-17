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
public abstract class NoBuilderAddress<T> {
    public abstract T title();

    public abstract T street();

    @Nullable
    public abstract ImmutableList<T> streetParts();

    public abstract T city();

    public abstract T postcode();

    public abstract T countryCode();

    public static <T> AutoValue_NoBuilderAddress.TitleStep<T> step() {
        return AutoValue_NoBuilderAddress.<T>step();
    }

    public static <T> AutoValue_NoBuilderAddress.TitleLazyStep<T> lazyStep() {
        return AutoValue_NoBuilderAddress.<T>lazyStep();
    }
}
