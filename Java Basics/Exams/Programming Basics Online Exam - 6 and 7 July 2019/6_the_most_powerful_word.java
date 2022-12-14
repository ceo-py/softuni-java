import java.util.Scanner;

public class TheMostPowerfulWord06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String winner = "";
        double points = 0;
        double maxPoints = Integer.MIN_VALUE;


        while (!input.equals("End of words")) {

            for (int i = 0; i < input.length() ; i++) {
                int digit = input.charAt(i);

                points += digit;
            }
            if (input.charAt(0) == 'a'
                    || input.charAt(0) == 'e'
                    || input.charAt(0) == 'y'
                    || input.charAt(0) == 'i'
                    || input.charAt(0) == 'o'
                    || input.charAt(0) == 'u'
                    || input.charAt(0) == 'A'
                    || input.charAt(0) == 'E'
                    || input.charAt(0) == 'I'
                    || input.charAt(0) == 'O'
                    || input.charAt(0) == 'U'
                    || input.charAt(0) == 'Y') {
                points *= input.length();
            } else {
                points = Math.floor(points / input.length());
            }
            if (points >= maxPoints) {
                maxPoints = points;
                winner = input;
            }
            points = 0;
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", winner, maxPoints);
    }
}
