import java.util.Scanner;

public class RageExpenses11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0;
        int keyboardBrokenCount = 0;

        if (lostGames / 2 != 0) {
            expenses += (lostGames / 2) * headsetPrice;
        }
        if (lostGames / 3 != 0) {
            expenses += (lostGames / 3) * mousePrice;
        }
        if (lostGames / 6 != 0) {
            expenses += (lostGames / 6) * keyboardPrice;
            keyboardBrokenCount += (lostGames / 6);
        }
        if (keyboardBrokenCount / 2 != 0) {
            expenses += (keyboardBrokenCount / 2) * displayPrice;
        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
