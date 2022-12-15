import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int) Math.ceil((double) people / capacity);

        System.out.println(courses);

//        int fullCourses = people / capacity;
//        int halfCourses = people % capacity;
//
//        if (capacity >= people) {
//            System.out.println("1");
//        } else if (halfCourses != 0) {
//            System.out.println(fullCourses + 1);
//        } else {
//            System.out.println(people / capacity);
//        }
    }
}
