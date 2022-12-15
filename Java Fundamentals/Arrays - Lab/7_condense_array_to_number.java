import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length - 1; i++) {
            int[] condensed = new int[arr.length - 1];

            for (int j = 0; j < arr.length - 1; j++) {
                condensed[j] = arr[j] + arr[j + 1];
            }
            arr = condensed;
        }
        System.out.println(arr[0]);
    }
}
