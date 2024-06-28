package lesson6;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int x = 6;
        int y = 8;

        int[] array = {x, y};
        int[] array2 = array;
        array2[0] = 12;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }

}
