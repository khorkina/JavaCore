package lesson7;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000_000;
        boolean hasAutomaticTransmission = true;
        String result = """
                Hi, I am a manager of %s
                We have a model %s %s dollars
                Has it Automatic Transmission?
                %s
                """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Yes" : "No");
        System.out.println(result);

    }

}
