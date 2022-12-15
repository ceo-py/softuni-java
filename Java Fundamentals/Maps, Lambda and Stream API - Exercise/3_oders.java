import java.util.*;

public class Orders03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Map<String, List<Double>> productDataMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String[] productData = input.split(" ");
            String product = productData[0];
            double price = Double.parseDouble(productData[1]);
            double quantity = Double.parseDouble(productData[2]);

            if (!productDataMap.containsKey(product)) {
                productDataMap.put(product, new ArrayList<>());
                productDataMap.get(product).add(price);
                productDataMap.get(product).add(quantity);

            } else {
                if (productDataMap.get(product).get(0) != price) {
                    productDataMap.get(product).set(0, price);
                }
                productDataMap.get(product).set(1, productDataMap.get(product).get(1) + quantity);
            }


            input = scanner.nextLine();
        }

        productDataMap.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, productDataMap.get(k).get(0) * productDataMap.get(k).get(1)));
    }
}
