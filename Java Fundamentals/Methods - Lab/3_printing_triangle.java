import java.util.Scanner;

public class PrintTriangle03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printTriangleTop(input);
        printTriangleBottom(input);
    }

    public static void printTriangleTop(int number) {

        for (int i = 1; i <= number; i++) {
            System.out.print(1 + " ");
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printTriangleBottom (int number) {

        for (int i = 1; i < number; i++) {
            System.out.print(1 + " ");
            for (int j = 2; j <= number - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}
