package ch.grosscy.exercises.challenge07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p>
 * By listing the first six prime numbers:
 * <br/>
 * <br/>
 * <i>2, 3, 5, 7, 11, 13</i>
 * <br/>
 * <br/>
 * We can see that the <i>6th</i> prime is <i>13</i>.
 * <br/>
 * What is the <i>10'001st</i> prime number?
 * </p>
 *
 */
class Challenge07Test {

    Challenge07 challenge07;

    @BeforeEach
    void setup(){
        challenge07 = new Challenge07();
    }

    @ParameterizedTest
    @CsvSource({
            "3, 5",
            "5, 11",
            "7, 17",
            "10, 29",
            "50, 229",
            "100, 541",
            "1_000, 7_919",
            "10_001, 104_743",
            "100_001, 1_299_721",
            "1_000_001, 15_485_867"
    })
    void testPositiveCases(long positionOfPrime,
                           long expectedPrimeNumber) {
        assertThat(challenge07.calculate(positionOfPrime))
                .isEqualTo(expectedPrimeNumber);
    }
}