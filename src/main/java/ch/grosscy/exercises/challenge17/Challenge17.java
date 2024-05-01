package ch.grosscy.exercises.challenge17;

import ch.grosscy.exercises.core.Challenge;

public interface Challenge17 extends Challenge {

    /**
     * <b>Problem description</b>
     * <p>
     * If the numbers <i>1</i> to <i>5</i> are written out in words:
     * one, two, three, four, five, then there are
     * <i>3 + 3 + 5 + 4 + 4 = 19</i> letters used in total.
     * <br/>
     * <br/>
     * If all the numbers from <i>1</i> to <i>1'000</i> (one thousand)
     * inclusive were written out in words, how many letters would be used?
     * <br/>
     * <br/>
     * <b>NOTE:</b> Do not count spaces or hyphens.
     * For example, <i>342</i> (three hundred and forty-two) contains
     * <i>23</i> letters and <i>115</i> (one hundred and fifteen) contains
     * <i>20</i> letters.
     * The use of "and" when writing out numbers is in compliance
     * with British usage.
     *  </p>
     */
    long calculate(long upperLimit);

    /**
     * <b>Sub-Problem description</b>
     * <p>
     * Find a way to generate the english string representation
     * of a given number
     * </p>
     */
    String numberToWord(long number);

    @Override
    default long runSolution(long input) {
        return calculate(input);
    }
}
