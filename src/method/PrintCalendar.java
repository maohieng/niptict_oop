package method;

import java.util.Scanner;

/**
 *
 */
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a full year (e.g. 2016): ");
        int year = scanner.nextInt();

        System.out.print("Enter month as a number between 1 to 12: ");
        int month = scanner.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("        " + getMonthName(month) + " " + year);
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {
        getStartDay(year, month);
    }

    public static String getMonthName(int month) {
        // TODO: 12/17/20 return a month name for int month
        return "January";
    }

    public static int getStartDay(int year, int month) {
        return 1; // A dummy value
    }

    public static int getTotalNumberOfDay(int year, int month) {
        return 10000; // A dummy value
    }

    public static int getTotalNumberOfDaysInMonth(int year, int month) {
        return 31; // A dummy value
    }

    public static boolean isLeapYear(int year) {
        return true; // A dummy value
    }
}
