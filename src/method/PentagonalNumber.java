package method;

public class PentagonalNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int number) {
        return number * (3 * number -1 ) / 2;
    }
}
