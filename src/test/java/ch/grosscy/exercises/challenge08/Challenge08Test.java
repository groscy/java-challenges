package ch.grosscy.exercises.challenge08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p>
 * The four adjacent digits in the <i>1000</i>-digit number that
 * have the greatest product are <i>9 x 9 x 8 x 9 = 5832</i>.
 * <br/>
 * <br/>
 * <tt>
 * 73167176531330624919225119674426574742355349194934<br/>
 * 96983520312774506326239578318016984801869478851843<br/>
 * 85861560789112949495459501737958331952853208805511<br/>
 * 12540698747158523863050715693290963295227443043557<br/>
 * 66896648950445244523161731856403098711121722383113<br/>
 * 62229893423380308135336276614282806444486645238749<br/>
 * 30358907296290491560440772390713810515859307960866<br/>
 * 70172427121883998797908792274921901699720888093776<br/>
 * 65727333001053367881220235421809751254540594752243<br/>
 * 52584907711670556013604839586446706324415722155397<br/>
 * 53697817977846174064955149290862569321978468622482<br/>
 * 83972241375657056057490261407972968652414535100474<br/>
 * 82166370484403199890008895243450658541227588666881<br/>
 * 16427171479924442928230863465674813919123162824586<br/>
 * 17866458359124566529476545682848912883142607690042<br/>
 * 24219022671055626321111109370544217506941658960408<br/>
 * 07198403850962455444362981230987879927244284909188<br/>
 * 84580156166097919133875499200524063689912560717606<br/>
 * 05886116467109405077541002256983155200055935729725<br/>
 * 71636269561882670428252483600823257530420752963450<br/>
 * </tt>
 * <br/>
 * <br/>
 * Find the thirteen adjacent digits in the
 * <i>1000</i>-digit number that have the greatest product. What is the value of this product?
 * </p>
 */
class Challenge08Test {

    Challenge08 challenge08;

    @BeforeEach
    void setup(){
        challenge08 = new Challenge08();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 9",
            "4, 5832",
            "9, 61_725_888",
            "13, 23_514_624_000"
    })
    void testPositiveCases(int numberOfAdjacentDigits,
                           long productOfAdjacentDigits) {
        assertThat(challenge08.calculate(numberOfAdjacentDigits))
                .isEqualTo(productOfAdjacentDigits);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 57",
            "4, 10_370_808",
            "9, 2_139_857_920",
            "13, 2_144_416_768"
    })
    void testNegativeCases(int numberOfAdjacentDigits,
                           long productOfAdjacentDigits) {
        assertThat(challenge08.calculate(numberOfAdjacentDigits))
                .as("Important: If you iterate over the string make sure to use " +
                            "the actual number and not the character code!")
                .isNotEqualTo(productOfAdjacentDigits);
    }
}