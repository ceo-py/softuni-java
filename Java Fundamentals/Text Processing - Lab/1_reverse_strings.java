import java.util.Scanner;

public class ReverseStrings01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            StringBuilder sb = new StringBuilder();

            for (int i = input.length() - 1; i >= 0; i--) {
                sb.append(input.charAt(i));
            }
            System.out.printf("%s = %s%n", input, sb);
            input = scanner.nextLine();
        }
    }
}
