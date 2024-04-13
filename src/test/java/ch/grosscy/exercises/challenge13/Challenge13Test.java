package ch.grosscy.exercises.challenge13;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class Challenge13Test {

    private static final String EXPECTED_SUM =
            "5537376230390876637302048746832985971773659831892672";

    Challenge challenge = SolutionFactory.getSolution(Challenge13.class);

    @ParameterizedTest
    @CsvSource({"1", "3", "4", "5", "10"})
    void testPositiveCases(int numberFirstDigits) {
        assertThat(challenge.runSolutionProducesString(numberFirstDigits))
                .as("Check your sum is equal to '%s' your first %d-digits are not correct!",
                    EXPECTED_SUM,
                    numberFirstDigits)
                .isEqualTo(EXPECTED_SUM.substring(0, numberFirstDigits));
    }

}