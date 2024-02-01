package hw6;

import java.util.Scanner;

public class Task1 {

        public static void main (String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("input number : ");
            int number = scanner.nextInt();


            System.out.println(number % 2 == 0 ? number + " - even number " : number + " - odd number ");


            System.out.println("Bye");

        }
    }


