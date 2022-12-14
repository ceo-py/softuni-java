import java.util.Scanner;

public class OscarsCeremony01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);

        double rent = Double.parseDouble(scanner.nextLine());

        double statues = rent * 0.7;
        double catering = statues * 0.85;
        double sound = catering * 0.5;

        double totalCost = rent + statues + catering + sound;

        System.out.printf("%.2f", totalCost);
    }
}
