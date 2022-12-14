import java.util.Scanner;

public class Letters_Combinations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char fromSymbol = scanner.nextLine().charAt(0);
        char toSymbol = scanner.nextLine().charAt(0);
        char toIgnore = scanner.nextLine().charAt(0);
        int counter = 0;

        for (char i = fromSymbol; i <= toSymbol; i++) {
            for (char j = fromSymbol; j <= toSymbol; j++) {
                for (char k = fromSymbol; k <= toSymbol; k++) {
                    if (k != toIgnore && i != toIgnore && j != toIgnore) {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}