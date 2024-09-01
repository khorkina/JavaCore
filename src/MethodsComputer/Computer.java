package MethodsComputer;

/**
 * class Calculator{
 * int a;
 * public int add(int n1, int n2)
 * {
 * int r=n1+n2;
 * return r;
 * }
 * }
 * <p>
 * public class Demo {
 * <p>
 * public static void main(String[] args) {
 * int num1=4;
 * int num2=5;
 * Calculator calc= new Calculator();
 * int result = calc.add(num1,num2);
 * System.out.println(result);
 * }
 * }
 **/

class Computer {
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}
