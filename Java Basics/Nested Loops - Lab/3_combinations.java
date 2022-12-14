import java.util.Scanner;

public class Combinations03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int combinations = 0;

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                for (int k = 0; k <= number; k++) {
                    if (i + j + k == number) {
                        combinations++;
                    }
                }
            }
        }
        System.out.println(combinations);
    }
}
