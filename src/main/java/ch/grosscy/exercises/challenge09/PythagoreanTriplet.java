package ch.grosscy.exercises.challenge09;

public record PythagoreanTriplet(int a, int b, int c) {
    int sum() {
        return a + b + c;
    }

    int product() {
        return a * b * c;
    }
}
