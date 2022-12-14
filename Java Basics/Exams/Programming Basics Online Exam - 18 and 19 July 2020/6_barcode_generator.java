import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());

        for (int i = beginning / 1000; i <= ending / 1000; i++) {
            for (int j = beginning % 1000 / 100; j <= ending % 1000 / 100; j++) {
                for (int k = beginning % 100 / 10; k <= ending % 100 / 10; k++) {
                    for (int l = beginning % 10; l <= ending % 10 ; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}

