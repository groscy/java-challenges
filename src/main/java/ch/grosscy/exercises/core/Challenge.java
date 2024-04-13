package ch.grosscy.exercises.core;

import java.util.List;
import java.util.function.Predicate;

public interface Challenge {

    default int runSolution(int input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    default long runSolution(long input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    default long runSolution(Predicate<Long> input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    default List<Long> runSolutionProducingList(long input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    default String runSolutionProducesString(int input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
