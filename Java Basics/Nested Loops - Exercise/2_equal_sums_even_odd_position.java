import java.util.Scanner;

public class EqualSumsEvenOddPosition02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            String number = String.valueOf(i);
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < 6; j++) {
                int currentPosition = Integer.parseInt("" + number.charAt(j));

                if (j % 2 == 0) {
                    evenSum += currentPosition;
                } else {
                    oddSum += currentPosition;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
    }
}
