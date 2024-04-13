package ch.grosscy.exercises.challenge11;

import ch.grosscy.exercises.utils.ParameterConversionUtils.StringToListArgumentConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class Challenge11Test {

    Challenge11 challenge11;

    @BeforeEach
    void setup(){
        challenge11 = new Solution11();
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
                .as("Your product does not match look for the following numbers: %s", numbersToLookFor)
                .isEqualTo(expectedProduct);
    }

}