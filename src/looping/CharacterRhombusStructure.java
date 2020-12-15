package looping;

import java.util.Scanner;

class CharacterRhombusStructure {
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

        System.out.println();
        System.out.println();

        for (int i = 1; i < total; i++) {
            int subTotal = i * 2;
            c = 'A';

            for (int j = 1; j < subTotal; j++) {
                if (j < i) {
                    System.out.print(c++);
                } else {
                    System.out.print(c--);
                }
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < total; i++) {

            int subTotal = 0;
            int subVal = 0;
            char start = 'A';

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

            for (int j = 1; j < subTotal; j++) {
                if (j < subVal)
                    System.out.print(start++);
                else
                    System.out.print(start--);
            }
            System.out.println();
        }
    }
}