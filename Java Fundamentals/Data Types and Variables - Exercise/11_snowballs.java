
import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballCount = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        String winner = "";

        for (int i = 1; i <= snowballCount; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow((double) snow / time, quality);

            if (value >= maxValue) {
                maxValue = value;
                winner = String.format("%d : %d = %.0f (%d)", snow, time, maxValue, quality);
            }
        }
        System.out.println(winner);
    }
}
