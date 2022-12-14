import java.util.Scanner;

public class Wedding_Seats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rowsFirstSector = Integer.parseInt(scanner.nextLine());
        int seatsOddRow = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int factor = 0;

        for (char a = 'A'; a <= lastSector; a++, rowsFirstSector++) {
            for (int b = 1; b <= rowsFirstSector; b++) {
                if (b % 2 == 0) {
                    factor = 2;
                } else {
                    factor = 0;
                }

                for (char c = 'a'; c < 'a' + seatsOddRow + factor; c++) {
                    System.out.printf("%c%d%c%n", a, b, c);
                    counter++;
                }
            }
        }

        System.out.printf("%d", counter);
    }
}