import java.util.Scanner;

public class Challenge_The_Wedding_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());
        int takenTables = 0;
        boolean flag = false;

        for (int a = 1; a <= men; a++) {
            for (int b = 1; b <= women; b++) {
                takenTables++;
                System.out.printf("(%d <-> %d) ", a, b);

                if (takenTables >= maxTables) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

    }
}