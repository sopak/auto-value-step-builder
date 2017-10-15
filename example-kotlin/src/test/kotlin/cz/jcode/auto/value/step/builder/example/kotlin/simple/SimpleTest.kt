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
package cz.jcode.auto.value.step.builder.example.kotlin.simple

import com.google.common.collect.ImmutableList
import cz.jcode.auto.value.step.builder.example.simple.Address
import cz.jcode.auto.value.step.builder.example.simple.NoBuilderAddress
import cz.jcode.auto.value.step.builder.example.simple.Person
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test
import java.util.*
import java.util.function.Supplier
import java.util.stream.IntStream

class SimpleTest {

    @Test
    @Throws(Exception::class)
    fun step() {

        val person = Person.step()
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
                .build()

        assertPerson(person)
    }

    @Test
    @Throws(Exception::class)
    fun lazyStep() {
        val personBuilder = Person.lazyStep()
                .id { PERSON_ID }
                .names { ImmutableList.of(PERSON_NAME, PERSON_SURNAME) }
                .phones { ImmutableList.of(PERSON_PHONE) }
                .homeAddress(
                        Address.lazyStep()
                                .title { ADDRESS_TITLE }
                                .street { ADDRESS_STREET }
                                .city { ADDRESS_CITY }
                                .postcode { ADDRESS_POSTCODE }
                                .countryCode { ADDRESS_COUNTRY_CODE }
                                .optional()
                                .streetParts { ADDRESS_STREET_PARTS }
                )
                .optional()
                .workAddress { PERSON_WORK_ADDRESS }
                .birthday { PERSON_BIRTHDAY }

        val buildOne = personBuilder.build()
        assertPerson(buildOne)
        val buildTwo = personBuilder.build()
        assertEquals(buildOne, buildTwo)
    }

    @Test
    @Throws(Exception::class)
    fun lazyStepCombined() {
        val personBuilder = Person.lazyStep()
                .id(PERSON_ID)
                .names { ImmutableList.of(PERSON_NAME, PERSON_SURNAME) }
                .phones(ImmutableList.of(PERSON_PHONE))
                .homeAddress(
                        Address.lazyStep()
                                .title(ADDRESS_TITLE)
                                .street(ADDRESS_STREET)
                                .city(ADDRESS_CITY)
                                .postcode(ADDRESS_POSTCODE)
                                .countryCode(ADDRESS_COUNTRY_CODE)
                                .optional()
                                .streetParts(ADDRESS_STREET_PARTS)
                )
                .optional()
                .workAddress { PERSON_WORK_ADDRESS }
                .birthday { PERSON_BIRTHDAY }

        val buildOne = personBuilder.build()
        assertPerson(buildOne)
        val buildTwo = personBuilder.build()
        assertEquals(buildOne, buildTwo)
    }

    @Test
    @Throws(Exception::class)
    fun lazyStepBuiltAddress() {
        val personBuilder = Person.lazyStep()
                .id(PERSON_ID)
                .names { ImmutableList.of(PERSON_NAME, PERSON_SURNAME) }
                .phones(ImmutableList.of(PERSON_PHONE))
                .homeAddress(
                        Address.lazyStep()
                                .title(ADDRESS_TITLE)
                                .street(ADDRESS_STREET)
                                .city { ADDRESS_CITY }
                                .postcode(ADDRESS_POSTCODE)
                                .countryCode(ADDRESS_COUNTRY_CODE)
                                .optional()
                                .streetParts(ADDRESS_STREET_PARTS)
                                .build()
                )
                .optional()
                .workAddress { PERSON_WORK_ADDRESS }
                .birthday { PERSON_BIRTHDAY }

        val buildOne = personBuilder.build()
        assertPerson(buildOne)
        val buildTwo = personBuilder.build()
        assertEquals(buildOne, buildTwo)
    }

    @Test
    @Throws(Exception::class)
    fun lazyStepSuppliedPersonId() {
        val idSupplier = object : Supplier<Int> {
            private var id: Int = 0

            @Synchronized override fun get(): Int {
                return id++
            }
        }

        val personBuilder = Person.lazyStep()
                .id(idSupplier)
                .names { ImmutableList.of(PERSON_NAME, PERSON_SURNAME) }
                .phones(ImmutableList.of(PERSON_PHONE))
                .homeAddress(
                        Address.lazyStep()
                                .title(ADDRESS_TITLE)
                                .street(ADDRESS_STREET)
                                .city { ADDRESS_CITY }
                                .postcode(ADDRESS_POSTCODE)
                                .countryCode(ADDRESS_COUNTRY_CODE)
                                .optional()
                                .streetParts(ADDRESS_STREET_PARTS)
                )
                .optional()
                .workAddress { PERSON_WORK_ADDRESS }
                .birthday { PERSON_BIRTHDAY }

        val buildOne = personBuilder.build()
        val buildTwo = personBuilder.build()
        assertPerson(buildTwo)
        assertNotEquals(buildOne, buildTwo)
        assertEquals(buildOne.homeAddress(), buildTwo.homeAddress())

        val limit = 1000
        IntStream.range(0, limit).parallel().forEach(
                { personBuilder.build() }
        )

        assertEquals(idSupplier.get(), limit + 2)
    }

    private fun assertPerson(person: Person) {

        val copyOfPerson = person.toBuilder().build()

        assertEquals(person, copyOfPerson)

        assertEquals(person.id(), PERSON_ID)
        assertEquals(person.names(), ImmutableList.of(PERSON_NAME, PERSON_SURNAME))
        assertEquals(person.phones(), ImmutableList.of(PERSON_PHONE))
        assertEquals(person.homeAddress().title(), ADDRESS_TITLE)
        assertEquals(person.homeAddress().street(), ADDRESS_STREET)
        assertEquals(person.homeAddress().city(), ADDRESS_CITY)
        assertEquals(person.homeAddress().postcode(), ADDRESS_POSTCODE)
        assertEquals(person.homeAddress().countryCode(), ADDRESS_COUNTRY_CODE)
        assertEquals(person.homeAddress().streetParts(), ADDRESS_STREET_PARTS)
        assertEquals(person.workAddress(), PERSON_WORK_ADDRESS)
        assertEquals(person.birthday(), PERSON_BIRTHDAY)
    }

    companion object {

        val PERSON_ID = 1
        val PERSON_NAME = "Michal"
        val PERSON_SURNAME = "Novak"
        val PERSON_PHONE = "+420724123456"
        val PERSON_BIRTHDAY = Date(1)

        val ADDRESS_COUNTRY_CODE = "CZ"
        val ADDRESS_TITLE = "Title of address"
        val ADDRESS_STREET = "Some street 55"
        val ADDRESS_CITY = "Prague"
        val ADDRESS_POSTCODE = "100 00"
        val ADDRESS_STREET_PARTS = ImmutableList.of("Street part 2", "Street part 3")

        val PERSON_WORK_ADDRESS = NoBuilderAddress.step()
                .title(ADDRESS_TITLE)
                .street(ADDRESS_STREET)
                .city(ADDRESS_CITY)
                .postcode(ADDRESS_POSTCODE)
                .countryCode(ADDRESS_COUNTRY_CODE)
                .optional()
                .streetParts(ADDRESS_STREET_PARTS)
                .build()
    }
}
