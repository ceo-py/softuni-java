import java.util.Scanner;

public class HappyCat_Parking_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sum1 = 0;
        double sum2 = 0;
        int a;

        for (a = 1; a <= days; a++) {
            double sumD1 = 0;
            double sumD2 = 0;
            for (int b = 1; b <= hours; b++) {
                if (a % 2 == 0) {
                    if (b % 2 != 0) {
                        sumD1 += 2.5;
                        sum1 += 2.5;
                    } else {
                        sumD1 += 1;
                        sum1 += 1;
                    }
                }
                if (a % 2 != 0) {
                    if (b % 2 == 0) {
                        sumD2 += 1.25;
                        sum2 += 1.25;
                    } else {
                        sumD2 += 1;
                        sum2 += 1;
                    }
                }
            }

            if (a % 2 != 0) {
                System.out.printf("Day: %d - %.2f leva%n", a, sumD2);
            } else {
                System.out.printf("Day: %d - %.2f leva%n", a, sumD1);
            }
        }

        System.out.printf("Total: %.2f leva", sum1 + sum2);
    }
}