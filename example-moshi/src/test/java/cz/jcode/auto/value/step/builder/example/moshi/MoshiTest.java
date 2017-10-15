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
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Rfc3339DateJsonAdapter;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoshiTest {

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

    public static final NoBuilderAddress PERSON_WORK_ADDRESS = NoBuilderAddress.step()
            .title(ADDRESS_TITLE)
            .street(ADDRESS_STREET)
            .city(ADDRESS_CITY)
            .postcode(ADDRESS_POSTCODE)
            .countryCode(ADDRESS_COUNTRY_CODE)
            .optional()
            .streetParts(ADDRESS_STREET_PARTS)
            .build();

    public static final String MOSHI_STRING = "{\"id\":1,\"names\":[\"Michal\",\"Novak\"],\"phones\":[\"+420724123456\"],\"homeAddress\":{\"title\":\"Title of address\",\"street\":\"Some street 55\",\"streetParts\":[\"Street part 2\",\"Street part 3\"],\"city\":\"Prague\",\"postcode\":\"100 00\",\"countryCode\":\"CZ\"},\"workAddress\":{\"title\":\"Title of address\",\"street\":\"Some street 55\",\"streetParts\":[\"Street part 2\",\"Street part 3\"],\"city\":\"Prague\",\"postcode\":\"100 00\",\"countryCode\":\"CZ\"},\"birthday\":\"1970-01-01T00:00:00.001Z\"}";

    @Test
    public void marshalUnmarshal() throws Exception {
        Person person = Person.step()
                .id(PERSON_ID)
                .names(ImmutableList.of(PERSON_NAME, PERSON_SURNAME))
                .phones(ImmutableList.of(PERSON_PHONE))
                .homeAddress(
                        Address.step()
                                .title(ADDRESS_TITLE)
                                .street(ADDRESS_STREET)
                                .city(ADDRESS_CITY)
                                .postcode(ADDRESS_POSTCODE)
                                .countryCode(ADDRESS_COUNTRY_CODE)
                                .optional()
                                .streetParts(ADDRESS_STREET_PARTS)
                                .build()
                )
                .optional()
                .workAddress(PERSON_WORK_ADDRESS)
                .birthday(PERSON_BIRTHDAY)
                .build();

        assertPerson(person);

        Moshi moshi = new Moshi.Builder()
                .add(MoshiFactory.create())
                .add(ImmutableListJsonAdapter.FACTORY)
                .add(Date.class, new Rfc3339DateJsonAdapter())
                .build();

        String moshiString = moshi.adapter(Person.class).toJson(person);

        assertEquals(moshiString, MOSHI_STRING);

        Person personFromJson = moshi.adapter(Person.class).fromJson(moshiString);

        assertEquals(person, personFromJson);

        assertPerson(personFromJson);
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
        assertEquals(person.workAddress(), PERSON_WORK_ADDRESS);
        assertEquals(person.birthday(), PERSON_BIRTHDAY);
    }
}
