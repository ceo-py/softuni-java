import java.util.Scanner;

public class Clock_Part_2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                for (int s = 0; s <= 59; s++) {
                    System.out.printf("%d : %d : %d%n", h, m, s);
                }
            }
        }
    }
}