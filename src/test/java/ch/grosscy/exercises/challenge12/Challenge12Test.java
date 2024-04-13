package ch.grosscy.exercises.challenge12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class Challenge12Test {

    Challenge12 challenge12;

    @BeforeEach
    void setup(){
        challenge12 = new Solution12();
    }

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
    void testPositiveCases(int numberOfDivisors,
                           long expectedTriangleNumber) {
        assertThat(challenge12.calculate(numberOfDivisors))
                .as("Your triangle number is wrong: %d follow the implementation hints if you get stuck!", expectedTriangleNumber)
                .isEqualTo(expectedTriangleNumber);
    }

}