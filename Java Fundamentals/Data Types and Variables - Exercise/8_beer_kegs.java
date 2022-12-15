import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String winner = "";

        for (int i = 1; i <= numberKegs; i++) {
            String brand = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume >= maxVolume) {
                winner = brand;
                maxVolume = volume;
            }
        }
        System.out.println(winner);
    }
}
