package ch.grosscy.exercises.challenge17;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge17Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge17.class);

    @ParameterizedTest
    @CsvSource({
            "5, 19",
            "10, 39",
            "20, 112",
            "28, 192",
            "128, 1_465",
            "1_000, 23_447",
            "1_028, 23_999"
    })
    void testPositiveCases(long exponent,
                           long expectedDigitSum) {
        assertThat(challenge.runSolution(exponent))
                .as("Your digit sum is not correct!", expectedDigitSum)
                .isEqualTo(expectedDigitSum);
    }

    @ParameterizedTest
    @CsvSource({
            "0, zero",
            "1, one",
            "10, ten",
            "17, seventeen",
            "21, twenty-one",
            "50, fifty",
            "100, one hundred",
            "243, two hundred and forty-three",
            "1598, one thousand five hundred and ninety-eight",
            "2000, two thousand",

    })
    void testPositiveCasesNumberToWord(int number,
                                       String expectedWord) {
        assertThat(((Challenge17) challenge).numberToWord(number))
                .as("Your digit sum is not correct!")
                .isEqualTo(expectedWord);
    }
}