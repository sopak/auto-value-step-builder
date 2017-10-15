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
package cz.jcode.auto.value.step.builder.example.inheritance;

import com.google.auto.value.AutoValue;
import cz.jcode.auto.value.step.builder.AutoValueStepBuilder;

@AutoValue
@AutoValueStepBuilder
public abstract class Child extends Parent<Child, Child.Builder> {

    public abstract Integer childNumber();

    public static Builder builder() {
        return new $AutoValue_Child.Builder();
    }

    public abstract Builder toBuilder();

    public static AutoValue_Child.ParentNumberStep step() {
        return AutoValue_Child.step();
    }

    public static AutoValue_Child.ParentNumberLazyStep lazyStep() {
        return AutoValue_Child.lazyStep();
    }

    @AutoValue.Builder
    public abstract static class Builder extends Parent.Builder<Child, Child.Builder> {
        public abstract Builder childNumber(Integer childNumber);
    }
}
