import java.util.Scanner;

public class Prime_Pairs_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startFirst2 = Integer.parseInt(scanner.nextLine());
        int startSecond2 = Integer.parseInt(scanner.nextLine());
        int differenceFirst = Integer.parseInt(scanner.nextLine());
        int differenceSecond = Integer.parseInt(scanner.nextLine());

        int lastFirst2 = startFirst2 + differenceFirst;
        int lastSecond2 = startSecond2 + differenceSecond;
        int count = 0;
        int count1 = 0;

        for (int a = startFirst2; a <= lastFirst2; a++) {
            for (int b = startSecond2; b <= lastSecond2; b++) {
                count = 0;
                count1 = 0;

                for (int j = 1; j <= a; j++) {
                    if (a % j == 0) {
                        count1++;
                    }
                }
                for (int i = 1; i <= b; i++) {
                    if (b % i == 0) {
                        count++;
                    }
                }

                if (count == 2 && count1 == 2) {
                    System.out.printf("%d%d%n", a, b);
                }

            }
        }

    }
}