package looping;

import java.util.Scanner;

/**
 * Palindrome: is a word, number, phrase or other sequence of
 * characters which read the same backward as forward, such as madam, racecar.
 *
 * Palindrome number: 12345654321 or 65432123456
 */
class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int val = input.nextInt();

        final int total = val * 2;

        String result = "";
        for (int i = 1; i < total; i++) {
            if (i < val) {
                result += (i);
            } else {
                result += (2 * val - i);
            }

        }

        // 1234321
        System.out.println(result);

        String result2 = "";

        for (int i = 0; i < total; i++) {
            if (i < val) {
                result2 += (val - i);
            } else {
                result2 += (i + 2 - val);
            }
        }

        // 4321234
        System.out.println(result2);
    }
}