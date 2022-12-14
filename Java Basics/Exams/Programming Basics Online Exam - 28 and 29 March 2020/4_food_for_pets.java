import java.util.Scanner;

public class Food_For_Pets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        int dog = 0;
        int cat = 0;
        double biscuits = 0;

        for (int a = 1; a <= days; a++) {
            double dogFood = Double.parseDouble(scanner.nextLine());
            double catFood = Double.parseDouble(scanner.nextLine());

            dog += dogFood;
            cat += catFood;

            if (a % 3 == 0) {
                double biscuits1 = (dogFood + catFood) * 0.1;
                biscuits += biscuits1;
            }
        }

        double totalFood = dog + cat;

        double res1 = (totalFood / food) * 100;
        double res2 = (dog / totalFood) * 100;
        double res3 = (cat / totalFood) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", res1);
        System.out.printf("%.2f%% eaten from the dog.%n", res2);
        System.out.printf("%.2f%% eaten from the cat.", res3);
    }
}