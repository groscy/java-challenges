package ch.grosscy.exercises.challenge08;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge08Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge08.class);

    @ParameterizedTest
    @CsvSource({
            "1, 9",
            "4, 5832",
            "9, 61_725_888",
            "13, 23_514_624_000"
    })
    void testPositiveCases(long numberOfAdjacentDigits,
                           long productOfAdjacentDigits) {
        assertThat(challenge.runSolution(numberOfAdjacentDigits))
                .isEqualTo(productOfAdjacentDigits);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 57",
            "4, 10_370_808",
            "9, 2_139_857_920",
            "13, 2_144_416_768"
    })
    void testNegativeCases(long numberOfAdjacentDigits,
                           long productOfAdjacentDigits) {
        assertThat(challenge.runSolution(numberOfAdjacentDigits))
                .as("Important: If you iterate over the string make sure to use " +
                            "the actual number and not the character code!")
                .isNotEqualTo(productOfAdjacentDigits);
    }
}