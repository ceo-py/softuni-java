import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (palindromeOfInteger(input)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            input = scanner.nextLine();
        }
    }

    public static boolean palindromeOfInteger (String a) {
        boolean isPalindrome = true;
        StringBuilder sb = new StringBuilder(a);

        String invertedText = String.valueOf(sb.reverse());
        if (!a.equals(invertedText)) {
            return false;
        }
        return isPalindrome;
    }
}
