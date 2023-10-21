import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        double totalPoints = startingPoints * 1.0;
        double totalWins = 0;

        for (int i = 1; i <= tournaments; i++) {
            String result = scanner.nextLine().toLowerCase();

            switch (result) {
                case "w":
                    totalPoints += 2000;
                    totalWins += 1;
                    break;
                case "f":
                    totalPoints += 1200;
                    break;
                case "sf":
                    totalPoints += 720;
                    break;
            }

        }
        System.out.printf("Final points: %.0f%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor((totalPoints - startingPoints) / tournaments));
        System.out.printf("%.2f%%", (totalWins / tournaments * 100));
    }
}



// import java.util.Scanner;
//
// public class TennisRanklist {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//
//         int tournaments = Integer.parseInt(scanner.nextLine());
//         int initialPoints = Integer.parseInt(scanner.nextLine());
//
//         int tournamentsPoints = 0;
//         int winCount = 0;
//
//         for (int i = 0; i < tournaments; i++) {
//
//             String placeInCurrentTournament = scanner.nextLine();
//
//             switch (placeInCurrentTournament) {
//                 case "W":
//                     tournamentsPoints += 2000;
//                     winCount++;
//                     break;
//                 case "F":
//                     tournamentsPoints += 1200;
//                     break;
//                 case "SF":
//                     tournamentsPoints += 720;
//                     break;
//             }
//         }
//
//         int totalPoints = initialPoints + tournamentsPoints;
//         double averagePoints = Math.floor(tournamentsPoints * 1.0 / tournaments);
//         double percentWinning = winCount * 1.0 / tournaments * 100;
//
//         System.out.printf("Final points: %d\n", totalPoints);
//         System.out.printf("Average points: %.0f\n", averagePoints);
//         System.out.printf("%.2f%%\n", percentWinning);
//
//     }
// }