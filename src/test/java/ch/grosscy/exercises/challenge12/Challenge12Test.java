package ch.grosscy.exercises.challenge12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * <b>Problem description</b>
 * <p>
 * The sequence of triangle numbers is generated by adding
 * the natural numbers. So the <i>7</i><sup>th</sup> triangle number
 * would be <i>1 + 2 + 3 + 4 + 5 + 6 + 7 = 28</i>.
 * The first ten terms would be:
 * <br/>
 * <br/>
 * <i>1,3,6,10,15,21,28,36,45,55,...</i>
 * <br/>
 * <br/>
 * Let us list the factors of the first seven triangle numbers:<br/>
 * <br/>
 * <i><b>1:</b>1</i><br/>
 * <i><b>3:</b>1,3</i><br/>
 * <i><b>6:</b>1,2,3,6</i><br/>
 * <i><b>10:</b>1,2,5,10</i><br/>
 * <i><b>15:</b>1,3,5,15</i><br/>
 * <i><b>21:</b>1,3,7,21</i><br/>
 * <i><b>28:</b>1,2,4,7,14,28</i><br/>
 * <br/>
 * We can see that <i>28</i> is the first triangle number to
 * have over five divisors.
 * <br/>
 * <br/>
 * What is the value of the first triangle number to
 * have over five hundred divisors?
 * </p>
 */
class Challenge12Test {
    Challenge12 challenge12;

    @BeforeEach
    void setup(){
        challenge12 = new Challenge12();
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