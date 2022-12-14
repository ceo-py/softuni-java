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
