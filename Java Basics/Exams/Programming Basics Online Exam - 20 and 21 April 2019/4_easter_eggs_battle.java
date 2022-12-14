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
