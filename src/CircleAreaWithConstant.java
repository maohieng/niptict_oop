import java.util.Scanner;

public class CircleAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pls input a radius value: ");
        double radius = scanner.nextDouble();
        double area = PI * radius * radius;

        System.out.println("Circle area is " + area);
        System.out.printf("Circle area with limit decimal points: %.5f", area);
    }
}
