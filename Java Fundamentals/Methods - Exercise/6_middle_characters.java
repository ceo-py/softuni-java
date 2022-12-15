import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(middleChar(text));
    }

    public static String middleChar (String input) {
        StringBuilder sb = new StringBuilder();

        if (input.length() % 2 == 0) {
            sb.append(input.charAt((input.length() - 1) / 2));
            sb.append(input.charAt((input.length() - 1) / 2 + 1));

        } else {
            sb.append(input.charAt((int) Math.ceil(((input.length() - 1) / 2.0))));
        }
        return sb.toString();
    }
}
