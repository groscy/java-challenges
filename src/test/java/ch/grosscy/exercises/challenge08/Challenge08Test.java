package ch.grosscy.exercises.challenge08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge08Test {

    Challenge08 challenge08;

    @BeforeEach
    void setup(){
        challenge08 = new Solution08();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 9",
            "4, 5832",
            "9, 61_725_888",
            "13, 23_514_624_000"
    })
    void testPositiveCases(int numberOfAdjacentDigits,
                           long productOfAdjacentDigits) {
        assertThat(challenge08.calculate(numberOfAdjacentDigits))
                .isEqualTo(productOfAdjacentDigits);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 57",
            "4, 10_370_808",
            "9, 2_139_857_920",
            "13, 2_144_416_768"
    })
    void testNegativeCases(int numberOfAdjacentDigits,
                           long productOfAdjacentDigits) {
        assertThat(challenge08.calculate(numberOfAdjacentDigits))
                .as("Important: If you iterate over the string make sure to use " +
                            "the actual number and not the character code!")
                .isNotEqualTo(productOfAdjacentDigits);
    }
}