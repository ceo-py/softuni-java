import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotations ; rotation++) {
            String first = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = first;
        }
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
