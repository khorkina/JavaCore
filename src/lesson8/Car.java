package lesson8;

public class Car {
    private String brandName;
    private int maxSpeed = 220;

    public Car(String brand) {
        this.brandName = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.brandName = brand;
        this.maxSpeed = maxSpeed;
    }

    public void investigateSpeed100() {
        double speed = 110 / (this.maxSpeed / 20);
        System.out.printf("Speed on 110: %s\n", speed);
    }

    public String getBrandName() {
        return brandName;

    }

}
