package lesson7;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello, World";
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        String textLower = text.toLowerCase();
        System.out.println(textLower);

        int length = text.length();
        System.out.println(length);

        boolean contains = text.contains("Hello");
        System.out.println(contains);

        String replacement = text.replaceAll("r", "a");
        System.out.println(replacement);

        String repeat = text.repeat(10);
        System.out.println(repeat);

        String names = "Petr, Ilya, Gosha";
        String[] namesArrays = names.split(";");
        System.out.println(Arrays.toString(namesArrays));

        String word1 = "Hi";
        String word2 = "Friends";
        String resultWord = word1 + word2;
        System.out.println(resultWord);

        boolean hel = text.startsWith("Hel");
        System.out.println(hel);

        boolean world = text.endsWith("World");
        System.out.println(world);

        String first5Letters = text.substring(0, 5);
        System.out.println(first5Letters);

        int lengthText2 = "Hello".replaceAll("l", "a").toUpperCase().length();
        System.out.println(lengthText2);

    }

}
