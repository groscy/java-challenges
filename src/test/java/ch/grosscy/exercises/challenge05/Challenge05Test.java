package ch.grosscy.exercises.challenge05;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p>
 * <i>2520</i> is the smallest number that can be divided by each of the numbers
 * from <i>1</i> to <i>10</i> without any remainder.
 * <br/>
 * What is the smallest positive number that is <b>evenly divisible</b>
 * by all the numbers from <i>1</i> to <i>20</i>?
 * </p>
 */
class Challenge05Test {

    Challenge05 challenge05;

    @BeforeEach
    void setup() {
        challenge05 = new Challenge05();
    }

    @ParameterizedTest
    @CsvSource({
            "5, 60",
            "10, 2_520",
            "15, 360_360",
            "20, 232_792_560"
    })
    void testPositiveCases(int maximalNumber,
                           long smallestDivisibleNumber) {
        var greaterThanExpectedResult = new Condition<Long>(x -> x > smallestDivisibleNumber,
                                                            STR."greater than:\n\t\{smallestDivisibleNumber}\nImportant: " +
                                                                    "Your result is too big, your" +
                                                                    " number is not the minimum");

        assertThat(challenge05.calculate(maximalNumber))
                .isNot(greaterThanExpectedResult)
                .isEqualTo(smallestDivisibleNumber);
    }
}