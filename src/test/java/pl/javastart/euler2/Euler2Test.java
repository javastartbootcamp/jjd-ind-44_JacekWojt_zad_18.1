package pl.javastart.euler2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Euler2Test {

    @ParameterizedTest
    @CsvSource(value = {"10, 10", "34, 44", "144, 188"})
    void shouldReturnExpectedValue(int limit, int expected) {
        //given
        Euler2 euler2 = new Euler2();

        //when
        int result = euler2.sumEvenFibNumBelow(limit);

        //then
        assertEquals(expected, result);
    }
}