import java.util.Scanner;

public class LowerOrUpper08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.nextLine().charAt(0);

        if (c >= 65 && c <= 90) {
            System.out.println("upper-case");
        } else if (c >= 97 && c <= 122) {
            System.out.println("lower-case");
        }
    }
}
