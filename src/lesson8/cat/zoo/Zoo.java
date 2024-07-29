package lesson8.cat.zoo;

import lesson8.Dog;
import lesson8.cat.Cat;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public void feed() {
        cat.fead("Marina", "Fish");
        dog.fead("Marina", "Meat");
    }
}
