import java.util.Scanner;

public class NameGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = 0;
        int maxPoints = Integer.MIN_VALUE;

        String winner = "";

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            for (int i = 0; i < input.length() ; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                char digit = input.charAt(i);

                if (digit == number) {
                    points += 10;
                } else {
                    points += 2;
                }
            }

            if (points >= maxPoints) {
                maxPoints = points;
                winner = input;
            }
            points = 0;
            input = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, maxPoints);
    }
}
