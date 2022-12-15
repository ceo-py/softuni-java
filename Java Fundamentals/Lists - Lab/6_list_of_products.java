import java.util.*;


public class ListOfProducts06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLines = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();

        for (int i = 1; i <= numberLines; i++) {
            productList.add(scanner.nextLine());
        }
        Collections.sort(productList);

        for (int i = 0; i < productList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, productList.get(i));
        }
    }
}
