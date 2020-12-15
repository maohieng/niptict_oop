package looping;

import java.util.Scanner;

class PalindromeAndRhombusStructure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (>=0 && <=9): ");

        int val = input.nextInt();
        final int total = val * 2;

        System.out.println("Palindrome Number - Horizontal");

        int start = val;

        for (int i = 1; i < total; i++) {
            if (i < val)
                System.out.print(start--);
            else
                System.out.print(start++);
        }

        System.out.println();
        System.out.println();

        System.out.println("Palindrome Number - Vertical");

        for (int i = 1; i < total; i++) {
            if (i < val)
                System.out.println(i);
            else
                System.out.println(2 * val - i);
        }
        System.out.println();

        System.out.println("Combine Vertical - Horizontal");
        for (int i = 1; i < total; i++) {
            int subTotal = 0;
            int subVal = 0;
            int s = 0;

            if (i < val) {
                subVal = i;
            } else {
                subVal = 2 * val - i;
            }

            subTotal = subVal * 2;
            s = subVal;
            for (int j = 1; j < subTotal; j++) {
                if (j < subVal)
                    System.out.print(s--);
                else
                    System.out.print(s++);
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("Combine Vertical - Horizontal - Spaces");
        for (int i = 1; i < total; i++) {
            int subTotal = 0;
            int subVal = 0;
            int s = 0;

            if (i < val) {
                subVal = i;
            } else {
                subVal = 2 * val - i;
            }

            int totalSpace = val - subVal;
            for (int j = 0; j < totalSpace; j++) {
                System.out.print(" ");
            }

            subTotal = subVal * 2;
            s = subVal;
            for (int j = 1; j < subTotal; j++) {
                if (j < subVal)
                    System.out.print(s--);
                else
                    System.out.print(s++);
            }

            System.out.println();
        }
    }
}