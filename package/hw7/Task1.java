package hw7;

import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a value: ");
            String inputValue = scanner.nextLine();

            if (isPalindrome(inputValue)) {
                System.out.println("'" + inputValue + "' is a palindrome.");
            } else {
                System.out.println("'" + inputValue + "' is not a palindrome.");
            }
        }

        public static boolean isPalindrome(String inputValue) {

            char[] charArray = inputValue.toCharArray();

            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {
                if (charArray[left] != charArray[right]) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    }

