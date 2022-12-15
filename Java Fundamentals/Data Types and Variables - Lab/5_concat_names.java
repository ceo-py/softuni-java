import java.util.Scanner;

public class ConcatNames05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        System.out.printf("%s%s%s", first, third, second);
    }
}
