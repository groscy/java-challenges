package ch.grosscy.exercises.challenge07;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge07Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge07.class);

    @ParameterizedTest
    @CsvSource({
            "3, 5",
            "5, 11",
            "7, 17",
            "10, 29",
            "50, 229",
            "100, 541",
            "1_000, 7_919",
            "10_001, 104_743",
            "100_001, 1_299_721",
            "1_000_001, 15_485_867"
    })
    void testPositiveCases(long positionOfPrime,
                           long expectedPrimeNumber) {
        assertThat(challenge.runSolution(positionOfPrime))
                .isEqualTo(expectedPrimeNumber);
    }
}