package looping;

public class MutiplicationTable2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%10s", i * j);
            }

            if (i == 5)
                return;

            System.out.println();
        }
    }
}
