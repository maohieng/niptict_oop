package decision;

import java.util.Scanner;

/**
 * A leap year has 366 days. The February of a leap year has 29 days.
 * You can check whether a year is a leap year:
 * - A leap year is divisible by 4
 * - A leap year is divisible by 4 but not by 100
 * - A leap year is divisible by 4 but not by 100 or divisible by 400.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display a result
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
