import java.util.Scanner;

public class TennisRanklist05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int totalPoints = Integer.parseInt(scanner.nextLine());

        int pointsGained = 0;
        double averagePointsGained = 0;
        double winCount = 0;

        for (int i = 1; i <= tournaments ; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    pointsGained += 2000;
                    winCount++;
                    break;
                case "F":
                    pointsGained += 1200;
                    break;
                case "SF":
                    pointsGained += 720;
                    break;
            }
            totalPoints += pointsGained;
            averagePointsGained += pointsGained;
            pointsGained = 0;
        }
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePointsGained / tournaments));
        System.out.printf("%.2f%%", winCount / tournaments * 100.0);
    }
}
