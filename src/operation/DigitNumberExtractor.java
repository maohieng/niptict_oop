package operation;

import java.util.Scanner;

public class DigitNumberExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls input letter contains digit numbers: ");
        String input = scanner.next();

        String digits = "";
        String letters = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                digits += ch; // digits = digits + ch;
            } else {
                letters += ch;
            }
        }

        println("Digit numbers: " + digits);
        println("Letters: " + letters);
        println("Uppercase letters: " + letters.toUpperCase());
    }

    /**
     * Prints out the message to the console.
     * @param msg String to display in console.
     */
    public static void println(String msg) {
        System.out.println(msg);
    }
}
