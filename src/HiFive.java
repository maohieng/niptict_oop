import java.util.Scanner;

public class HiFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // if-then
        if (number % 5 == 0)
            System.out.println("HiFive.");

        if (number % 2 == 0)
            System.out.println("HiEven.");

        if (number % 2 == 1)
            System.out.println("HiOdd.");
    }
}
