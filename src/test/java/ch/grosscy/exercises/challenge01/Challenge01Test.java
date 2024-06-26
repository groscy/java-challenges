package ch.grosscy.exercises.challenge01;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.assertj.core.api.Condition;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class Challenge01Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge01.class);

    @ParameterizedTest
    @CsvSource({
            "10, 23",
            "100, 2_318",
            "1000, 233_168",
            "10000, 23_331_668",
    })
    void testPositiveCases(int input, int expectedResult) {
        int result = challenge.runSolution(input);
        var smallerThanExpectedResult = new Condition<Integer>(x -> x < expectedResult,
                                                               """
                                                                       smaller than:
                                                                       \t%s
                                                                       Important: \
                                                                       Your result is too small \
                                                                       do you have all the \
                                                                       numbers divisible by 3 OR\
                                                                        5 in your calculation""",
                                                               expectedResult);
        var greaterThanExpectedResult = new Condition<Integer>(x -> x > expectedResult,
                                                               """
                                                                       greater \
                                                                       than:
                                                                       \t%s
                                                                       Important: \
                                                                       Your result is too big do\
                                                                        only calculate with \
                                                                       numbers below %s""",
                                                               expectedResult,
                                                               input);
        assertThat(result)
                .isNot(smallerThanExpectedResult)
                .isNot(greaterThanExpectedResult)
                .isEqualTo(expectedResult);
    }
}