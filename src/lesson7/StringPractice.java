package lesson7;

public class StringPractice {
    public static void main(String[] args) {
        String text = "My name is Marina";
        String[] split = text.substring(11).toLowerCase().split(" ");
        for (String word : split) {
            System.out.println(word);
            System.out.println(word.length());

        }

    }

}
