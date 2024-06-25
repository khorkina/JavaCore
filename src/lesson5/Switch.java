package lesson5;

public class Switch {
    public static void main(String[] args) {
        int numberDay = 8;
        switch (numberDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Thusday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Nothing");

        }

    }

}
