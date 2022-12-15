import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentAcademy06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> studentGradesMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentGradesMap.putIfAbsent(name, grade);
            double currentAverageGrade = studentGradesMap.get(name);
            studentGradesMap.put(name, (grade + currentAverageGrade) / 2);

        }
        Map<String, Double> filteredMap = new LinkedHashMap<>();

        //Map<String, Double> filteredMap = studentGradesMap.entrySet().stream().filter(e -> e.getValue() >= 4.50).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        for (Map.Entry<String, Double> entry : studentGradesMap.entrySet()) {
            if (entry.getValue() >= 4.50) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, Double> entry : filteredMap.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
