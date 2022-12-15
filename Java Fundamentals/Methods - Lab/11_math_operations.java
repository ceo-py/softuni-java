import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOne = Double.parseDouble(scanner.nextLine());
        String operator = String.valueOf(scanner.nextLine().charAt(0));
        double numTwo = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(calcResult(numOne, operator, numTwo)));
    }

    public static double calcResult (double a, String operator, double b) {

        double result = 0;

        switch (operator) {
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
