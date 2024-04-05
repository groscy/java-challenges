package ch.grosscy.exercises.challenge09;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Challenge09 implements ImplementationGuide {

    public static final int LIMIT = 1000;

    private static List<PythagoreanTriplet> findPythagoreanTripletsUpTo(int upperLimit) {
        // TODO Implementation...
        return List.of(new PythagoreanTriplet(3, 4, 5));
    }

    @Override
    public long calculate(Predicate<PythagoreanTriplet> pythagoreanTripletPredicate) {
        List<PythagoreanTriplet> list = findPythagoreanTripletsUpTo(LIMIT);
        var pythagoreanTripletWithSum1000 =
                findTripletWithCondition(list, pythagoreanTripletPredicate);

        return pythagoreanTripletWithSum1000.map(PythagoreanTriplet::product)
                                            .orElse(-1);
    }

    private static Optional<PythagoreanTriplet> findTripletWithCondition(
            List<PythagoreanTriplet> list,
            Predicate<PythagoreanTriplet> tripletCondition) {
        for (PythagoreanTriplet triplet : list) {
            if (tripletCondition.test(triplet)) {
                return Optional.of(triplet);
            }
        }
        return Optional.empty();
    }

    public record PythagoreanTriplet(int a, int b, int c) {
        int sum() {
            return a + b + c;
        }

        int product() {
            return a * b * c;
        }
    }

}
