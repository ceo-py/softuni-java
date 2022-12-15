import java.util.*;

public class Courses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courseDataMap = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String[] data = input.split(" : ");
            String courseName = data[0];
            String studentName = data[1];

            if (!courseDataMap.containsKey(courseName)) {
                courseDataMap.put(courseName, new ArrayList<>());
                courseDataMap.get(courseName).add(studentName);
            } else {
                courseDataMap.get(courseName).add(studentName);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseDataMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            System.out.print(listNamesInFormat(entry.getValue()));
        }
    }

    public static String listNamesInFormat (List<String> list) {
        StringBuilder sb = new StringBuilder();

        for (String item : list) {
            sb.append("-- ");
            sb.append(item);
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}
