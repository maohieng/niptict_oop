package method;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ans;
        do {
            System.out.print("Enter value 1: ");
            double val1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            String opt = scanner.next();

            System.out.print("Enter value 2: ");
            double val2 = scanner.nextDouble();

            calculateAndPrintResult(val1, opt, val2);

            System.out.print("Do you want to continue (y/n): ");
            ans = scanner.next();
        } while (ans.equalsIgnoreCase("y"));
    }

    public static void calculateAndPrintResult(double val1, String opt, double val2) {
        double result;
        switch (opt) {
            case "+":
                result = plus(val1, val2);
                break;
            case "-":
                result = minus(val1, val2);
                break;
            case "*":
                result = multiple(val1, val2);
                break;
            case "/":
                result = divide(val1, val2);
                break;
            default:
                System.out.println("Operator not supported.");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double plus(double val1, double val2) {
        return val1 + val2;
    }

    public static double minus(double val1, double val2) {
        return val1 - val2;
    }

    public static double multiple(double val1, double val2) {
        return val1 * val2;
    }

    public static double divide(double val1, double val2) {
        return val1 / val2;
    }
}
