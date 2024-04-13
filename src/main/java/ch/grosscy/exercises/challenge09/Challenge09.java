package ch.grosscy.exercises.challenge09;

import ch.grosscy.exercises.core.Challenge;

import java.util.function.Predicate;

public interface Challenge09 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * A Pythagorean triplet is a set of three natural numbers,
     * <i>a < b < c</i>, for which,
     * <br/>
     * <br/>
     * <i>a<sup>2</sup> + b<sup>2</sup> = c<sup>2</sup></i>
     * <br/>
     * <br/>
     * For example, <i>3<sup>2</sup> + 4<sup>2</sup> = 16 = 25 = 5<sup>2</sup></i> .
     * <br/>
     * <br/>
     * There exists exactly one pythagorean triplet for which <i>a + b + c = 1000</i>.
     * Find the product <i>abc</i>.
     * </p>
     */
    long calculate(Predicate<Long> pythagoreanTripletPredicate);

    @Override
    default long runSolution(Predicate<Long> input) {
        return calculate(input);
    }
}
