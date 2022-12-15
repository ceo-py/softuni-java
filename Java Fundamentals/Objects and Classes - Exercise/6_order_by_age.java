package Order_By_Age_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<OrderByAge> order = new ArrayList<>();

        while (!input.equals("End")) {
            String [] tokens = input.split("\\s+");
            String name = tokens[0];
            String ID = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            OrderByAge orderByAge = new OrderByAge(name, ID, age);
            order.add(orderByAge);

            input = scanner.nextLine();
        }

        List<OrderByAge> sortedList = order
            .stream()
            .sorted(Comparator.comparing(OrderByAge::getAge))
            .collect(Collectors.toList());

        for (OrderByAge output : sortedList) {
            System.out.println(output);
        }

    }
}

package Order_By_Age_07;

public class OrderByAge {
    private String name;
    private String ID;
    private int age;

    public OrderByAge (String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", name, ID, age); // Stefan with ID: 524244 is 10 years old.
    }

}