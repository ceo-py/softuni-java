import java.util.Scanner;

public class Energy_Booster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String taste = scanner.nextLine();
        String set = scanner.nextLine();
        int setNum = Integer.parseInt(scanner.nextLine());

        double watermelonPrice = 0;
        double mangoPrice = 0;
        double pineapplePrice = 0;
        double raspberryPrice = 0;
        double totalPrice = 0;

        switch (taste) {
            case "Watermelon" :
                if (set.equals("small")) {
                    watermelonPrice = 2 * 56;
                    totalPrice = watermelonPrice * setNum;
                }
                if (set.equals("big")) {
                    watermelonPrice = 5 * 28.7;
                    totalPrice = watermelonPrice * setNum;
                }
                break;
            case "Mango" :
                if (set.equals("small")) {
                    mangoPrice = 2 * 36.66;
                    totalPrice = mangoPrice * setNum;
                }
                if (set.equals("big")) {
                    mangoPrice = 5 * 19.6;
                    totalPrice = mangoPrice * setNum;
                }
                break;
            case "Pineapple" :
                if (set.equals("small")) {
                    pineapplePrice = 2 * 42.1;
                    totalPrice = pineapplePrice * setNum;
                }
                if (set.equals("big")) {
                    pineapplePrice = 5 * 24.8;
                    totalPrice = pineapplePrice * setNum;
                }
                break;
            case "Raspberry" :
                if (set.equals("small")) {
                    raspberryPrice = 2 * 20;
                    totalPrice = raspberryPrice * setNum;
                }
                if (set.equals("big")) {
                    raspberryPrice = 5 * 15.2;
                    totalPrice = raspberryPrice * setNum;
                }
                break;
        }
        double finalresult = 0;

        if (totalPrice >= 400 && totalPrice <= 1000) {
            finalresult = totalPrice - (totalPrice * 0.15);
        }
        if (totalPrice > 1000) {
            finalresult = totalPrice - (totalPrice * 0.5);
        }
        if (totalPrice < 400) {
            finalresult = totalPrice;
        }

        System.out.printf("%.2f lv.", finalresult);
    }
}