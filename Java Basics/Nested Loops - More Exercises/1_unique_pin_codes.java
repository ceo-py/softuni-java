import java.util.Scanner;

public class Unique_PIN_Codes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aUp = Integer.parseInt(scanner.nextLine());
        int bUp = Integer.parseInt(scanner.nextLine());
        int cUp = Integer.parseInt(scanner.nextLine());

        for (int a = 2; a <= aUp; a += 2) {
            for (int b = 2; b <= bUp; b++) {
                for (int c = 2; c <= cUp; c += 2) {
                    if (b == 2 || b == 3 || b == 5 || b == 7) {
                        System.out.printf("%d %d %d%n", a, b, c);
                    }
                }
            }
        }

    }
}