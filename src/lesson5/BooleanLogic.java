package lesson5;

public class BooleanLogic {
    public static void main(String[] args) {
        //Сынок купи хлеб
        boolean isboughtbread = true;
        //Сынок купил молоко
        boolean isboughtmilk = true;

        //and - logic и -> если два true -> иначе false
        boolean isboughtbreadadbmilk = isboughtbread && isboughtmilk;


        if (isboughtbread && isboughtmilk) {
            System.out.println("Молодец сынок, купил хлеб и молоко");
        } else if (isboughtmilk) {
            System.out.println("Молодец сынок, хотя бы купил молоко");
        } else if (isboughtbread) {
            System.out.println("Молодец сынок, хотя бы купил хлеб");
        }
        else {
            System.out.println("Сынок не молодец, хлеба нет и молока нет");

        }

        //or
        boolean isboughtmilkorbread = true || true;
        //boolean isboughtmilkorbread = false || true;

        //купио сладости или нет
        //not - !
        boolean isboughtcandy = false;

        if (!isboughtcandy) {
            System.out.println("Мама хвалит сына");

        }

    }

}
