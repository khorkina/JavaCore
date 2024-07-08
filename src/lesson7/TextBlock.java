package lesson7;

public class TextBlock {
    public static void main(String[] args) {
        String name1 = "Anna";
        String name2 = "Maina";
        String text = """
                Hi, what is your name?
                My name is %s. And you?
                My name is %s.
                """.formatted(name1, name2);
        System.out.println(text);

    }

}
