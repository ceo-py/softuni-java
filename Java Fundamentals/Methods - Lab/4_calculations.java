import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        switch (action) {
            case "add":
                calcAddition(numberOne, numberTwo);
                break;
            case "multiply":
                calcMultiplication(numberOne, numberTwo);
                break;
            case "subtract":
                calcSubtraction(numberOne, numberTwo);
                break;
            case "divide":
                calcDivision(numberOne, numberTwo);
                break;
        }
    }

    public static void calcMultiplication (int a, int b) {
        System.out.println(a * b);
    }

    public static void calcAddition (int a, int b) {
        System.out.println(a + b);
    }

    public static void calcDivision (int a, int b) {
        System.out.println(a / b);
    }

    public static void calcSubtraction (int a, int b) {
        System.out.println(a - b);
    }
}
