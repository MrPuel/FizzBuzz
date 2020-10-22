package sncf.oui.io.fizzbuzz;

import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void should_get_a_value_1_given_1() {
        final var value = 1;

        final var response  = fizzBuzz.valueOf(value);

        Assertions.assertThat(response).isEqualTo("1");
    }
}
