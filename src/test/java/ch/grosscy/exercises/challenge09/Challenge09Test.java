package ch.grosscy.exercises.challenge09;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class Challenge09Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge09.class);

    @ParameterizedTest
    @CsvSource({
            "12, 60",
            "90, 14_760",
            "208, 277_680",
            "1000, 31_875_000",
            "1450, 78_073_800",
    })
    void testPositiveCases(long sumOfTriplets,
                           long expectedProductOfTriplet) {
        assertThat(challenge.runSolution(tripletSum -> tripletSum == sumOfTriplets))
                .isEqualTo(expectedProductOfTriplet);
    }

}