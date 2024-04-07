package ch.grosscy.exercises.challenge14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p>
 * The following iterative sequence is defined for the
 * set of positive integers:
 * <pre>
 * <i>n → n / 2     2&#8739;n</i>
 * <i>n → 3n + 1    2&#8740;n</i>
 * </pre>
 * <br/>
 * Using the rule above and starting with <i>13</i>, we generate
 * the following sequence:
 * <br/>
 * <br/>
 * <pre>
 * <i>13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1</i>
 * </pre>
 * It can be seen that this sequence
 * (starting at <i>13</i> and finishing at <i>1</i>) contains <i>10</i> terms.
 * Although it has not been proved yet (Collatz Problem),
 * it is thought that all starting numbers finish at <i>1</i>.
 * <br/>
 * <br/>
 * Which starting number, under one million, produces the longest chain?
 * <br/>
 * <br/>
 * <b>NOTE:</b> Once the chain starts the terms are allowed
 * to go above one million.
 * <br/>
 * <a href="https://en.wikipedia.org/wiki/Collatz_conjecture">https://en.wikipedia.org/wiki/Collatz_conjecture</a>
 * </p>
 */
class Challenge14Test {

    Challenge14 challenge14;

    @BeforeEach
    void setup() {
        challenge14 = new Challenge14();
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