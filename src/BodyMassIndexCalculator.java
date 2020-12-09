import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in metre: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) { // [0, 18.5[
            System.out.println("Underweight.");
        } else if (bmi < 25) { // [18.5, 25[
            System.out.println("Normal");
        } else if (bmi < 30) { // [25, 30[
            System.out.println("Overweight.");
        } else { // [30, ...]
            System.out.println("Obese");
        }
    }
}
