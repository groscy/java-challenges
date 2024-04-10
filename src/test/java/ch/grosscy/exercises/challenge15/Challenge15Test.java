package ch.grosscy.exercises.challenge15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

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
class Challenge15Test {

    Challenge15 challenge15;

    @BeforeEach
    void setup() {
        challenge15 = new Challenge15();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 6",
            "3, 20",
            "4, 70",
            "5, 252",
            "10, 184_756",
            "15, 155_117_520",
            "20, 137_846_528_820"
    })
    void testPositiveCases(int gridSize,
                           long expectedNumberOfPaths) {
        assertThat(challenge15.calculate(gridSize))
                .as("Your number is not: %d %nThis is not correct the number you search can be found inside a pascal triangle!", expectedNumberOfPaths)
                .isEqualTo(expectedNumberOfPaths);
    }

}