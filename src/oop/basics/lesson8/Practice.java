package lesson8;

public class Practice {
    public static void main(String[] args) {
        Car marinaCar = new Car("MarinaCar", 400);
        marinaCar.investigateSpeed100();

        Garage garage = new Garage();
        garage.setCar1(marinaCar);
        garage.getInfoAboutCars();

    }

}
