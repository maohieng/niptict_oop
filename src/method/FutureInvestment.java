package method;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The amount invested: ");
        long amount = scanner.nextLong();

        System.out.print("Annual interest rate: ");
        float annualRate = scanner.nextFloat();
        float monthlyRate = (annualRate / 100) / 12;

        System.out.println("Years    Future Value");
        for (int i = 1; i <= 15; i++) {
            System.out.println(i+"        "+futureInvestmentValue(amount, monthlyRate, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, (numberOfYears * 12));
    }
}
