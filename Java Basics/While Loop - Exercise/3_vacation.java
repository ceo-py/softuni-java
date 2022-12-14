import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        double startingMoney = Double.parseDouble(scanner.nextLine());

        int daysPassed = 0;
        int spendDays = 0;

        while (startingMoney < tripPrice) {
            String action = scanner.nextLine();
            double actionMoney = Double.parseDouble(scanner.nextLine());
            daysPassed++;

            if (action.equals("spend")) {
                startingMoney -= actionMoney;
                spendDays++;
                if (spendDays == 5){
                    break;
                }
                if (startingMoney < 0) {
                    startingMoney = 0;
                }
            } else if (action.equals("save")) {
                startingMoney += actionMoney;
                spendDays = 0;
            }
        }
        if (spendDays == 5) {
            System.out.println("You can't save the money.");
            System.out.println(spendDays);
        }
        if (startingMoney >= tripPrice) {
            System.out.printf("You saved the money for %d days.", daysPassed);
        }
    }
}
