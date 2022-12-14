import java.util.Scanner;

public class Change_Bureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinaMoney = Double.parseDouble(scanner.nextLine());
        double comission = Double.parseDouble(scanner.nextLine());

        double result = (bitcoin * 1168 + chinaMoney * 0.264) / 1.95;
        double comission2 = comission / 100;
        double comission1 = comission2 * result;
        double finalResult = result - comission1;

        System.out.printf("%.2f", finalResult);
    }
}
