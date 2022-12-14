import java.util.Scanner;

public class PaintingEggs03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String colour = scanner.nextLine();
        int batches = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;

        switch (size) {
            case "Large":
                switch (colour) {
                    case "Red":
                        totalCost = batches * 16 * 0.65;
                        break;
                    case "Green":
                        totalCost = batches * 12 * 0.65;
                        break;
                    case "Yellow":
                        totalCost = batches * 9 * 0.65;
                        break;
                } break;
            case "Medium":
                switch (colour) {
                    case "Red":
                        totalCost = batches * 13 * 0.65;
                        break;
                    case "Green":
                        totalCost = batches * 9 * 0.65;
                        break;
                    case "Yellow":
                        totalCost = batches * 7 * 0.65;
                        break;
                } break;
            case "Small":
                switch (colour) {
                    case "Red":
                        totalCost = batches * 9 * 0.65;
                        break;
                    case "Green":
                        totalCost = batches * 8 * 0.65;
                        break;
                    case "Yellow":
                        totalCost = batches * 5 * 0.65;
                        break;
                } break;
        }
        System.out.printf("%.2f leva.", totalCost);
    }
}
