package ch.grosscy.exercises.challenge04;

import ch.grosscy.exercises.core.Challenge;
import ch.grosscy.exercises.core.SolutionFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge04Test {

    Challenge challenge = SolutionFactory.getSolution(Challenge04.class);

    @ParameterizedTest
    @CsvSource({
            "2, 9_009",
            "3, 906_609",
            "4, 99_000_099"
    })
    void testPositiveCases(int lengthOfFactors,
                           int expectedPalindrome) {
        assertThat(challenge.runSolution(lengthOfFactors))
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
                           int expectedPalindrome) {
        assertThat(challenge.runSolution(lengthOfFactors))
                .as("The palindrome is valid, but is not the largest palindrome" +
                            "for %s-digit numbers",
                    lengthOfFactors)
                .isNotEqualTo(expectedPalindrome);
    }

}