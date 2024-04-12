package ch.grosscy.exercises.challenge04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p> A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is:
 * <br/>
 * <br/>
 * <i>9009 = 91 x 99</i>
 * <br/>
 * <br/>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * </p>
 */
class Challenge04Test {

    Challenge04 challenge04;

    @BeforeEach
    void setup() {
        challenge04 = new Solution04();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 9_009",
            "3, 906_609",
            "4, 99_000_099"
    })
    void testPositiveCases(int lengthOfFactors,
                           int expectedPalindrome){
        assertThat(challenge04.calculate(lengthOfFactors))
                .isEqualTo(expectedPalindrome);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 121",
            "3, 10_201",
            "3, 90_909",
            "3, 580_085",
            "4, 1002001"
    })
    void testNegativeCases(int lengthOfFactors,
                           int expectedPalindrome){
        assertThat(challenge04.calculate(lengthOfFactors))
                .as(STR."The palindrome is valid, but is not the largest palindrome for \{lengthOfFactors}-digit numbers")
                .isNotEqualTo(expectedPalindrome);
    }

}