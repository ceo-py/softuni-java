import java.util.Scanner;

public class GuineaPig01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverKg = Double.parseDouble(scanner.nextLine()) * 1000;
        double pidWeight = Double.parseDouble(scanner.nextLine()) * 1000;

        for (int i = 1; i <= 30; i++) {

            if (enoughQuantities(foodKg, hayKg, coverKg)) {
                break;
            }

            foodKg -= 300;

            if (i % 2 == 0) {
                hayKg -= foodKg * 0.05;
            }
            if (i % 3 == 0) {
                coverKg -= pidWeight / 3;
            }
        }
        if (!enoughQuantities(foodKg, hayKg, coverKg)) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodKg / 1000, hayKg / 1000, coverKg / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }

    private static boolean enoughQuantities (double food, double hay, double cover) {
        return food <= 0 || hay <= 0 || cover <= 0;
    }
}
