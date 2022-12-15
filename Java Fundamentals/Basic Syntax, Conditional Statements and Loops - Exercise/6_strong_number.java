import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String n = Integer.toString(number);

        int sum = 1;
        int finalsum = 0;

        for (int i = 0; i < n.length(); i++) {
            int current = Integer.parseInt(String.valueOf(n.charAt(i)));
            for (int j = 1; j <= current; j++) {
                sum = sum * j;
            }
            finalsum += sum;
            sum = 1;
        }

        if (finalsum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
