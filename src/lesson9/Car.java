package lesson9;

public class Car {
    private String brand;
    private static int countCars = 0;
    public final static String BMW_INFO = "BMW is a german company. It was created in 1928 year.";


    public Car(String brand) {
        this.brand = brand;
        countCars++;

    }

    public int getCountCars() {
        return countCars;

    }

    public static void printModels() {
        System.out.println("Available models of cars: bmw, audi, kia");
    }

}
