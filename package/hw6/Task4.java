package hw6;

import java.util.Scanner;

public class Task4 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the length of side 1:");
            double side1 = scanner.nextDouble();

            System.out.println("Enter the length of side 2:");
            double side2 = scanner.nextDouble();

            System.out.println("Enter the length of side 3:");
            double side3 = scanner.nextDouble();

            if (isIsoscelesTriangle(side1, side2, side3)) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is not isosceles.");
            }
        }

        public static boolean isIsoscelesTriangle(double side1, double side2, double side3) {
            return (side1 == side2) || (side1 == side3) || (side2 == side3);
        }
    }


