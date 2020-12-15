package looping;

public class BreakFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == 20)
                break;
        }

        System.out.println("Outside the for loop.");
    }
}
