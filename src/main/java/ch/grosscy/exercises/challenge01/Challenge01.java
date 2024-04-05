package ch.grosscy.exercises.challenge01;

public class Challenge01 implements ImplementationGuide {

    @Override
    public int calculate(int maximalNumber) {
        // TODO Implementation...
        int sum = 0;
        for (int i = 0; i < maximalNumber; i++) {
            if (i%3==0 && i%5==0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Challenge01 challenge01 = new Challenge01();
        System.out.println();
        System.out.println("The sum of all multiples is " + challenge01.calculate(1000));
    }
}
