package sncf.oui.io.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * FizzBuzz = (Int) -> String
 * Int divisible par 3 = Fizz
 * Int divisible par 5 = Buzz
 * Int divisible apr 3 et 5 = FizzBuzz
 * Sinon Int renvoie sa valeur en string
 *
 * Norme de nomage : "should_..._given_..."
 * Structuure d'un test : Given, That, Then
 * SUT : System Under Test = le comportement / la classe qu'on est en train de tester
 */

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        this.fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "4,4",
            "7,7"
    })
    void should_map_value_to_string(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        Assertions.assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "3,Fizz",
            "6,Fizz",
            "9,Fizz"
    })
    void should_map_value_to_fizz(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        Assertions.assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "5,Buzz",
            "10,Buzz",
            "20,Buzz"
    })
    void should_map_value_to_buzz(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        Assertions.assertThat(response).isEqualTo(expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "15,FizzBuzz",
            "30,FizzBuzz",
            "45,FizzBuzz"
    })
    void should_map_value_to_fizzbuzz(final int value, final String expectedResponse) {

        final var response = fizzBuzz.valueOf(value);

        Assertions.assertThat(response).isEqualTo(expectedResponse);
    }
}
