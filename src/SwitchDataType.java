import java.util.Scanner;

public class SwitchDataType {
    public static void main(String[] args) {
        // In Java, switch statement supports:
        // - integer
        // - String
        // - enum
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any day in lowercase (e.g. monday): ");
        String day = scanner.next();

        switch (day) {
            case "sunday":
                System.out.println("It's Sunday.");
                break;
            case "monday":
                System.out.println("Monday subjects: Entrepreneurship, Database Administration.");
                break;
            default:
                System.out.println("Not supported the given day.");
        }
    }
}
