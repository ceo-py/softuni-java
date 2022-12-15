import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", factorialFirst(first) / factorialSecond(second));
    }

    public static double factorialFirst (double a) {
        double result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public static double factorialSecond (double a) {
        double result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }
}
