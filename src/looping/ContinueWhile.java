package looping;

public class ContinueWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i % 5 != 0) {
                i++;
                continue;
            }

            System.out.println("The following number is divisible by 5: " + i);
            i++;
        }
    }
}
