package lesson6;

public class ForI {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
            System.out.println(numbers[i]);

            int[] numbers2 = {3, 5, 18, 32};
            for (int number : numbers2) {
                if (number % 2 == 0) {
                    System.out.println(number);

                }

            }

            System.out.println("____________");
            for (int j = 0; j < numbers2.length; j++) {
                if (j % 2 == 0) {
                    System.out.println(numbers2[j]);

                }

            }

        }

    }

}
