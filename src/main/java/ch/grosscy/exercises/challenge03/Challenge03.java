package ch.grosscy.exercises.challenge03;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Challenge03 implements ImplementationGuide {
    @Override
    public List<Long> calculate(long primeNumber) {
        // TODO Implementation...
        return LongStream.range(2, primeNumber)
                         .parallel()
                         .filter(x -> primeNumber % x == 0)
                         .filter(x -> LongStream.range(2, x - 1)
                                                .parallel()
                                                .allMatch(y -> x % y != 0))
                         .boxed()
                         .collect(Collectors.toList());
    }
}
