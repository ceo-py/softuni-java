import java.util.Scanner;

public class FootballResults02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int winCount = 0;
        int drawCount = 0;
        int lossCount = 0;

        for (int i = 1; i <= 3 ; i++) {
            String result = scanner.nextLine();

            if (result.charAt(0) > result.charAt(2)) {
                winCount++;
            } else if (result.charAt(0) == result.charAt(2)) {
                drawCount++;
            } else {
                lossCount++;
            }
        }
        System.out.printf("Team won %d games.%n", winCount);
        System.out.printf("Team lost %d games.%n", lossCount);
        System.out.printf("Drawn games: %d", drawCount);
    }
}
