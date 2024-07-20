package lesson8;

import java.util.Arrays;

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

    public String hunt(boolean isDay, boolean success) {
        if (success){
            if (isDay) {
                return "Mouse";
            }
            return "Snake";
        }
        return "Nothing";
    }

    public void fead(String givver, String ...product) {
        System.out.printf("Person gives %s to cat, Cat eat %s", givver, Arrays.toString(product));
    }

    public void hunt(String timesOfDay) {
        if (timesOfDay.equals("Morning")) {
            System.out.println("Mouse");
        } else {
            System.out.println("Snake");
        }
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
