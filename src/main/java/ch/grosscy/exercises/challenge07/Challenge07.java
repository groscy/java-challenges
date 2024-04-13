package ch.grosscy.exercises.challenge07;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge07 extends Challenge {

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
    long calculate(long upperLimit);

    @Override
    default long runSolution(long input) {
        return calculate(input);
    }
}
