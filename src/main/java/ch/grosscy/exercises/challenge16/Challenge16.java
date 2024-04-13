package ch.grosscy.exercises.challenge16;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge16 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * <i>2<sup>15</sup> = 32'768</i> and the sum of its digits is
     * <br/>
     * <br/>
     * <i>3 + 2 + 7 + 6 + 8 = 26</i>
     * <br/>
     * <br/>
     * What is the sum of the digits of the number <i>2<sup>1000</sup></i>?
     * </p>
     */
    long calculate(long exponent);

    @Override
    default long runSolution(long input) {
        return calculate(input);
    }
}
