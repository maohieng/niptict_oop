package looping;

import java.util.Scanner;

/**
 * Palindrome: is a word, number, phrase or other sequence of
 * characters which read the same backward as forward, such as madam, racecar.
 * <p>
 * Palindrome Number: 12345654321 or 65432123456
 * Palindrome Character: ABCDEFGFEDCBA
 */
public class PalindromeNumberASC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        final int number = scanner.nextInt();

        // 5
        // 1 2 3 4 5 4 3 2 1 => total = 9
        // 1 : 1
        // 2 : 2
        // 3 : 3
        // 4 : 4
        // 5 : 5
        // 6 : 4 = 9 - 5 = total - (i - 1)
        // 7 : 3 = 9 - 6
        // 8 : 2 = 9 - 7
        // 9 : 1 = 9 - 8

        int total = number * 2 - 1;

        for (int i = 1; i <= total; i++) {
            if (i <= number)
                System.out.print(i);
            else
                System.out.print(total - (i - 1));
        }
    }
}
