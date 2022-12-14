import java.util.Scanner;

public class EqualPairs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairs = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxDiff = 0;
        int sumNext = 0;
        int nextDiff = 0;

        for (int i = 1; i <= pairs; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            int nextNumber = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sumNext = number + nextNumber;

                if (sumNext != sum) {
                    nextDiff = Math.abs(sum - sumNext);
                    if (maxDiff < nextDiff) {
                        maxDiff = nextDiff;
                    }
                }
            } else {
                sum = number + nextNumber;
                maxDiff = sum;

            }

//            if (sum1 >= maxSum) {
//                maxSum = sum;
//            }
//            if (sum1 <= minSum) {
//                minSum = sum;
        }
        if (sum == sumNext) {
            System.out.printf("Yes, value=%d", maxDiff);
        } else {
            System.out.printf("No, maxdiff=%d", sum - sumNext);
        }
    }

}





