package lesson8;

public class RunnerDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Muchtar", -10, "Marina");
        System.out.println(dog);
        dog.setWeight(-1);
        System.out.println(dog);
        System.out.println(dog.getOwner());

        Dog dog1 = new Dog();
        System.out.println(dog1);


    }

}
