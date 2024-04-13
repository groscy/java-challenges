package ch.grosscy.exercises.challenge10;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge10Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge10.class);

    @ParameterizedTest
    @CsvSource({
            "10, 17",
            "100, 1_060",
            "1_000, 76_127",
            "10_000, 5_736_396",
            "1_000_000, 37_550_402_023",
            "2_000_000, 142_913_828_922",
    })
    void testPositiveCases(long upperLimit,
                           long expectedSum) {
        assertThat(challenge.runSolution(upperLimit)).isEqualTo(expectedSum);
    }

}