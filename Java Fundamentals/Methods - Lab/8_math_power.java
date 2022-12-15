import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(calcNumToPower(number,power)));
    }

    public static double calcNumToPower (double a, double power) {
        double result = 1;


        for (int i = 1; i <= power ; i++) {
            result *= a;
        }
        return result;
    }
}
