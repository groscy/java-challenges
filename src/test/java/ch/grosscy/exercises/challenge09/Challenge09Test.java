package ch.grosscy.exercises.challenge09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p>
 * A Pythagorean triplet is a set of three natural numbers,
 * <i>a < b < c</i>, for which,
 * <br/>
 * <br/>
 * <i>a<sup>2</sup> + b<sup>2</sup> = c<sup>2</sup></i>
 * <br/>
 * <br/>ö
 * For example, <i>3<sup>2</sup> + 4<sup>2</sup> = 16 = 25 = 5<sup>2</sup></i> .
 * <br/>
 * <br/>
 * There exists exactly one pythagorean triplet for which <i>a + b + c = 1000</i>.
 * Find the product <i>abc</i>.
 * </p>
 */
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