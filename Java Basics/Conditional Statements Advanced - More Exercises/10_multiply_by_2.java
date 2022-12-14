import java.util.Scanner;

public class MultiplyBy210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double result = number * 2;

        while (number >= 0) {
            number = Double.parseDouble(scanner.nextLine());
            System.out.printf("Result: %.2f%n", result);

            }
//        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
//            double number = Double.parseDouble(scanner.nextLine());
//            if (number >= 0) {
//                System.out.printf("Result: %.2f%n", number * 2);
//            } else {
//                System.out.println("Negative number!");
//            }
//        }
    }
}
