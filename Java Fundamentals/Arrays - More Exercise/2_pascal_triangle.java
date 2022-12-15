import java.util.Scanner;

public class PascalTriangle02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rows ; i++) {
            System.out.print(1);
            for (int j = 1; j < i; j++) {
                System.out.print(i - j);
            }
            System.out.println();

        }
    }
}
