import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStudents = Integer.parseInt(bufferedReader.readLine());
        TreeMap<String, ArrayList<Double>> students = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String[] studentInfo = bufferedReader.readLine().split("\\s+");
            String studentName = studentInfo[0];
            Double studentGrade = Double.parseDouble(studentInfo[1]);

            if (!students.containsKey(studentName)) {
                ArrayList<Double> grades = new ArrayList<>();
                grades.add(studentGrade);
                students.put(studentName, grades);
            } else {
                ArrayList<Double> studentGrades = students.get(studentName);
                studentGrades.add(studentGrade);
                students.put(studentName, studentGrades);
            }
        }

        for (String student : students.keySet()) {
            ArrayList<Double> grades = students.get(student);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(student).append(" -> ");
            for (int i = 0; i < grades.size(); i++) {
                stringBuilder.append(String.format("%.2f", grades.get(i))).append(" ");
            }
            stringBuilder.append("(avg: ").append(String.format("%.2f", getAverage(grades))).append(")");
            System.out.println(stringBuilder.toString());
        }
    }

    private static Double getAverage(List<Double> grades) {
        double total = 0d;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
        return total / grades.size();
    }
}