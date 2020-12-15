package looping;

public class BreakWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            if (i == 20)
                break;

            i++;
        }

        System.out.println("Outside the while loop.");
    }
}
