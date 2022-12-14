import java.util.Scanner;

public class NumberPyramid01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;
        for (int rows = 1; rows <= number ; rows++) {
            for (int columns = 1; columns <= number ; columns++) {
                if (currentNumber > number) {
                    break;
                }
                System.out.println(currentNumber + " ");
                currentNumber++;
            }
            if (currentNumber > number) {
                break;
            }
            System.out.println();
        }
    }
}
