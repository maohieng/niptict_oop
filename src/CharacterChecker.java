import java.util.Scanner;

public class CharacterChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls input a character: ");
        String input = scanner.next();

        char ch = input.charAt(0);
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
            System.out.println("=> to uppercase letter: " + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is a uppercase letter.");
            System.out.println("=> to lowercase letter: " + Character.toLowerCase(ch));
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit number.");
        }
    }
}
