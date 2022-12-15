import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isCorrect = isMoreThan2Digits(password) && isBetween6And10Chars(password) && isOnlyLetterAndDigits(password);

        if (isCorrect) {
            System.out.println("Password is valid");
        } else {
            if (!isBetween6And10Chars(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!isOnlyLetterAndDigits(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!isMoreThan2Digits(password)) {
                System.out.println("Password must have at least 2 digits");
            }
        }
    }



    public static boolean isBetween6And10Chars(String input) {
        boolean isTrue = true;
        if (input.length() > 10 || input.length() < 6) {
            isTrue = false;
        }
        return isTrue;
    }

    public static boolean isOnlyLetterAndDigits(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
        }


    public static boolean isMoreThan2Digits(String input) {
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            if ((48 <= input.charAt(i) && input.charAt(i) <= 57)) {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        }
        return false;

    }
}
