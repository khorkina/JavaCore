package lesson9;

public class Car {
    private String brand;
    private static int countCars = 0;

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
