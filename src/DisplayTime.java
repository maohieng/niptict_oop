import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls input seconds: ");
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;
        int remainSeconds = seconds % 60;

        System.out.println(minutes + " minutes " +
                " and " + remainSeconds + " seconds.");
    }
}
