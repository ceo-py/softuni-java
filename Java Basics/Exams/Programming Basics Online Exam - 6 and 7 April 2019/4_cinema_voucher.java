import java.util.Scanner;

public class CinemaVoucher04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherSum = Integer.parseInt(scanner.nextLine());
        String item = "";

        int ticketsBought = 0;
        int otherItemsBought = 0;
        int cost = 0;

        while (!item.equals("End")) {
            item = scanner.nextLine();
            int symbols = item.length();

            if (symbols > 8) {
                cost = item.charAt(0) + item.charAt(1);
                if (cost <= voucherSum) {
                    ticketsBought++;
                    voucherSum -= cost;
                } else {
                    break;
                }
            } else {
                cost = item.charAt(0);
                if (cost <= voucherSum && !item.equals("End")) {
                    otherItemsBought++;
                    voucherSum -= cost;
                } else {
                    break;
                }
            }

        }
        System.out.println(ticketsBought);
        System.out.println(otherItemsBought);

    }
}
