package lesson8;

public class Dog {
    String name;
    int weight;
    String owner;

    public Dog(String name, int weight, String owner) {
        if (weight < 1) {
            this.weight = 5;
        } else  {
            this.weight = weight;
        }
        this.name = name;
        this.weight = weight;
        this.owner = owner;
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
