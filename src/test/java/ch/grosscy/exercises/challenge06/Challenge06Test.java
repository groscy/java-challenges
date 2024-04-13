package ch.grosscy.exercises.challenge06;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge06Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge06.class);

    @ParameterizedTest
    @CsvSource({
            "5, 170",
            "10, 2_640",
            "50, 1_582_700",
            "100, 25_164_150"
    })
    void testPositiveCases(long upperLimit,
                           long expectedDifferenceOfSquares) {
        assertThat(challenge.runSolution(upperLimit))
                .isEqualTo(expectedDifferenceOfSquares);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 45",
            "5, 70",
            "5, 195",
            "10, 1_640",
            "10, 1_740",
            "10, 2_740",
            "50, 1_457_700",
            "50, 1_460_200",
            "50, 1_585_200",
            "100, 24_164_150",
            "100, 24_174_150",
            "100, 25_174_150"
    })
    void testNegativeCases_wrongRange(long upperLimit,
                                      long expectedDifferenceOfSquares) {
        assertThat(challenge.runSolution(upperLimit))
                .as("Important: Check that you include the range from 1 to %s (inclusive)", upperLimit)
                .isNotEqualTo(expectedDifferenceOfSquares);
    }

    @ParameterizedTest
    @CsvSource({
            "5, -600",
            "10, -18_150",
            "50, -53_103_750",
            "100, -1_683_165_000"
    })
    void testNegativeCases_wrongOperationOrder(long upperLimit,
                                               long expectedDifferenceOfSquares) {
        assertThat(challenge.runSolution(upperLimit))
                .as("Important: Check your order of operators (*) before (-)")
                .isNotEqualTo(expectedDifferenceOfSquares);
    }

}