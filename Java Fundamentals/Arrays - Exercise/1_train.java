import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int passengers = Integer.parseInt(scanner.nextLine());
            arr[i] = passengers;
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println(sum);
    }
}
