import java.util.Scanner;

public class Balls04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherColours = 0;

        for (int i = 1; i <= n ; i++) {
            String colour = scanner.nextLine();

            switch (colour) {
                case "red":
                    redBalls++;
                    points += 5;
                    break;
                case "orange":
                    orangeBalls++;
                    points += 10;
                    break;
                case "yellow":
                    yellowBalls++;
                    points += 15;
                    break;
                case "white":
                    whiteBalls++;
                    points += 20;
                    break;
                case "black":
                    blackBalls++;
                    points = Math.floor(points / 2);
                    break;
                default:
                    otherColours++;
                    break;
            }
        }
        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherColours);
        System.out.printf("Divides from black balls: %d", blackBalls);

    }
}




// import java.util.Scanner;
//
// public class Balls {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int n = Integer.parseInt(scanner.nextLine());
//
//         int redBallsCount = 0;
//         int orangeBallsCount = 0;
//         int yellowBallsCount = 0;
//         int whiteBallsCount = 0;
//         int blackBallsCount = 0;
//         int otherBallsCount = 0;
//         int points = 0;
//
//         for (int i = 1; i <= n; i++) {
//
//             String ballColor = scanner.nextLine();
//
//             switch (ballColor) {
//                 case "red":
//                     redBallsCount++;
//                     points += 5;
//                     break;
//                 case "orange":
//                     orangeBallsCount++;
//                     points += 10;
//                     break;
//                 case "yellow":
//                     yellowBallsCount++;
//                     points += 15;
//                     break;
//                 case "white":
//                     whiteBallsCount++;
//                     points += 20;
//                     break;
//                 case "black":
//                     blackBallsCount++;
//                     points /= 2;
//                     break;
//                 default:
//                     otherBallsCount++;
//                     break;
//             }
//         }
//
//         System.out.printf("Total points: %d\n", points);
//         System.out.printf("Red balls: %d\n", redBallsCount);
//         System.out.printf("Orange balls: %d\n", orangeBallsCount);
//         System.out.printf("Yellow balls: %d\n", yellowBallsCount);
//         System.out.printf("White balls: %d\n", whiteBallsCount);
//         System.out.printf("Other colors picked: %d\n", otherBallsCount);
//         System.out.printf("Divides from black balls: %d", blackBallsCount);
//     }
// }