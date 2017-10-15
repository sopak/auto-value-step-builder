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
public abstract class NoBuilderAddress
{
    public abstract String title();

    public abstract String street();

    @Nullable
    public abstract ImmutableList<String> streetParts();

    public abstract String city();

    public abstract String postcode();

    public abstract String countryCode();

    public static JsonAdapter<NoBuilderAddress> jsonAdapter(Moshi moshi) {
        return new AutoValue_NoBuilderAddress.MoshiJsonAdapter(moshi);
    }

    public static AutoValue_NoBuilderAddress.TitleStep step()
    {
        return AutoValue_NoBuilderAddress.step();
    }

    public static AutoValue_NoBuilderAddress.TitleLazyStep lazyStep()
    {
        return AutoValue_NoBuilderAddress.lazyStep();
    }
}
