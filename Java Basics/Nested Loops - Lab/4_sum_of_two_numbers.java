import java.util.Scanner;

public class SumOfTwoNumbers04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinations = 0;

        boolean isFound = false;
        for (int i = startInterval; i <= endInterval; i++) {
            for (int j = startInterval; j <= endInterval; j++) {
                combinations++;
                if (i + j == magicNumber) {
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, i + j);
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d%n", combinations, magicNumber);

        }
    }
}