import java.util.Scanner;

public class FavoriteMovie06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String winner = "";
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int counter = 0;

        while (!name.equals("STOP")) {

            counter++;
            if (counter == 7) {
                System.out.println("The limit is reached.");
                break;
            }

            for (int i = 0; i < name.length(); i++) {

                char digit = name.charAt(i);

                if (digit >= 'A' && digit <= 'Z') {
                    sum += digit - name.length();
                } else if (digit >= 'a' && digit <= 'z') {
                    sum += digit - 2 * name.length();
                } else {
                    sum += digit;
                }

                if (sum >= maxSum) {
                    winner = name;
                    maxSum = sum;
                }
            }
            sum = 0;
            name = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", winner, maxSum);
    }
}

