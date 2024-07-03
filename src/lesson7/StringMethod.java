package lesson7;

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



    }
}
