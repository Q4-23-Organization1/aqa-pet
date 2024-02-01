package hw8.calculator;


public class Calculator {

    public static double add(double... numbers) {
        double result = 0;
        for (double num : numbers) {
            result += num;
        }
        return result;
    }

    public static double subtract(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public static double multiply(double... numbers) {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }


    public static double divide(double... numbers) {

        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                result /= numbers[i];
            } else {
                System.out.println("Cannot divide by zero.");
                return Double.NaN;
            }
        }
        return result;
    }
}

