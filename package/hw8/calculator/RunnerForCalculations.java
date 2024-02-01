package hw8.calculator;


import java.util.Scanner;

public class RunnerForCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();

        double[] numbers = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter value № " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }


        char operator;
        System.out.println("Choose an operator: +, -, *, /");
        operator = scanner.next().charAt(0);

        switch (operator) {

            case '+':

                System.out.println("Result : " + Calculator.add(numbers));
                break;

            case '-':
                System.out.println("Result : " + Calculator.subtract(numbers));
                break;
            case '*':

                System.out.println("Result : " + Calculator.multiply(numbers));
                break;
            case '/':

                System.out.println("Result : " + Calculator.divide(numbers));
                break;

        }
    }
}