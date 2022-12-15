import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            resourceMap.putIfAbsent(resource, 0);
            resourceMap.put(resource, resourceMap.get(resource) + quantity);

            input = scanner.nextLine();
        }

        resourceMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
