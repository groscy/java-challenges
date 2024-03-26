package ch.grosscy.exercises.challenge01;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * <b>Problem description</b>
 * <p>
 * If we list all the natural numbers below <i>10</i>
 * that are multiples of <i>3</i> or <i>5</i>,
 * we get <i>3</i>, <i>5</i>, <i>6</i> and <i>9</i>.
 * <br />
 * The sum of these multiples is <i>23</i>.
 * <br />
 * Find the sum of all the multiples of <i>3</i> or <i>5</i> below <i>1000</i>.
 * </p>
 */
class Challenge01Test {

    Challenge01 challenge01;

    @BeforeEach
    void setup() {
        challenge01 = new Challenge01();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 23",
            "100, 2318",
            "1000, 233168",
            "10000, 23331668",
    })
    void testPositiveCases(int input, int expectedResult) {
        int result = challenge01.calculate(input);
        var smallerThanExpectedResult = new Condition<Integer>(x -> x < expectedResult,
                                               STR."smaller than:\n\t\{expectedResult}\nImportant: Output is too big do only calculate with numbers below \{input}");
        var greaterThanExpectedResult = new Condition<Integer>(x -> x > expectedResult,
                                               STR."greater than:\n\t\{expectedResult}\nImportant: Number is too low do you have all the numbers divisible by 3 OR 5 in your calculation");
        assertThat(result)
                .isNot(smallerThanExpectedResult)
                .isNot(greaterThanExpectedResult)
                .isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 33",
            "100, 2418",
            "1000, 234168",
            "10000, 23341668",
    })
    void testNegativeCase(int input, int output) {
        assertThat(challenge01.calculate(input))
                .as("Important: Only numbers below {} the input number should be included!",
                    input)
                .isNotEqualTo(output);
    }

}