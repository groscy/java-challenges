package ch.grosscy.exercises.challenge06;

public interface Challenge06 {

    /**
     * <b>Problem description</b>
     * <p>
     * The sum of the squares of the first ten natural numbers is,
     * <br/>
     * <br/>
     * <i>1<sup>2</sup> + 2<sup>2</sup> + ... + 10<sup>2</sup> = 385</i>
     * <br/>
     * <br/>
     * The square of the sum of the first ten natural numbers is,
     * <br/>
     * <br/>
     * <i>(1 + 2 + ... + 10)<sup>2</sup> = 55<sup>2</sup> = 3025</i>
     * <br/>
     * <br/>
     * Hence the difference between the sum of the squares of the
     * first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
     * <br/>
     * <br/>
     * Find the difference between the sum of the squares of the first one hundred natural numbers
     * and the square of the sum.
     * </p>
     */
    long calculate(int upperLimit);

}
