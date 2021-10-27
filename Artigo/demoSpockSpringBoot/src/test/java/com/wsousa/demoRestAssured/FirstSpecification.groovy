package com.wsousa.demoRestAssured

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals
import spock.lang.Specification

class FirstSpecification extends Specification {

    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "Should get an index out of bounds when removing a non-existent item"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(20)

        then:
        thrown(IndexOutOfBoundsException)
        list.size() == 4
    }

    def "two plus two should equal four"() {
        given:
        int left = 2
        int right = 2

        when:
        int result = left + right

        then:
        result == 4
    }

    def "Should be able to remove from list"() {
        given:
        def list = [1, 2, 3, 4]

        when:
        list.remove(0)

        then:
        list == [2, 3, 4]
    }


    def "numbers to the power of two"(int a, int b, int c) {
        expect:
        Math.pow(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
    }

    @Test
    public void givenTwoAndTwo_whenAdding_thenResultIsFour() {
        // Given
        int first = 2;
        int second = 4;

        // When
        int result = 2 + 2;

        // Then
        assertEquals(result , 4)
    }

}