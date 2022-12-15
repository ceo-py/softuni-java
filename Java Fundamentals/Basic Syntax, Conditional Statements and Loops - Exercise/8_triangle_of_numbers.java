import java.util.Scanner;

public class TriangleOfNumbers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            System.out.printf("%d ", i);
            for (int j = 1; j < i ; j++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }
}
