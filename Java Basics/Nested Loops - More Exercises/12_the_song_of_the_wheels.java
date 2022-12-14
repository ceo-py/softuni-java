import java.util.Scanner;

public class The_Song_Of_The_Wheels_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean flag = false;
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        int d1 = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d && a * b + c * d == m) {
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                            counter++;

                            if (counter == 4) {
                                a1 = a;
                                b1 = b;
                                c1 = c;
                                d1 = d;
                            }
                        }
                    }
                }
            }
        }

        if (counter >= 4) {
            System.out.printf("%n");
            System.out.printf("Password: %d%d%d%d", a1, b1, c1, d1);
        } else {
            System.out.printf("%n");
            System.out.println("No!");
        }

    }
}