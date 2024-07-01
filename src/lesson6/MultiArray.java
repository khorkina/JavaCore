package lesson6;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {180, 178, 190};
        int[] group2 = {164, 158, 181};
        int[][] multiArray = {group1, group2};

        upperFor:
        for (int[] array : multiArray) {
            for (int number : array) {
                if (number == 178) {
                    System.out.println("There is a person with 178 cm height");
                    break upperFor;
                } else {
                    System.out.println("There isn't person with 178 cm height");

                }

            }

        }

    }

}
