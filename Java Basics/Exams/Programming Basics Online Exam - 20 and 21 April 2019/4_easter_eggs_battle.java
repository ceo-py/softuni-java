import java.util.Scanner;

public class EasterEggsBattle04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsPlayerOne = Integer.parseInt(scanner.nextLine());
        int eggsPlayerTwo = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();


        while (!winner.equals("End")) {

            if (winner.equals("one")) {
                eggsPlayerTwo--;
            } else if (winner.equals("two")) {
                eggsPlayerOne--;
            }

            if (eggsPlayerOne <= 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", eggsPlayerTwo);
                break;
            }
            if (eggsPlayerTwo <= 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsPlayerOne);
                break;
            }
            winner = scanner.nextLine();
        }
        if (winner.equals("End")) {
            System.out.printf("Player one has %d eggs left.%n", eggsPlayerOne);
            System.out.printf("Player two has %d eggs left.", eggsPlayerTwo);
        }
    }
}




// import java.util.Scanner;
//
// public class EasterEggsBattle_04 {
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int playerOneEggs = Integer.parseInt(scanner.nextLine());
//         int playerTwoEggs = Integer.parseInt(scanner.nextLine());
//         String winner = scanner.nextLine();
//
//         while (!winner.equals("End")) {
//
//             if (winner.equals("one")) {
//                 playerTwoEggs -= 1;
//                 if (playerTwoEggs == 0) {
//                     System.out.printf("Player two is out of eggs. Player one has %d eggs left.", playerOneEggs);
//                     return; // прекратява изпълнението на метода/програмата.
//                 }
//             } else if (winner.equals("two")) {
//                 playerOneEggs--; //post-fix decrementation, идентично с playerOneEggs -= 1;
//                 if (playerOneEggs == 0) {
//                     System.out.printf("Player one is out of eggs. Player two has %d eggs left.", playerTwoEggs);
//                     return; // прекратява изпълнението на метода/програмата.
//                 }
//             }
//
//             winner = scanner.nextLine();
//         }
//             // Принтираме, само и единствено ако няма победител.
//             System.out.printf("Player one has %d eggs left.%n", playerOneEggs);
//             System.out.printf("Player two has %d eggs left.%n", playerTwoEggs);
//
//     }
// }