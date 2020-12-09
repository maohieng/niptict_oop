import java.util.Scanner;

public class CharChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls input a character: ");
        String input = scanner.next();

        char ch = input.charAt(0);
        if (ch > 'a' && ch < 'z') {
            System.out.println(ch + " is a lowercase letter.");
            System.out.println("=> to uppercase letter: " + Character.toUpperCase(ch));
        } else if (ch > 'A' && ch < 'Z') {
            System.out.println(ch + " is a uppercase letter.");
            System.out.println("=> to lowercase letter: " + Character.toLowerCase(ch));
        } else if (ch > '0' && ch < '9') {
            System.out.println(ch + " is a digit number.");
        }
    }

}
