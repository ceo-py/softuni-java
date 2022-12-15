import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            int[] current = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 != 0) {
                int temp = current[0];
                current[0] = current[1];
                current[1] = temp;
            }
            firstArr[i] = current[0];
            secondArr[i] = current[1];
        }
        for (int item :firstArr) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item :secondArr) {
            System.out.print(item + " ");
        }

    }
}
