import java.util.Scanner;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        String longest = "";

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i].equals(array[j])) {
                    longest += array[j];
                }
            }
        }
    }
}


