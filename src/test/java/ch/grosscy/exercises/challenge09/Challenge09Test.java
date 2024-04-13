package ch.grosscy.exercises.challenge09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class Challenge09Test {

    Challenge09 challenge09;

    @BeforeEach
    void setup(){
        challenge09 = new Solution09();
    }

    @ParameterizedTest
    @CsvSource({
            "12, 60",
            "90, 14_760",
            "208, 277_680",
            "1000, 31_875_000",
            "1450, 78_073_800",
    })
    void testPositiveCases(int sumOfTriplets,
                           long expectedProductOfTriplet) {
        assertThat(challenge09.calculate(triplet -> triplet.sum() == sumOfTriplets))
                .isEqualTo(expectedProductOfTriplet);
    }

}