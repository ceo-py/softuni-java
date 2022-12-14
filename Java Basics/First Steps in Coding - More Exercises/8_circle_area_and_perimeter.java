import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());

        double areaCircle = Math.PI * radius * radius;
        double circumferenceCircle = 2 * Math.PI * radius;

        System.out.printf("%.2f%n", areaCircle);
        System.out.printf("%.2f", circumferenceCircle);

    }
}
