package sncf.oui.io.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"Fizz");
        map.put(5,"Buzz");
        map.put(7,"Bazz");
        this.fizzBuzz = new FizzBuzz(map);
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "4,4"
    })
    void should_map_value_to_string_given_a_value_not_divisible_by_3_or_5(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "4,Fizz",
            "6,Fizz",
            "9,Fizz"
    })
    void should_map_value_to_fizz_given_a_value_divisible_by_3(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "5,Buzz",
            "10,Buzz",
            "20,Buzz"
    })
    void should_map_value_to_buzz_given_a_value_divisible_by_5(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "15,FizzBuzz",
            "30,FizzBuzz",
            "45,FizzBuzz"
    })
    void should_map_value_to_fizzbuzz_given_a_value_divisible_by_15(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "7,Bazz",
            "14,Bazz",
            "49,Bazz"
    })
    void should_map_value_to_bazz_given_a_value_divisible_by_7(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "105,FizzBuzzBazz",
            "210,FizzBuzzBazz",
            "315,FizzBuzzBazz"
    })
    void should_map_value_to_bazz_given_a_value_divisible_by_105(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        assertThat(response).isEqualTo(expectedResponse);
    }

    @Test
    void should_throw_given_value_of_minus1() {

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fizzBuzz.valueOf(-1))
                .withMessage("Negative value are not supported");
    }
}
