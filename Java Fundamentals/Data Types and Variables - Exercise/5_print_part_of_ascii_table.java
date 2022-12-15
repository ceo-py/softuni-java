import java.util.Scanner;

public class PrintPartOfTheASCIITable05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boundaryOne = Integer.parseInt(scanner.nextLine());
        int boundaryTwo = Integer.parseInt(scanner.nextLine());

        char start = (char) boundaryOne;
        char end = (char) boundaryTwo;

        for (int i = start; i <= end; i++) {
            System.out.printf("%c ", i);
        }
    }
}
