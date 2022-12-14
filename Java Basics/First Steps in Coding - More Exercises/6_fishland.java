import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double tsatsaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int midiKg = Integer.parseInt(scanner.nextLine());

        double palamudPrice = mackerelPrice * 1.6;
        double safridPrice = tsatsaPrice * 1.8;
        double totalPrice = palamudPrice * palamudKg + safridPrice * safridKg + midiKg * 7.50;
        System.out.printf("%.2f", totalPrice);

        }
    }

