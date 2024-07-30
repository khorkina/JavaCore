package lesson8;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Marina";

    {
        System.out.println("Dog is created");
    }

    public Dog() {

    }

    public void fead(String givver, String ...product) {
        System.out.printf("Person gives %s to dog, Dog eat %s\n", givver, Arrays.toString(product));
    }

    public Dog(String name, int weight, String owner) {
        if (weight < 1) {
            this.weight = 5;
        } else  {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public String getOwner() {
        return "Ms." + owner;
    }

    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else  {
            this.weight = newWeight;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';

    }

}
