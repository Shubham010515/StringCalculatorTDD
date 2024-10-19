package java.com.calculator;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.length() < 2) {
            if (numbers.isEmpty()) {
                return 0;
            } else {
                return conversionToInt(numbers);
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

    private int conversionToInt(String number) {
        return Integer.parseInt(number);
    }

    private String[] numberSplit(String numbers, String divider) {
        return numbers.split(divider);
    }
}