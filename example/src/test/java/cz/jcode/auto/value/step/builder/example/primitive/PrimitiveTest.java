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
package cz.jcode.auto.value.step.builder.example.primitive;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PrimitiveTest {

    private static final int PRIMITIVE_INT = 1;
    private static final long PRIMITIVE_LONG = 2222L;
    private static final double PRIMITIVE_DOUBLE = 33.3D;
    private static final float PRIMITIVE_FLOAT = 1.3F;
    private static final boolean PRIMITIVE_BOOLEAN = true;
    private static final byte PRIMITIVE_BYTE = new Byte("1");
    private static final char PRIMITIVE_CHAR = 'a';

    @Test
    public void step() throws Exception {

        Primitive primitive = Primitive.step()
                .primitiveInt(PRIMITIVE_INT)
                .primitiveLong(PRIMITIVE_LONG)
                .primitiveDouble(PRIMITIVE_DOUBLE)
                .primitiveFloat(PRIMITIVE_FLOAT)
                .primitiveBoolean(PRIMITIVE_BOOLEAN)
                .primitiveByte(PRIMITIVE_BYTE)
                .primitiveChar(PRIMITIVE_CHAR)
                .build();

        assertPrimitive(primitive);
    }

    @Test
    public void lazyStep() throws Exception {

        AutoValue_Primitive.BuilderLazyStep primitiveBuilder = Primitive.lazyStep()
                .primitiveInt(()->PRIMITIVE_INT)
                .primitiveLong(()->PRIMITIVE_LONG)
                .primitiveDouble(()->PRIMITIVE_DOUBLE)
                .primitiveFloat(()->PRIMITIVE_FLOAT)
                .primitiveBoolean(()->PRIMITIVE_BOOLEAN)
                .primitiveByte(()->PRIMITIVE_BYTE)
                .primitiveChar(()->PRIMITIVE_CHAR);

        Primitive buildOne = primitiveBuilder.build();
        assertPrimitive(buildOne);
        Primitive buildTwo = primitiveBuilder.build();
        assertEquals(buildOne, buildTwo);
    }

    @Test
    public void lazyStepCombined() throws Exception {

        AutoValue_Primitive.BuilderLazyStep primitiveBuilder = Primitive.lazyStep()
                .primitiveInt(()->PRIMITIVE_INT)
                .primitiveLong(PRIMITIVE_LONG)
                .primitiveDouble(()->PRIMITIVE_DOUBLE)
                .primitiveFloat(()->PRIMITIVE_FLOAT)
                .primitiveBoolean(PRIMITIVE_BOOLEAN)
                .primitiveByte(()->PRIMITIVE_BYTE)
                .primitiveChar(()->PRIMITIVE_CHAR);

        Primitive buildOne = primitiveBuilder.build();
        assertPrimitive(buildOne);
        Primitive buildTwo = primitiveBuilder.build();
        assertEquals(buildOne, buildTwo);
    }

    @Test
    public void lazyStepSuppliedValues() throws Exception {
        Supplier<Integer> idSupplier = new Supplier<Integer>() {
            private int id;

            @Override
            synchronized public Integer get() {
                return this.id++;
            }
        };

        AutoValue_Primitive.BuilderLazyStep primitiveBuilder = Primitive.lazyStep()
                .primitiveInt(idSupplier)
                .primitiveLong(()->PRIMITIVE_LONG)
                .primitiveDouble(()->PRIMITIVE_DOUBLE)
                .primitiveFloat(()->PRIMITIVE_FLOAT)
                .primitiveBoolean(()->PRIMITIVE_BOOLEAN)
                .primitiveByte(()->PRIMITIVE_BYTE)
                .primitiveChar(()->PRIMITIVE_CHAR);

        Primitive buildOne = primitiveBuilder.build();
        Primitive buildTwo = primitiveBuilder.build();
        assertPrimitive(buildTwo);
        assertNotEquals(buildOne, buildTwo);
        assertEquals(buildOne.primitiveFloat(), buildTwo.primitiveFloat());

        int limit = 1000;
        IntStream.range(0, limit).parallel().forEach(
                i -> primitiveBuilder.build()
        );

        assertEquals(idSupplier.get(), new Integer(limit + 2));
    }

    private void assertPrimitive(Primitive primitive) {

        assertEquals(primitive.primitiveInt(), PRIMITIVE_INT);
        assertEquals(primitive.primitiveLong(), PRIMITIVE_LONG);
        assertEquals(primitive.primitiveDouble(), PRIMITIVE_DOUBLE);
        assertEquals(primitive.primitiveFloat(), PRIMITIVE_FLOAT);
        assertEquals(primitive.primitiveBoolean(), PRIMITIVE_BOOLEAN);
        assertEquals(primitive.primitiveByte(), PRIMITIVE_BYTE);
        assertEquals(primitive.primitiveChar(), PRIMITIVE_CHAR);
    }
}