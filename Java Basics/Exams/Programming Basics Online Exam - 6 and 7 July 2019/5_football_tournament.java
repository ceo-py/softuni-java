import java.util.Scanner;

public class FootballTournament05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballTeam = scanner.nextLine();
        int numberGames = Integer.parseInt(scanner.nextLine());

        if (numberGames < 1) {
            System.out.printf("%s hasn't played any games during this season.", footballTeam);
        }
        int win = 0;
        int draw = 0;
        int loss = 0;
        int points = 0;

        for (int i = 1; i <= numberGames ; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    win++;
                    points += 3;
                    break;
                case "D":
                    draw++;
                    points += 1;
                    break;
                case "L":
                    loss++;
                    break;
            }
        }
        if (numberGames >= 1) {
            System.out.printf("%s has won %d points during this season.%n", footballTeam, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", win);
            System.out.printf("## D: %d%n", draw);
            System.out.printf("## L: %d%n", loss);
            System.out.printf("Win rate: %.2f%%", win * 1.0 / numberGames * 100);
        }
    }
}
