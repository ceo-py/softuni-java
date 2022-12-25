import T17Generics.exercise.E03GenericSwapMethodString.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();

        for (int i = 0; i < n; i++) {
            Integer element = Integer.parseInt(scanner.nextLine());
            box.add(element);
        }

        String[] indices = scanner.nextLine().split(" ");
        int firstIndex = Integer.parseInt(indices[0]);
        int firstISecond = Integer.parseInt(indices[1]);

        box.swap(firstIndex, firstISecond);

        System.out.println(box);
    }
}