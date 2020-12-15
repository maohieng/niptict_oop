package looping;

public class ContinueFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 != 0)
                continue;
            System.out.println("The following number is divisible by 5: " + i);
        }
    }
}
