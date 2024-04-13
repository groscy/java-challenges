package ch.grosscy.exercises.challenge09;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Solution09 implements Challenge09 {

    public static final int LIMIT = 1000;

    private static List<PythagoreanTriplet> findPythagoreanTripletsUpTo(int upperLimit) {
        // TODO Implementation...
        return List.of(new PythagoreanTriplet(1, 2, 3));
    }

    @Override
    public long calculate(Predicate<PythagoreanTriplet> pythagoreanTripletPredicate) {
        List<PythagoreanTriplet> list = findPythagoreanTripletsUpTo(LIMIT);
        var pythagoreanTripletWithPredicate =
                findTripletWithCondition(list, pythagoreanTripletPredicate);

        return pythagoreanTripletWithPredicate.map(PythagoreanTriplet::product)
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

}
