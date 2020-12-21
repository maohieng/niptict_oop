package method;

import java.util.Scanner;

public class SumDigitsInInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = sumDigits(number);
        System.out.println("Sum digits: " + sum);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        int extract = 0;
        do {
            extract = number % 10;
            number = number / 10;
            sum += extract;
        } while (extract != 0);

        return sum;
    }
}
