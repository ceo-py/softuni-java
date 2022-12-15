package Students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Students> students = new ArrayList<>();

        while (!input.equals("end")) {
            String [] studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];

            Students student = new Students(firstName, lastName, age, city);
            students.add(student);

            input = scanner.nextLine();
        }

        String filterCity = scanner.nextLine();

        for (Students student : students) {
            if (student.getHomeTown().equals(filterCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge(), student.getHomeTown());
            }
        }

    }
}


package Students_05;

public class Students {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String hometown;

    public Students(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getHomeTown () {
        return this.hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

}