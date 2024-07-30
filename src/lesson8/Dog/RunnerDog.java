package lesson8;

import lesson8.cat.Cat;
import lesson8.cat.zoo.Zoo;

public class RunnerDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Muchtar", -10, "Marina");
        Cat cat = new Cat("black", 20, "Marina");
        Zoo zoo = new Zoo(dog, cat);
        zoo.feed();


    }

}
