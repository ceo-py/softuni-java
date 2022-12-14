import java.util.Scanner;

public class GameNumberWars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();

        String input = scanner.nextLine();

        int pointsPlayerOne = 0;
        int pointsPlayerTwo = 0;
        String winner;

        while (!input.equals("End of game")) {
            int cardOne = Integer.parseInt(input);
            int cardTwo = Integer.parseInt(scanner.nextLine());

            if (cardOne > cardTwo) {
                pointsPlayerOne += (cardOne - cardTwo);
            } else if (cardOne < cardTwo) {
                pointsPlayerTwo += (cardTwo - cardOne);
            } else {
                System.out.println("Number wars!");
                cardOne = Integer.parseInt(scanner.nextLine());
                cardTwo = Integer.parseInt(scanner.nextLine());

                if (cardOne > cardTwo) {
                    winner = playerOne;
                    System.out.printf("%s is winner with %d points", winner, pointsPlayerOne);
                    break;
                } else if (cardOne < cardTwo) {
                    winner = playerTwo;
                    System.out.printf("%s is winner with %d points", winner, pointsPlayerTwo);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        if (input.equals("End of game")) {
            System.out.printf("%s has %d points%n", playerOne, pointsPlayerOne);
            System.out.printf("%s has %d points", playerTwo, pointsPlayerTwo);
        }
    }
}
