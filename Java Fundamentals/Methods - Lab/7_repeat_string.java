import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(input, repetitions));
    }

    public static String repeatString (String text, int repetitions) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= repetitions; i++) {
            result.append(text);
        }
        return result.toString();
    }
}
