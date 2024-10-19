package java.com.calculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.length() < 2) {
            if (numbers.isEmpty()) {
                return 0;
            } else {
                return conversiontoInt(numbers);
            }
        } else {
            String delimiter = ",";
            if (numbers.matches("//(.*)\n(.*)")) {
                delimiter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }

            String[] numList = numberSplit(numbers, delimiter + "|\n");
            return addition(numList);
        }
    }
}