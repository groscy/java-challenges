package ch.grosscy.exercises.challenge05;

import org.assertj.core.api.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge05Test {

    Challenge05 challenge05;

    @BeforeEach
    void setup() {
        challenge05 = new Solution05();
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
                                                            """
                                                                    greater than:
                                                                    \t%s
                                                                    Important: \
                                                                    Your result is too big, your\
                                                                     number is not the minimum""",
                                                            smallestDivisibleNumber);

        assertThat(challenge05.calculate(maximalNumber))
                .isNot(greaterThanExpectedResult)
                .isEqualTo(smallestDivisibleNumber);
    }
}