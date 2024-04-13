package ch.grosscy.exercises.challenge03;

import ch.grosscy.exercises.utils.ParameterConversionUtils.StringToListArgumentConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Challenge03Test {

    Challenge03 challenge03;

    @BeforeEach
    void setup() {
        challenge03 = new Solution03();
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
                .as("""
                            less than:
                            \t%s
                            Important: Some prime factors are missing!""", expectedResult)
                .hasSameSizeAs(expectedResult)
                .as("""
                            There are some prime factors that are wrong check your calculation!
                            You can ignore 1 and %s
                            """, input)
                .containsAll(expectedResult);
    }

}