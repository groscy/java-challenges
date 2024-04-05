package ch.grosscy.exercises.challenge11;

import ch.grosscy.exercises.utils.ParameterConversionUtils.StringToListArgumentConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <b>Problem description</b>
 * <p>
 * In the <i>20 x 20</i> grid below, four numbers along a
 * diagonal line have been marked in red.
 * <br/>
 * <br/>
 * <tt>
 * 08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08<br/>
 * 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00<br/>
 * 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65<br/>
 * 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91<br/>
 * 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80<br/>
 * 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50<br/>
 * 32 98 81 28 64 23 67 10 <span style="color:red">26</span> 38 40 67 59 54 70 66 18 38 64 70<br/>
 * 67 26 20 68 02 62 12 20 95 <span style="color:red">63</span> 94 39 63 08 40 91 66 49 94 21<br/>
 * 24 55 58 05 66 73 99 26 97 17 <span style="color:red">78</span> 78 96 83 14 88 34 89 63 72<br/>
 * 21 36 23 09 75 00 76 44 20 45 35 <span style="color:red">14</span> 00 61 33 97 34 31 33 95<br/>
 * 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92<br/>
 * 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57<br/>
 * 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58<br/>
 * 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40<br/>
 * 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66<br/>
 * 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69<br/>
 * 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36<br/>
 * 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16<br/>
 * 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54<br/>
 * 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48<br/>
 * </tt>
 * <br/>
 * <br/>
 * The product of these numbers is <i>26 x 63 x 78 x 14 = 1788696</i>.
 * <br/>
 * <br/>
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the <i>20 x 20</i> grid?
 * </p>
 */
class Challenge11Test {
    Challenge11 challenge11;

    @BeforeEach
    void setup(){
        challenge11 = new Challenge11();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 99, 99",
            "2, 9_306, 99|94",
            "3, 811_502, 97|94|89",
            "4, 51_267_216, 97|88|91|66",
            "5, 2_509_995_600, 81|85|40|93|98",
    })
    void testPositiveCases(int searchRayLength,
                           long expectedProduct,
                           @ConvertWith(StringToListArgumentConverter.class)
                           List<Integer> numbersToLookFor) {
        assertThat(challenge11.calculate(searchRayLength))
                .as("Your product does not match look for the following numbers: " + numbersToLookFor)
                .isEqualTo(expectedProduct);
    }

}