package lesson9;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        System.out.println(audi.getCountCars());
        Car bmw = new Car("BMW");
        System.out.println(bmw.getCountCars());

        Car.printModels();
        System.out.println(Car.BMW_INFO);

        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));


    }

}
