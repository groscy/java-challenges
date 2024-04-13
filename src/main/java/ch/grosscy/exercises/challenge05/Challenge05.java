package ch.grosscy.exercises.challenge05;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge05 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * <i>2520</i> is the smallest number that can be divided by each of the numbers
     * from <i>1</i> to <i>10</i> without any remainder.
     * <br/>
     * What is the smallest positive number that is <b>evenly divisible</b>
     * by all the numbers from <i>1</i> to <i>20</i>?
     * </p>
     */
    long calculate(long upperLimit);

    @Override
    default long runSolution(long input) {
        return calculate(input);
    }
}
