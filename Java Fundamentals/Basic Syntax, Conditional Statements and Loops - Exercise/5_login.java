import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";

        for (int i = 0; i < username.length() ; i++) {
            char c = username.charAt(i);
            password = c + password;
        }

        int counter = 0;

        String action = scanner.nextLine();

        while (!action.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");

            action = scanner.nextLine();
        }

        if (action.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
