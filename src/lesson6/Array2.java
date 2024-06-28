package lesson6;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int x = 6;
        int y = 8;

        int[] array = {x, y};
        int[] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[0] = 12;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }

}
