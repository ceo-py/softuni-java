import java.util.Scanner;

public class Secret_Doors_Lock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int first = 1; first <= a; first++) {
            for (int second = 1; second <= b; second++) {
                for (int third = 1; third <= c; third++) {

                    int count = 0;
                    for (int i = 1; i <= second; i++) {
                        if (second % i == 0) {
                            count++;
                        }
                    }

                    if (first % 2 == 0 && third % 2 == 0 && count == 2) {
                        System.out.printf("%d %d %d%n", first, second, third);
                    }
                }
            }
        }

    }
}