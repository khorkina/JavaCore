package lesson6;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100) {
            System.out.println(count);
            count ++;
        }
        System.out.println("While end");

        while (true) {
            count ++;
            System.out.println(count);
            if (count == 1000) {
                break;

            }

        }
        System.out.println("While end 2");


    }

}
