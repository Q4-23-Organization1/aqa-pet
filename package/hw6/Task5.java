package hw6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value :");
        String input = scanner.nextLine();


        if (input.length() % 2 == 0) {
            int calculation = input.length() / 2;

            char mid2 = input.charAt(calculation);
            char mid1 = input.charAt(calculation - 1);

            System.out.print("The middle letters are : ");
            System.out.print(mid1);
            System.out.print(mid2);
        } else {
            int calculation = input.length() / 2;

            char mid1 = input.charAt(calculation);

            System.out.print("The middle letter is : ");
            System.out.print(mid1);
        }


    }

}








