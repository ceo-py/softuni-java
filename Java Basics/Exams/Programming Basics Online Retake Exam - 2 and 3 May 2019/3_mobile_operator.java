import java.util.Scanner;

public class MobileOperator03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String period = sc.nextLine();
        String typeContract = sc.nextLine();
        String mobileInternet = sc.nextLine();
        int months = Integer.parseInt(sc.nextLine());

        double totalCost = 0;

        switch (period){
            case "one":
                switch (typeContract) {
                    case "Small":
                        switch (mobileInternet) {
                            case "yes":
                                totalCost = 9.98 + 5.5;
                                break;
                            case "no":
                                totalCost = 9.98;
                                break;
                        }
                        break;
                    case "Middle":
                        switch (mobileInternet) {
                            case "yes":
                                totalCost = 18.99 + 4.35;
                                break;
                            case "no":
                                totalCost = 18.99;
                                break;
                        }
                        break;
                    case "Large":
                        switch (mobileInternet) {
                            case "yes":
                                totalCost = 25.98 + 4.35;
                                break;
                            case "no":
                                totalCost = 25.98;
                                break;
                        }
                        break;
                    case "ExtraLarge":
                        switch (mobileInternet) {
                            case "yes":
                                totalCost = 35.99 + 3.85;
                                break;
                            case "no":
                                totalCost = 35.99;
                                break;
                        }
                        break;
                }break;
            case "two":
                switch (typeContract) {
                    case "Small":
                        switch (mobileInternet) {
                            case "yes":
                                totalCost = 8.58 + 5.5;
                                break;
                            case "no":
                                totalCost = 8.58;
                                break;
                        }
                        break;
                    case "Middle":
                        switch (mobileInternet) {
                            case "yes":
                                totalCost = 17.09 + 4.35;
                                break;
                            case "no":
                                totalCost = 17.09;
                                break;
                        }
                        break;
                    case "Large":
                        switch (mobileInternet) {
                            case "yes":
                                totalCost = 23.59 + 4.35;
                                break;
                            case "no":
                                totalCost = 23.59;
                                break;
                        }
                        break;
                    case "ExtraLarge":
                        switch (mobileInternet) {
                            case "yes":
                                totalCost = 31.79 + 3.85;
                                break;
                            case "no":
                                totalCost = 31.79;
                                break;
                        }
                        break;
                }break;
        }
        if (period.equals("two")) {
            totalCost *= 0.9625 * months;
        } else {
            totalCost *= months;
        }
        System.out.printf("%.2f lv.", totalCost);
    }
}
