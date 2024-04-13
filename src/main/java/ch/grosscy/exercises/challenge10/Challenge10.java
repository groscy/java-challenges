package ch.grosscy.exercises.challenge10;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge10 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * The sum of the primes below <i>10</i> is <i>2 + 3 + 5 + 7 = 17</i>.
     * <br/>
     * <br/>
     * Find the sum of all the primes below two million.
     * </p>
     */
    long calculate(long upperLimit);

    @Override
    default long runSolution(long input) {
        return calculate(input);
    }
}
