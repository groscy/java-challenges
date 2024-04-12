package ch.grosscy.exercises.challenge02;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p>
 * Each new term in the Fibonacci sequence is generated
 * by adding the previous two terms.
 * By starting with <i>1</i> and <i>2</i>, the first <i>10</i>
 * terms will be:
 * <br />
 * <br />
 * <i>1,2,3,5,8,13,21,34,55,89,...</i>
 * <br />
 * <br />
 * By considering the terms in the Fibonacci sequence
 * whose values do not exceed 4'000'000,
 * find the sum of the even-valued terms.
 * </p>
 */
class Challenge02Test {

    Challenge02 challenge02;

    @BeforeEach
    void setup() {
        challenge02 = new Solution02();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 19",
            "20, 32",
            "30, 53",
            "4_000_000, 9_227_463",
    })
    void testPositiveCases(int input, int expectedResult) {
        int result = challenge02.calculate(input);
        var smallerThanExpectedResult = new Condition<Integer>(x -> x < expectedResult,
                                                               STR."smaller than:\n\t\{expectedResult}\nImportant: Your result is too small do you have all the numbers of the fibonacci series in your calculation");
        var greaterThanExpectedResult = new Condition<Integer>(x -> x > expectedResult,
                                                               STR."greater than:\n\t\{expectedResult}\nImportant: Your result is too big do only use the numbers of the fibonacci series below \{input}");
        assertThat(result)
                .isNot(smallerThanExpectedResult)
                .isNot(greaterThanExpectedResult)
                .isEqualTo(expectedResult);
    }
}