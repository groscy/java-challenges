package ch.grosscy.exercises.challenge14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge14Test {

    Challenge14 challenge14;

    @BeforeEach
    void setup() {
        challenge14 = new Solution14();
    }

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
    void testPositiveCases(int upperLimit,
                           long expectedCollatzNumber) {
        assertThat(challenge14.calculate(upperLimit))
                .as("Your collatz number is the one with the longest stopping time up to the " +
                            "upper limit %d",
                    upperLimit)
                .isEqualTo(expectedCollatzNumber);
    }


}