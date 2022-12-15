import java.util.Scanner;

public class CharactersInRange03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        System.out.println(printCharsInRange(start, end));
    }

    public static String printCharsInRange (char a, char b) {
        String output = "";
        StringBuilder builder = new StringBuilder();

        if (a < b) {
            for (char i = (char) (a + 1); i < b; i++) {
                builder.append(i);
                builder.append(" ");
            }
        } else {
            for (char i = (char) (b + 1); i < a; i++) {
                builder.append(i);
                builder.append(" ");
            }
        }
        output = String.valueOf(builder);
        return output;
    }
}
