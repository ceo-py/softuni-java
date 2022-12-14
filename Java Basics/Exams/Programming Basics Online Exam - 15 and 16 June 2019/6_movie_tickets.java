import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOne = in.nextInt();
        int numberTwo = in.nextInt();
        int number = in.nextInt();

        for (int i = numberOne; i < numberTwo; i++) {
            char nOne = (char) i;

            for (int o = 1; o < number; o++) {
                for (int p = 1; p < number / 2; p++) {
                    if (i % 2 != 0 && (i + o + p) % 2 != 0) {
                        System.out.println(nOne + "-" + o + p + i);
                    }
                }
            }
        }
    }
}