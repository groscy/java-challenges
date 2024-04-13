package ch.grosscy.exercises.challenge04;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge04 extends Challenge {

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
    int calculate(int maximalNumber);

    @Override
    default int runSolution(int input) {
        return calculate(input);
    }
}
