package lesson9;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        System.out.println(audi.getCountCars());
        Car bmw = new Car("BMW");
        System.out.println(bmw.getCountCars());

        Car.printModels();

    }

}
