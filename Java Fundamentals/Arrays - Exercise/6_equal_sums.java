import java.util.Arrays;
import java.util.Scanner;

public class EqualSums06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isEqual = false;
        for (int index = 0; index <= array.length - 1 ; index++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int left = 0; left < index ; left++) {
                leftSum += array[left];
            }

            for (int right = index + 1; right <= array.length - 1; right++) {
                rightSum += array[right];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                System.out.println(index);
                break;
            }
        }
        if (!isEqual) {
            System.out.println("no");
        }
    }
}
