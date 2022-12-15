import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int numOne = Integer.parseInt(scanner.nextLine());
                int numTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numOne, numTwo));
                break;
            case "char":
                char charOne = scanner.nextLine().charAt(0);
                char charTwo = scanner.nextLine().charAt(0);
                System.out.println(getMax(charOne, charTwo));
                break;
            case "string":
                String textOne = scanner.nextLine();
                String textTwo = scanner.nextLine();
                System.out.println(getMax(textOne, textTwo));
                break;
        }
    }

    public static int getMax (int a, int b) {
        int maxInt;
        if (a > b) {
            maxInt = a;
        } else {
            maxInt = b;
        }
        return maxInt;
    }

    public static char getMax (char a, char b) {
        char maxChar;
        if (a > b) {
            maxChar = a;
        } else {
            maxChar = b;
        }
        return maxChar;
    }

    public static String getMax (String a, String b) {
        String maxString;
        if (a.compareTo(b) >= 0) {
            maxString = a;
        } else {
            maxString = b;
        }
        return maxString;
    }
}
