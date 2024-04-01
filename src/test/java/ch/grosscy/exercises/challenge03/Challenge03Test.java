package ch.grosscy.exercises.challenge03;

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
 * The prime factors of <i>13'195</i>
 * are <i>5</i>,<i>7</i>,<i>13</i> and <i>29</i>.
 * <br />
 * What is the largest prime factor of the number <i>600'851'475'143</i>?
 * </p>
 */
class Challenge03Test {

    Challenge03 challenge03;

    @BeforeEach
    void setup() {
        challenge03 = new Challenge03();
    }

    @ParameterizedTest
    @CsvSource({
            "6,2|3",
            "13,",
            "129,3|43",
            "13_195,5|7|13|29",
            "298_928,2|7|17|157",
            "600_851_475_143,71|839|1471|6857"
    })
    void testPositiveCases(long input,
                           @ConvertWith(StringToListArgumentConverter.class)
                           List<Long> expectedResult) {
        List<Long> result = challenge03.calculate(input);

        assertThat(result)
                .as(STR."less than:\n\t\{expectedResult}\n" +
                            "Important: Some prime factors are missing!")
                .hasSameSizeAs(expectedResult)
                .as("\nThere are some prime factors that are wrong check your calculation!\n" +
                            STR."You can ignore 1 and \{input}\n")
                .containsAll(expectedResult);
    }

}