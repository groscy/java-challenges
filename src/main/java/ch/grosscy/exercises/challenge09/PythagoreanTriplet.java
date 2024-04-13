package ch.grosscy.exercises.challenge09;

public record PythagoreanTriplet(long a, long b, long c) {
    long sum() {
        return a + b + c;
    }

    long product() {
        return a * b * c;
    }
}
