package ch.grosscy.exercises.challenge02;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.assertj.core.api.Condition;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge02Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge02.class);

    @ParameterizedTest
    @CsvSource({
            "10, 10",
            "20, 10",
            "40, 44",
            "100, 44",
            "2900, 3_382",
            "40_900, 14_328",
            "560_923, 257_114",
            "4_000_000, 4_613_732",
    })
    void testPositiveCases(int input, int expectedResult) {
        int result = challenge.runSolution(input);
        var smallerThanExpectedResult = new Condition<Integer>(x -> x < expectedResult,
                                                               """
                                                                       smaller than:
                                                                       \t%s
                                                                       Important: \
                                                                       Your result is too small \
                                                                       do you\
                                                                        have all the numbers of \
                                                                       the fibonacci series in \
                                                                       your calculation""",
                                                               expectedResult);
        var greaterThanExpectedResult = new Condition<Integer>(x -> x > expectedResult,
                                                               """
                                                                       greater than:
                                                                       \t%s
                                                                       Important: \
                                                                       Your result is too big do\
                                                                        only use the numbers of \
                                                                       the fibonacci series \
                                                                       below %s""",
                                                               expectedResult,
                                                               input);
        assertThat(result)
                .isNot(smallerThanExpectedResult)
                .isNot(greaterThanExpectedResult)
                .isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 19",
            "20, 32",
            "40, 87",
            "100, 231",
            "2900, 6_763",
            "40_900, 75_023",
            "560_923, 1_346_267",
            "4_000_000, 9_227_463",
    })
    void testNegativeCases(int input, int expectedResult) {
        int result = challenge.runSolution(input);

        assertThat(result)
                .as("Do not forget to only use even fibonacci numbers!")
                .isNotEqualTo(expectedResult);
    }
}