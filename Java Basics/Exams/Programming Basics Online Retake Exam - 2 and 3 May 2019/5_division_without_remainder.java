import java.util.Scanner;

public class DivisionWithoutRemainder05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= number ; i++) {
            int n = Integer.parseInt(scanner.nextLine());

            if (n % 2 ==0) {
                p1++;
            }
            if (n % 3 == 0) {
                p2++;
            }
            if (n % 4 ==0) {
                p3++;
            }
        }
        System.out.printf("%.2f%%%n", p1 / number * 100);
        System.out.printf("%.2f%%%n", p2 / number * 100);
        System.out.printf("%.2f%%%n", p3 / number * 100);
    }
}
