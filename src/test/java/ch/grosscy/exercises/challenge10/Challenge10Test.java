package ch.grosscy.exercises.challenge10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge10Test {

    Challenge10 challenge10;

    @BeforeEach
    void setup(){
        challenge10 = new Solution10();
    }

    @ParameterizedTest
    @CsvSource({
            "10, 17",
            "100, 1_060",
            "1_000, 76_127",
            "10_000, 5_736_396",
            "1_000_000, 37_550_402_023",
            "2_000_000, 142_913_828_922",
    })
    void testPositiveCases(int upperLimit,
                           long expectedSum) {
        assertThat(challenge10.calculate(upperLimit))
                .isEqualTo(expectedSum);
    }

}