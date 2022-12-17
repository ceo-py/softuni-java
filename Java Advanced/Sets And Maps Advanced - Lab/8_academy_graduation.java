import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfStudents = Integer.parseInt(bufferedReader.readLine());
        TreeMap<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String name = bufferedReader.readLine();
            List<Double> gradesInput = Arrays.stream(bufferedReader.readLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

            if(!students.containsKey(name)){
                students.put(name, gradesInput);
            }
            else{
                students.get(name).addAll(gradesInput);
            }
        }

        for (String student: students.keySet()){
            System.out.println(String.format("%s is graduated with %s", student, getAverage(students.get(student))));
        }
    }

    private static Double getAverage(List<Double> grades){
        double total = 0d;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
        return total / grades.size();
    }
}