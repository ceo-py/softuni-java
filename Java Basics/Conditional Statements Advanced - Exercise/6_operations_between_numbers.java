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




// import java.util.Scanner;
//
// public class OperationsBetweenNumbers {
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         // 1. Input
//         int numOne = Integer.parseInt(scanner.nextLine());
//         int numTwo = Integer.parseInt(scanner.nextLine());
//         String operator = scanner.nextLine();
//
//         if (numTwo == 0 && (operator.equals("/") || operator.equals("%"))) {
//             System.out.printf("Cannot divide %d by zero", numOne);
//             return;
//         }
//
//         double result = 0.00;
//         String evenOrOdd = "";
//
//         if (operator.equals("+")) {
//             result = numOne + numTwo;
//             if (result % 2 == 0) {
//                 evenOrOdd = "even";
//             } else {
//                 evenOrOdd = "odd";
//             }
//         } else if (operator.equals("-")) {
//             result = numOne - numTwo;
//             if (result % 2 == 0) {
//                 evenOrOdd = "even";
//             } else {
//                 evenOrOdd = "odd";
//             }
//         } else if (operator.equals("*")) {
//             result = numOne * numTwo;
//             if (result % 2 == 0) {
//                 evenOrOdd = "even";
//             } else {
//                 evenOrOdd = "odd";
//             }
//         } else if (operator.equals("/")) {
//             result = numOne * 1.0 / numTwo;
//         } else if (operator.equals("%")) {
//             result = numOne % numTwo;
//         }
//
//         if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
//             System.out.printf("%d %s %d = %.0f – %s", numOne, operator, numTwo, result, evenOrOdd);
//         } else if (operator.equals("/")) {
//             System.out.printf("%d %s %d = %.2f", numOne, operator, numTwo, result);
//         } else if (operator.equals("%")) {
//             System.out.printf("%d %s %d = %.0f", numOne, operator, numTwo, result);
//         }
//
//     }
// }
