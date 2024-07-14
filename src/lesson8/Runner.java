package lesson8;

public class Runner {
    public static void main(String[] args) {
       Cat cat = new Cat("Black", 45, "Marina");
        System.out.println(cat.color);
        cat.color = "Red";
        System.out.println(cat.color);

        cat.destroySofa("Marina`s");

        String animal = cat.hunt(false);
        System.out.println(animal);

    }

}
