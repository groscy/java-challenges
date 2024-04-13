package ch.grosscy.exercises.challenge16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Solution16Test {
    Challenge16 challenge16;

    @BeforeEach
    void setup() {
        challenge16 = new Solution16();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 4",
            "3, 8",
            "4, 7",
            "5, 5",
            "10, 7",
            "15, 26",
            "1_000, 88"
    })
    void testPositiveCases(int exponent,
                           long expectedDigitSum) {
        assertThat(challenge16.calculate(exponent))
                .as("Your digit sum %s is not correct!", expectedDigitSum)
                .isEqualTo(expectedDigitSum);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 52",
            "3, 56",
            "4, 103",
            "5, 101",
            "10, 199",
            "15, 266",
            "1_000, 1_000"
    })
    void testNegativeCases(int exponent,
                           long unexpectedDigitSum) {
        assertThat(challenge16.calculate(exponent))
                .as("Your digit sum should not be %s, make sure you use the numeric value of your" +
                            " character and not the actual Ascii character code!",
                    unexpectedDigitSum)
                .isNotEqualTo(unexpectedDigitSum);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3",
            "2, 146",
            "3, 7",
            "3, 150",
            "4, 6",
            "4, 197",
            "5, 4",
            "5, 195",
            "10, 6",
            "10, 293",
            "15, 25",
            "15, 360",
            "1_000, 85",
            "1_000, 1_147"
    })
    void testNegativeDoubleCases(int exponent,
                                 long unexpectedDigitSum) {
        assertThat(challenge16.calculate(exponent))
                .as("Your digit sum should not be %s, make sure you use the numeric value of your" +
                            " character and not the actual Ascii character code!",
                    unexpectedDigitSum)
                .isNotEqualTo(unexpectedDigitSum);
    }
}