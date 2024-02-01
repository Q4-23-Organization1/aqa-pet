package hw4;

import java.util.Scanner;

public class HW4_2 {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Celsius : ");
            double c = scanner.nextDouble();
            double f = c * 9/5 + 32;
            double k = c + 273.15;

            System.out.println("Celsius: " + c);
            System.out.println("Fahrenheit: " + f);
            System.out.println("Kelvin: " + k);




        }
}

