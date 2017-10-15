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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InheritanceTest {

    public static final Integer PARENT_NUMBER = 22;
    public static final Integer CHILD_NUMBER = 21;

    @Test
    public void inheritance() throws Exception {
        Child child = Child.step()
                .parentNumber(PARENT_NUMBER)
                .childNumber(CHILD_NUMBER)
                .build();

        Parent parent = child;

        ParentInterface parentInterface = parent;

        OtherInterface otherInterface = parent;

        if (parentInterface instanceof Child) {
            Child castedChild = (Child) parentInterface;
            assertEquals(castedChild.parentNumber(), PARENT_NUMBER);
            assertEquals(castedChild.childNumber(), CHILD_NUMBER);
        }

        assertEquals(child, parent);
        assertEquals(child, parentInterface);
        assertEquals(parent, parentInterface);
        assertEquals(otherInterface, parentInterface);
        assertEquals(parentInterface.parentNumber(), PARENT_NUMBER);
        assertEquals(child.childNumber(), CHILD_NUMBER);
        assertEquals(otherInterface.childNumber(), CHILD_NUMBER);
    }
}
