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

import com.google.common.collect.ImmutableList;
import com.squareup.moshi.*;

import javax.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Set;

public abstract class ImmutableListJsonAdapter<C extends ImmutableList<T>, T> extends JsonAdapter<C> {
    public static final JsonAdapter.Factory FACTORY = new JsonAdapter.Factory() {
        @Override
        public @Nullable
        JsonAdapter<?> create(
                Type type, Set<? extends Annotation> annotations, Moshi moshi) {
            Class<?> rawType = Types.getRawType(type);
            if (!annotations.isEmpty()) return null;
            if (rawType == ImmutableList.class) {
                return newArrayListAdapter(type, moshi).nullSafe();
            }
            return null;
        }
    };

    private final JsonAdapter<T> elementAdapter;

    private ImmutableListJsonAdapter(JsonAdapter<T> elementAdapter) {
        this.elementAdapter = elementAdapter;
    }

    private static <T> JsonAdapter<ImmutableList<T>> newArrayListAdapter(Type type, Moshi moshi) {
        Type elementType = Types.collectionElementType(type, Collection.class);
        JsonAdapter<T> elementAdapter = moshi.adapter(elementType);
        return new ImmutableListJsonAdapter<ImmutableList<T>, T>(elementAdapter) {
            @Override
            protected ImmutableList.Builder<T> newBuilder() {
                return ImmutableList.<T>builder();
            }
        };
    }

    protected abstract C.Builder<T> newBuilder();

    @SuppressWarnings("unchecked")
    @Override
    public C fromJson(JsonReader reader) throws IOException {
        C.Builder<T> result = newBuilder();
        reader.beginArray();
        while (reader.hasNext()) {
            result.add(elementAdapter.fromJson(reader));
        }
        reader.endArray();
        return (C) result.build();
    }

    @Override
    public void toJson(JsonWriter writer, C value) throws IOException {
        writer.beginArray();
        for (T element : value) {
            elementAdapter.toJson(writer, element);
        }
        writer.endArray();
    }

    @Override
    public String toString() {
        return elementAdapter + ".collection()";
    }
}