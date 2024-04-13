package ch.grosscy.exercises.challenge14;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge14 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * The following iterative sequence is defined for the
     * set of positive integers:
     * <pre>
     * <i>n → n / 2     2&#8739;n</i>
     * <i>n → 3n + 1    2&#8740;n</i>
     * </pre>
     * <br/>
     * Using the rule above and starting with <i>13</i>, we generate
     * the following sequence:
     * <br/>
     * <br/>
     * <pre>
     * <i>13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1</i>
     * </pre>
     * It can be seen that this sequence
     * (starting at <i>13</i> and finishing at <i>1</i>) contains <i>10</i> terms.
     * Although it has not been proved yet (Collatz Problem),
     * it is thought that all starting numbers finish at <i>1</i>.
     * <br/>
     * <br/>
     * Which starting number, under one million, produces the longest chain?
     * <br/>
     * <br/>
     * <b>NOTE:</b> Once the chain starts the terms are allowed
     * to go above one million.
     * <br/>
     * <a href="https://en.wikipedia.org/wiki/Collatz_conjecture">https://en.wikipedia.org/wiki/Collatz_conjecture</a>
     * </p>
     */
    long calculate(long upperLimit);

    @Override
    default long runSolution(long input) {
        return calculate(input);
    }
}
