package lesson4;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int sum = x + y;
        System.out.println(sum);

        int diff = x - y;
        System.out.println(diff);

        int multiply = x * y;
        System.out.println(multiply);

        //int divide = x / y;
        //System.out.println(divide);

        //y = 3;
        //double divide = (double) x / y;
        //System.out.println(divide);

        //x = x + 1;
        x += 10;
        System.out.println(x);

        x = x - 1;
        System.out.println(x);

        //int number = 4;
        //int module = 4 % 2;
        //System.out.println(module);

        int z = (2 + 2) * 2;
        System.out.println(z);

        //индекс массы тела:
        double height = 1.82;
        int weight = 57;
        double index = weight / (height * height);
        System.out.println(index);

    }

}
