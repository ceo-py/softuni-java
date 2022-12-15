import java.util.Scanner;

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(calcMultiple(number));
    }

    public static int calcMultiple (int n) {
        int sumEven = 0;
        int sumOdd = 0;

        while (Math.abs(n) > 0) {

            int current = n % 10;
            if (current % 2 == 0) {
                sumEven += current;
            } else {
                sumOdd += current;
            }

            n /= 10;
        }
        int totalSum = sumEven * sumOdd;
        return totalSum;
    }
}
