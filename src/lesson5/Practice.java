package lesson5;

public class Practice {
    public static void main(String[] args) {
        boolean isWorkEngine = true;
        boolean isWorkTransmission = false;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;
        int countFineWheels = 0;
        countFineWheels += isFineWheel1 ? 1 : 0;
        countFineWheels += isFineWheel2 ? 1 : 0;
        countFineWheels += isFineWheel3 ? 1 : 0;
        countFineWheels += isFineWheel4 ? 1 : 0;

        if (isWorkEngine && isWorkTransmission && (countFineWheels >= 3)){
            System.out.println("Ready");
        } else
            System.out.println("Broken");

    }
}
