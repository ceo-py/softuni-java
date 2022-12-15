import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        topNumber(number);
    }

    public static void topNumber (int a) {

        for (int i = 1; i <= a; i++) {
            boolean isDivisibleBy8 = false;
            boolean isContainOddDigit = false;

            int currentNum = i;
            int sum = 0;

            while (currentNum > 0) {
                int lastDigit = currentNum % 10;
                sum += lastDigit;
                if (lastDigit % 2 != 0) {
                    isContainOddDigit = true;
                }
                currentNum /= 10;
            }

            if (sum % 8 == 0) {
                isDivisibleBy8 = true;
            }


            if (isContainOddDigit && isDivisibleBy8) {
                System.out.println(i);
            }
        }
    }
}
