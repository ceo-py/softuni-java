import java.util.Scanner;

public class Renovation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentUnpainted = Integer.parseInt(scanner.nextLine());

        double area = Math.ceil(height * width * 4 * ((100.0 - percentUnpainted) / 100));

        String input = scanner.nextLine();

        while (!input.equals("Tired!")) {
            int litresPaint = Integer.parseInt(input);

            area -= litresPaint;

            if (area == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
                break;
            }
            if (area < 0) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", litresPaint - (area + litresPaint));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Tired!")) {
            System.out.printf("%.0f quadratic m left.", area);
        }
    }
}
