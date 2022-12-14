import java.util.Scanner;

public class BasketballTournament06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournamentName = scanner.nextLine();

        int totalMatches = 0;
        double winCount = 0;

        while (!tournamentName.equals("End of tournaments")) {
            int numberMatches = Integer.parseInt(scanner.nextLine());
            totalMatches += numberMatches;

            for (int i = 1; i <= numberMatches ; i++) {
                int pointsDesi = Integer.parseInt(scanner.nextLine());
                int pointsFoe = Integer.parseInt(scanner.nextLine());


                if (pointsDesi > pointsFoe) {
                    winCount++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, pointsDesi - pointsFoe);
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, pointsFoe - pointsDesi);
                }
            }
            tournamentName = scanner.nextLine();
        }
        if (tournamentName.equals("End of tournaments")) {
            System.out.printf("%.2f%% matches win%n", winCount / totalMatches * 100.0);
            System.out.printf("%.2f%% matches lost", (totalMatches - winCount) / totalMatches * 100.0);

        }
    }
}
