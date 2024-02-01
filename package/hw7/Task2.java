package hw7;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {


        int[] numbers = new int[10];
        fillOutArray(numbers);
        System.out.println(Arrays.toString(numbers));


        int minValue = findMinValue(numbers);
        System.out.println("The minimum value in array is : " + minValue);

        int maxValue = findMaxValue(numbers);
        System.out.println("The maximum value in array is : " + maxValue);

    }

    private static void fillOutArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

    }




    private static int findMinValue(int[] numbers) {
        int minValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }


    private static int findMaxValue(int[] numbers) {
        int maxValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        return maxValue;





        }
    }

