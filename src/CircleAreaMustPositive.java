import java.util.Scanner;

public class CircleAreaMustPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a radius value: ");
        double radius = scanner.nextDouble();

        // if-then-else
        if (radius >= 0) {
            double area = Math.PI * radius * radius;
            System.out.println("Circle area of radius " + radius + " is " + area);
        } else {
            System.out.println("Negative input.");
        }
    }
}
