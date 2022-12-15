import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");

        Map<Character, Integer> charOccurrences = new LinkedHashMap<>();

        for (String word : input) {
            for (char c : word.toCharArray()) {
                charOccurrences.putIfAbsent(c, 0);
                charOccurrences.put(c, charOccurrences.get(c) + 1);
            }
        }
        charOccurrences.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
