import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberSeries = Integer.parseInt(scanner.nextLine());

        double cost = 0;
        double totalCost = 0;

        for (int i = 1; i <= numberSeries; i++) {
            String nameSeries = scanner.nextLine();
            double priceSeries = Double.parseDouble(scanner.nextLine());


            switch (nameSeries) {
                case "Thrones":
                    cost = priceSeries * 0.5;
                    totalCost += cost;
                    break;
                case "Lucifer":
                    cost = priceSeries * 0.6;
                    totalCost += cost;
                    break;
                case "Protector":
                    cost = priceSeries * 0.7;
                    totalCost += cost;
                    break;
                case "TotalDrama":
                    cost = priceSeries * 0.8;
                    totalCost += cost;
                    break;
                case "Area":
                    cost = priceSeries * 0.9;
                    totalCost += cost;
                    break;
                default:
                    totalCost += priceSeries;
                    break;
            }
        }
        if (budget >= totalCost) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalCost);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalCost - budget);
        }
    }
}
