package looping;

public class MultiplicationTableUsingWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j < 10) {
                System.out.printf("%10s", i+"*"+j+"="+(i*j));
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
