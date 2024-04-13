package ch.grosscy.exercises.challenge15;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge15 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * Starting in the top left corner of a <i>2 x 2</i> grid,
     * and only being able to move to the right and down, there are exactly
     * routes to the bottom right corner.
     * <br/>
     * <br/>
     * <img src="https://projecteuler.net/resources/images/0015.png?1678992052" width="200" />
     * <br/>
     * <br/>
     * How many such routes are there through a <i>20 x 20</i> grid?
     * </p>
     */
    long calculate(long gridSize);

    @Override
    default long runSolution(long input) {
        return calculate(input);
    }
}
