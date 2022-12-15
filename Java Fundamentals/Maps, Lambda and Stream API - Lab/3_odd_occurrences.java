import java.util.*;

public class OddOccurrences03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<String, Integer> oddNumberOccurrences = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String currentElement = input[i].toLowerCase();
            oddNumberOccurrences.putIfAbsent(currentElement, 0);
            oddNumberOccurrences.put(currentElement, oddNumberOccurrences.get(currentElement) + 1);
        }

        List<String> output = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : oddNumberOccurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                output.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", output));
    }
}
