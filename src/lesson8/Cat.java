package lesson8;

public class Cat {
    String color;
    double weight;
    String ownerName;

    public Cat(String colorName, double weightCat, String owner) {
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Cat is on %s\n", sofaOwner);
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "Mouse";
        }
        return "Snake";

    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';

    }

}
