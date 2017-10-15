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

public abstract class Parent<M extends Parent<M, B>, B extends Parent.Builder<M, B>> implements ParentInterface, OtherInterface {
    public abstract Integer parentNumber();

    public abstract B toBuilder();

    public abstract static class Builder<O, B extends Builder<O, B>> {
        public abstract B parentNumber(Integer parentNumber);

        public abstract O build();
    }
}
