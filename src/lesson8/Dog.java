package lesson8;

public class Dog {
    private String name;
    private int weight;
    private String owner;

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
