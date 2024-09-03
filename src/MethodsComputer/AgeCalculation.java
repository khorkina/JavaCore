package MethodsComputer;

public class AgeCalculation {
    public static void main(String[] args) {
        int maxAgeNow = 0;
        for (int m = 10; m < 100; m++) {
            int a = m / 10;
            int b = m % 10;
            maxAgeNow = a + b;


            int mFuture = m + 5;
            int maxAgeFuture = maxAgeNow + 5;
            if (maxAgeFuture == digitsProduct(mFuture)) {
                break;
            }
        }
        System.out.println("Max's age now is: " + maxAgeNow);
    }

    public static int digitsProduct(int num) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }
}

