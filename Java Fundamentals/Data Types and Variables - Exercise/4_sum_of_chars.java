import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            String symbol = scanner.nextLine();
            char c = symbol.charAt(0);

            sum += c;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
