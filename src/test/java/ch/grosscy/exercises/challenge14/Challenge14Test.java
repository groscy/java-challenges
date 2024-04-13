package ch.grosscy.exercises.challenge14;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge14Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge14.class);

    @ParameterizedTest
    @CsvSource({
            "10, 9",
            "100, 97",
            "1_000, 871",
            "10_000, 6171",
            "100_000, 77_031",
            "1_000_000, 837_799",
            "10_000_000, 8_400_511"
    })
    void testPositiveCases(long upperLimit,
                           long expectedCollatzNumber) {
        assertThat(challenge.runSolution(upperLimit))
                .as("Your collatz number is the one with the longest stopping time up to the " +
                            "upper limit %d",
                    upperLimit)
                .isEqualTo(expectedCollatzNumber);
    }


}