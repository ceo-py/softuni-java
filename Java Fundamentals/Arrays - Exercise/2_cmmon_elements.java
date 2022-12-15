import java.util.Objects;
import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr= scanner.nextLine().split(" ");
        String[] secondArr= scanner.nextLine().split(" ");

        for (String item : secondArr) {
            for (String object: firstArr) {
                if (item.equals(object)) {
                    System.out.print(item + " ");
                }
            }
        }
    }
}
