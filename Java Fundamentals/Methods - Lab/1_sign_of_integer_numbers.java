import java.util.Scanner;

public class SignOfIntegerNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printInteger(number);
    }

    public static void printInteger(int a) {
        if (a > 0) {
            System.out.printf("The number %d is positive.", a);
        } else if (a < 0) {
            System.out.printf("The number %d is negative.", a);
        } else {
            System.out.printf("The number %d is zero.", a);
        }
    }

}
