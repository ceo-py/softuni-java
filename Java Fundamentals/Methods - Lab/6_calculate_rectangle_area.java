import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", areaRectangle(width, length));
    }

    public static double areaRectangle(double w, double l) {
        return w * l;
    }
}
