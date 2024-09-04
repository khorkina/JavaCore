package MethodsComputer;

public class AgeCalculation {

    public static int digitsSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int digitsProduct(int num) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }

    public static void findAges() {
        for (int m = 10; m < 100; m++) {
            int maxAgeNow = digitsSum(m);
            int maxAgeInFiveYears = maxAgeNow + 5;

            int minFiveYears = m + 5;
            int productOfDigits = digitsProduct(minFiveYears);

            if (maxAgeInFiveYears == productOfDigits) {
                System.out.printf("Сегодня Максу %d лет, а Морицу %d лет.%n", maxAgeNow, m);
                return;
            }
        }
    }

    public static void main(String[] args) {
        findAges();
    }
}

