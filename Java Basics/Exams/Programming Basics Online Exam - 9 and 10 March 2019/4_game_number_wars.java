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




// import java.util.Scanner;
//
// public class GameNumberWars {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         String firstPlayerName = scanner.nextLine();
//         String secondPlayerName = scanner.nextLine();
//
//         int firstPlayerPoints = 0;
//         int secondPlayerPoints = 0;
//
//         String input = scanner.nextLine();
//         while (!input.equals("End of game")) {
//
//             int firstPlayerCard = Integer.parseInt(input);
//             int secondPlayerCard = Integer.parseInt(scanner.nextLine());
//
//             if (firstPlayerCard > secondPlayerCard) {
//                 firstPlayerPoints += firstPlayerCard - secondPlayerCard;
//             } else if (secondPlayerCard > firstPlayerCard) {
//                 secondPlayerPoints += secondPlayerCard - firstPlayerCard;
//             } else {
//                 System.out.println("Number wars!");
//                 int firstNumberWarCard = Integer.parseInt(scanner.nextLine());
//                 int secondNumberWarCard = Integer.parseInt(scanner.nextLine());
//
//                 if (firstNumberWarCard > secondNumberWarCard) {
//                     System.out.printf("%s is winner with %d points", firstPlayerName, firstPlayerPoints);
//                 } else {
//                     System.out.printf("%s is winner with %d points", secondPlayerName, secondPlayerPoints);
//                 }
//                 return;
//             }
//
//             input = scanner.nextLine();
//         }
//
//         System.out.printf("%s has %d points\n", firstPlayerName, firstPlayerPoints);
//         System.out.printf("%s has %d points\n", secondPlayerName, secondPlayerPoints);
//     }
// }