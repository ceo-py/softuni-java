
import java.util.Scanner;

public class ReverseAnArrayOfStrings04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length / 2; i++) {
            String element = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = element;

        }
        System.out.println(String.join(" ", arr));
    }
}
//        String[] reversedArr = new String[arr.length];

//        for (int i = 0; i < arr.length; i++) {
//            reversedArr[i] = arr[arr.length - 1 - i];
//        }
//        System.out.println(String.join(" ", reversedArr));