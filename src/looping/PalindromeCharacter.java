package looping;

import java.util.Scanner;

public class PalindromeCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int val = input.nextInt();

        final int total = val * 2;

        char c = 'A';

        for (int i = 1; i < total; i++) {
            if (i < val) {
                System.out.print(c++);
            } else {
                System.out.print(c--);
            }
        }
    }
}
