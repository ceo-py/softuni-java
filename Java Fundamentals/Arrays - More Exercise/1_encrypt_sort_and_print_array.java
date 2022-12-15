import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EncryptSortAndPrintArray01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStrings = Integer.parseInt(scanner.nextLine());
        int[] array = new int[numStrings];

        for (int i = 0; i < numStrings; i++) {
            String input = scanner.nextLine();
            int sumVowels = 0;
            int sumConsonants = 0;

            for (int j = 0; j <= input.length() - 1; j++) {
                switch (input.charAt(j)) {
                    case 'a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'I', 'U' -> sumVowels += (int) input.charAt(j) * input.length();
                    default -> sumConsonants += (int) input.charAt(j) / input.length();
                }
            }
            int totalSum = sumConsonants + sumVowels;
            array[i] = totalSum;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
//        Arrays.sort(array);
        for (int num : array) {
            System.out.println(num);
        }
    }
}
