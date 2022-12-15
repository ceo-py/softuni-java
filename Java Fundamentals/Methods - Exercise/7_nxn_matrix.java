import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(numberMatrix(number));

    }

    public static String numberMatrix (int a) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                sb.append(a + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
