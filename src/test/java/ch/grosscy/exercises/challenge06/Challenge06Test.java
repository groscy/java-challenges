package ch.grosscy.exercises.challenge06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p>
 * The sum of the squares of the first ten natural numbers is,
 * <br/>
 * <br/>
 * <i>1<sup>2</sup> + 2<sup>2</sup> + ... + 10<sup>2</sup> = 385</i>
 * <br/>
 * <br/>
 * The square of the sum of the first ten natural numbers is,
 * <br/>
 * <br/>
 * <i>(1 + 2 + ... + 10)<sup>2</sup> = 55<sup>2</sup> = 3025</i>
 * <br/>
 * <br/>
 * Hence the difference between the sum of the squares of the
 * first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * <br/>
 * <br/>
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 * </p>
 */
class Challenge06Test {

    Challenge06 challenge06;

    @BeforeEach
    void setup() {
        challenge06 = new Challenge06();
    }

    @ParameterizedTest
    @CsvSource({
            "5, 170",
            "10, 2_640",
            "50, 1_582_700",
            "100, 25_164_150"
    })
    void testPositiveCases(int upperLimit,
                           int expectedDifferenceOfSquares) {
        assertThat(challenge06.calculate(upperLimit))
                .isEqualTo(expectedDifferenceOfSquares);
    }

    @ParameterizedTest
    @CsvSource({
            "5, 45",
            "5, 70",
            "5, 195",
            "10, 1_640",
            "10, 1_740",
            "10, 2_740",
            "50, 1_457_700",
            "50, 1_460_200",
            "50, 1_585_200",
            "100, 24_164_150",
            "100, 24_174_150",
            "100, 25_174_150"
    })
    void testNegativeCases_wrongRange(int upperLimit,
                                      int expectedDifferenceOfSquares) {
        assertThat(challenge06.calculate(upperLimit))
                .as(STR."Important: Check that you include the range from 1 to \{upperLimit} (inclusive)")
                .isNotEqualTo(expectedDifferenceOfSquares);
    }

    @ParameterizedTest
    @CsvSource({
            "5, -600",
            "10, -18_150",
            "50, -53_103_750",
            "100, -1_683_165_000"
    })
    void testNegativeCases_wrongOperationOrder(int upperLimit,
                                               int expectedDifferenceOfSquares) {
        assertThat(challenge06.calculate(upperLimit))
                .as("Important: Check your order of operators (*) before (-)")
                .isNotEqualTo(expectedDifferenceOfSquares);
    }

}