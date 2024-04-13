package ch.grosscy.exercises.challenge05;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.assertj.core.api.Condition;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge05Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge05.class);

    @ParameterizedTest
    @CsvSource({
            "5, 60",
            "10, 2_520",
            "15, 360_360",
            "20, 232_792_560"
    })
    void testPositiveCases(long maximalNumber,
                           long smallestDivisibleNumber) {
        var greaterThanExpectedResult = new Condition<Long>(x -> x > smallestDivisibleNumber,
                                                            """
                                                                    greater than:
                                                                    \t%s
                                                                    Important: \
                                                                    Your result is too big, your\
                                                                     number is not the minimum""",
                                                            smallestDivisibleNumber);

        assertThat(challenge.runSolution(maximalNumber))
                .isNot(greaterThanExpectedResult)
                .isEqualTo(smallestDivisibleNumber);
    }
}