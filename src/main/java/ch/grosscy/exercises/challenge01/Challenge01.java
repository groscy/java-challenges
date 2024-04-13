package ch.grosscy.exercises.challenge01;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge01 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * If we list all the natural numbers below <i>10</i>
     * that are multiples of <i>3</i> or <i>5</i>,
     * we get <i>3</i>, <i>5</i>, <i>6</i> and <i>9</i>.
     * <br />
     * The sum of these multiples is <i>23</i>.
     * <br />
     * Find the sum of all the multiples of <i>3</i> or <i>5</i> below <i>1000</i>.
     * </p>
     */
    int calculate(int maximalNumber);

    @Override
    default int runSolution(int maximalNumber) {
        return calculate(maximalNumber);
    }
}
