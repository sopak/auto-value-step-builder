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
package cz.jcode.auto.value.step.builder.example.simple;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DefaultsTest {

    public static final String ANOTHER_PERSON_NAME = "Kamil";
    public static final Integer ANOTHER_PERSON_ID = 2;
    public static final Integer PERSON_ID = 1;
    public static final String PERSON_NAME = "Michal";
    public static final String PERSON_SURNAME = "Novak";
    public static final String PERSON_PHONE = "+420724123456";
    public static final Date PERSON_BIRTHDAY = new Date(1);

    public static final String ADDRESS_COUNTRY_CODE = "CZ";
    public static final String ADDRESS_TITLE = "Title of address";
    public static final String ADDRESS_STREET = "Some street 55";
    public static final String ADDRESS_CITY = "Prague";
    public static final String ADDRESS_POSTCODE = "100 00";
    public static final ImmutableList<String> ADDRESS_STREET_PARTS = ImmutableList.of("Street part 2", "Street part 3");

    @Test
    public void defaults() throws Exception {

        Person.Builder personBuilder = createBuilderPersonWithAllDefaults();
        assertPerson(personBuilder.build());
        Person anotherPerson = personBuilder
                .id(ANOTHER_PERSON_ID)
                .names(ImmutableList.of(ANOTHER_PERSON_NAME, PERSON_SURNAME))
                .build();

        assertNotEquals(anotherPerson.id(), PERSON_ID);
        assertEquals(anotherPerson.id(), ANOTHER_PERSON_ID);

        assertNotEquals(anotherPerson.names(), ImmutableList.of(PERSON_NAME, PERSON_SURNAME));
        assertEquals(anotherPerson.names(), ImmutableList.of(ANOTHER_PERSON_NAME, PERSON_SURNAME));
    }

    private Address.Builder createBuilderAddressWithAllDefaults() {

        return Address.step().title(ADDRESS_TITLE)
                .street(ADDRESS_STREET)
                .city(ADDRESS_CITY)
                .postcode(ADDRESS_POSTCODE)
                .countryCode(ADDRESS_COUNTRY_CODE)
                .optional()
                .streetParts(ADDRESS_STREET_PARTS)
                .build()
                .toBuilder();
    }

    private Person.Builder createBuilderPersonWithAllDefaults() {

        return Person.lazyStep()
                .id(PERSON_ID)
                .names(() -> ImmutableList.of(PERSON_NAME, PERSON_SURNAME))
                .phones(ImmutableList.of(PERSON_PHONE))
                .homeAddress(
                        createBuilderAddressWithAllDefaults().build()
                )
                .optional()
                .birthday(PERSON_BIRTHDAY)
                .build()
                .toBuilder();
    }

    private void assertPerson(Person person) {

        Person copyOfPerson = person.toBuilder().build();

        assertEquals(person, copyOfPerson);

        assertEquals(person.id(), PERSON_ID);
        assertEquals(person.names(), ImmutableList.of(PERSON_NAME, PERSON_SURNAME));
        assertEquals(person.phones(), ImmutableList.of(PERSON_PHONE));
        assertEquals(person.homeAddress().title(), ADDRESS_TITLE);
        assertEquals(person.homeAddress().street(), ADDRESS_STREET);
        assertEquals(person.homeAddress().city(), ADDRESS_CITY);
        assertEquals(person.homeAddress().postcode(), ADDRESS_POSTCODE);
        assertEquals(person.homeAddress().countryCode(), ADDRESS_COUNTRY_CODE);
        assertEquals(person.homeAddress().streetParts(), ADDRESS_STREET_PARTS);
        assertEquals(person.birthday(), PERSON_BIRTHDAY);
    }
}
