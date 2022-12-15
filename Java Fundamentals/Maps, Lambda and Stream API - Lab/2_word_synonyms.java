import java.util.*;

public class WordSynonyms02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonyms.containsKey(word)) {
                synonyms.put(word, new ArrayList<>());
                synonyms.get(word).add(synonym);
            } else {
                synonyms.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
