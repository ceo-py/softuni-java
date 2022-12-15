import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furniture>\\w+)<<(?<price>\\d+\\.*\\d+)[!](?<quantity>\\d+)";
        String input = scanner.nextLine();

        List<String> furnitureList = new ArrayList<>();
        double totalPrice = 0;

        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureList.add(furniture);
                totalPrice += price * quantity;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String item : furnitureList) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
