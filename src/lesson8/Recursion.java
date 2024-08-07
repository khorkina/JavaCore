package lesson8;

public class Recursion {
    public int sum(int number) {
        if (number < 1) {
            return 0;
        }
        int result = number + sum(number - 1);
        return result;
    }

    //number = 10 -> result = 10 + sum(10 - 1)
    //number = 9 -> result = 9 + sum(9 - 1)
    //...
    //result = 2 -> result = 2 + 1
    //number = 1 -> result = 1
    //number = 0 -> return 0
}
