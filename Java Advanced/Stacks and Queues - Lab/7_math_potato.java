import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] children = scan.nextLine().split("\\s+");
        int n = Integer.valueOf(scan.nextLine());
        int round = 1;

        PriorityQueue<String> childrens = new PriorityQueue<>(Arrays.asList(children));

        while (childrens.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                String currentChild = childrens.poll();
                childrens.offer(currentChild);
            }
            if (isPrime(round)) {
                String child = childrens.peek();
                System.out.println("Prime " + child);
            } else {
                String child = childrens.poll();
                System.out.println("Removed " + child);
            }
            round++;
        }
        System.out.println("Last is " + childrens.poll());
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
