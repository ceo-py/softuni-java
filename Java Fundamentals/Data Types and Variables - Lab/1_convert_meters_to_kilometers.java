import java.util.Scanner;

public class ConvertMetersToKilometers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", m / 1000.0);
    }
}
