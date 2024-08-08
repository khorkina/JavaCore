package lesson9;

public class Car {
    private String brand;
    private static int countCars = 0;
    public final static String BMW_INFO = "BMW is a german company. It was created in 1928 year.";
    public final static String AUDI_INFO = "Audi is a german company. It was created in 1933 year.";
    public final static String KIA_INFO = "KIA is a korean company. It was created in 1945 year.";
    public final static String[] BRAND_DESCRIPTIONS = new String[3];

    static {
        BRAND_DESCRIPTIONS[0] = BMW_INFO;
        BRAND_DESCRIPTIONS[1] = AUDI_INFO;
        BRAND_DESCRIPTIONS[2] = KIA_INFO;
    }


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
