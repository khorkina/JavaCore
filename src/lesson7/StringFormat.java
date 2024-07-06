package lesson7;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Marina";
        int age = 18;
        //String phrase = "I am " + name + "I am " + age + "  years";
        String phrase = String.format("I am %s, I am %s years ", name, age);
        System.out.println(phrase);

    }

}
