package ch.grosscy.exercises.challenge12;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class Challenge12Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge12.class);

    @ParameterizedTest
    @CsvSource({
            "1, 3",
            "3, 6",
            "4, 28",
            "5, 28",
            "10, 120",
            "50, 25_200",
            "100, 73_920",
            "250, 2_162_160",
            "500, 76_576_500",
    })
    void testPositiveCases(long numberOfDivisors,
                           long expectedTriangleNumber) {
        assertThat(challenge.runSolution(numberOfDivisors))
                .as("Your triangle number is wrong: %d follow the implementation hints if you get stuck!", expectedTriangleNumber)
                .isEqualTo(expectedTriangleNumber);
    }

}