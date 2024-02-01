package hw6;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);

        if ( absNum1 > absNum2 ) {
            System.out.println( " The absolute value of " + num1 + " is greater than " + num2 );

        } else if (absNum2 > absNum1) {
            System.out.println( " The absolute value of " + num2 + " is greater than " + num1 );

        } else {
            System.out.println("The absolute value of " + num1 + " and " + num2  + "are equal");
        }


    }

}
