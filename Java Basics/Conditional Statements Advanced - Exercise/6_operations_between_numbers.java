import java.util.Scanner;

public class OperationsBetweenNumbers06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        char operators = scanner.nextLine().charAt(0);

        String operator = Character.toString(operators);
        double result = 0;


        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", numberOne, numberTwo, result);
                    ;
                } else {
                    System.out.printf("%d + %d = %.0f - odd", numberOne, numberTwo, result);
                }
                break;
            case "-":
                result = numberOne - numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", numberOne, numberTwo, result);
                    ;
                } else {
                    System.out.printf("%d - %d = %.0f - odd", numberOne, numberTwo, result);
                }
                break;
            case "*":
                result = numberOne * numberTwo;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", numberOne, numberTwo, result);
                    ;
                } else {
                    System.out.printf("%d * %d = %.0f - odd", numberOne, numberTwo, result);
                }
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", numberOne);
                } else {
                    result = numberOne * 1.0 / numberTwo;
                    System.out.printf("%d / %d = %.2f", numberOne, numberTwo, result);
                }
                break;
            case "%":
                if (numberTwo == 0) {
                    System.out.printf("Cannot divide %d by zero", numberOne);
                } else {
                    result = numberOne % numberTwo;
                    System.out.printf("%d %% %d = %.0f", numberOne, numberTwo, result);
                }
                break;
        }

    }
}

