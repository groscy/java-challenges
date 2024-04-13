package ch.grosscy.exercises.challenge03;

import ch.grosscy.exercises.core.Challenge;

import java.util.List;

public interface Challenge03 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * The prime factors of <i>13'195</i>
     * are <i>5</i>,<i>7</i>,<i>13</i> and <i>29</i>.
     * <br />
     * What is the largest prime factor of the number <i>600'851'475'143</i>?
     * </p>
     */
    List<Long> calculate(long maximalNumber);

    @Override
    default List<Long> runSolutionProducingList(long input) {
        return calculate(input);
    }
}
