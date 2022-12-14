import java.util.Scanner;

public class Bills06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double waterCost = months * 20;
        double internetCost = months * 15;
        double electricityCost = 0;
        double otherCost = 0;
        double cost = 0;

        for (int i = 1; i <= months ; i++) {
            double electricityPricePerMonth = Double.parseDouble(scanner.nextLine());

            electricityCost += electricityPricePerMonth;
            otherCost = (electricityCost + waterCost + internetCost) * 1.2;
            cost = otherCost + waterCost + electricityCost + internetCost;
        }
        System.out.printf("Electricity: %.2f lv%n", electricityCost);
        System.out.printf("Water: %.2f lv%n", waterCost);
        System.out.printf("Internet: %.2f lv%n", internetCost);
        System.out.printf("Other: %.2f lv%n", otherCost);
        System.out.printf("Average: %.2f lv", cost / months);
    }
}
