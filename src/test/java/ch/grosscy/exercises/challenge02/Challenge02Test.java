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
            "10, 19",
            "20, 32",
            "30, 53",
            "4_000_000, 9_227_463",
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
}