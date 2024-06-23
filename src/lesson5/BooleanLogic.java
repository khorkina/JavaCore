package lesson5;

public class BooleanLogic {
    public static void main(String[] args) {

        boolean isBoughtBread = true;

        boolean isBoughtMilk = true;

        boolean isBoughtMilkAndBread = isBoughtBread && isBoughtMilk;;


        if (isBoughtBread) {
            System.out.println("Молодец сынок, купил хлеб и молоко");
        } else if (isBoughtMilk) {
            System.out.println("Молодец сынок, хотя бы купил молоко");
        } else if (isBoughtBread) {
            System.out.println("Молодец сынок, хотя бы купил хлеб");
        }
        else {
            System.out.println("Сынок не молодец, хлеба нет и молока нет");

        }


        boolean isBoughtMilkOrBread = true || true;
        //boolean isBoughtMilkOrBread = false || true;


        boolean isBoughtCandy = false;

        if (!isBoughtCandy) {
            System.out.println("Мама хвалит сына");

        }

    }

}
