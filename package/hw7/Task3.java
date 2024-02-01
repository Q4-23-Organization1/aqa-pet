package hw7;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        fillOutArray(numbers);
        System.out.println( "The original array is : " + Arrays.toString(numbers));

        modifyArray(numbers);
        System.out.println("The modified array is : " + Arrays.toString(numbers));

    }

    private static void fillOutArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

    }


    private static void modifyArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
        }

    }
}




