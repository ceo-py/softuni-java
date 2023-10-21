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



// import java.util.Scanner;
//
// public class MobileOperator {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         String contractPeriod = scanner.nextLine();
//         String contractType = scanner.nextLine();
//         String isInternetIncluded = scanner.nextLine();
//         int monthPeriod = Integer.parseInt(scanner.nextLine());
//
//         double monthlyPrice = 0.00;
//
//         if (contractPeriod.equals("one")) {
//             switch (contractType) {
//                 case "Small":
//                     monthlyPrice = 9.98;
//                     break;
//                 case "Middle":
//                     monthlyPrice = 18.99;
//                     break;
//                 case "Large":
//                     monthlyPrice = 25.98;
//                     break;
//                 case "ExtraLarge":
//                     monthlyPrice = 35.99;
//                     break;
//             }
//         } else {
//             switch (contractType) {
//                 case "Small":
//                     monthlyPrice = 8.58;
//                     break;
//                 case "Middle":
//                     monthlyPrice = 17.09;
//                     break;
//                 case "Large":
//                     monthlyPrice = 23.59;
//                     break;
//                 case "ExtraLarge":
//                     monthlyPrice = 31.79;
//                     break;
//             }
//         }
//
//         if (isInternetIncluded.equals("yes")) {
//
//             if (monthlyPrice <= 10.00) {
//                 monthlyPrice = monthlyPrice + 5.50;
//             } else if (monthlyPrice <= 30.00) {
//                 monthlyPrice = monthlyPrice + 4.35;
//             } else {
//                 monthlyPrice = monthlyPrice + 3.85;
//             }
//         }
//
//         double totalSum = monthlyPrice * monthPeriod;
//
//         if (contractPeriod.equals("two")){
//             totalSum = totalSum - (totalSum * (3.75 / 100.0));
//         }
//
//         System.out.printf("%.2f lv.", totalSum);
//     }
// }





// import java.util.Scanner;
//
// public class MobileOperator {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         String contractPeriod = scanner.nextLine();
//         String contractType = scanner.nextLine();
//         boolean isInternetIncluded = scanner.nextLine().equals("yes");
//         int monthPeriod = Integer.parseInt(scanner.nextLine());
//
//         double monthlyPrice = 0.00;
//
//         if (contractPeriod.equals("one")) {
//             switch (contractType) {
//                 case "Small":
//                     monthlyPrice = 9.98;
//                     break;
//                 case "Middle":
//                     monthlyPrice = 18.99;
//                     break;
//                 case "Large":
//                     monthlyPrice = 25.98;
//                     break;
//                 case "ExtraLarge":
//                     monthlyPrice = 35.99;
//                     break;
//             }
//         } else {
//             switch (contractType) {
//                 case "Small":
//                     monthlyPrice = 8.58;
//                     break;
//                 case "Middle":
//                     monthlyPrice = 17.09;
//                     break;
//                 case "Large":
//                     monthlyPrice = 23.59;
//                     break;
//                 case "ExtraLarge":
//                     monthlyPrice = 31.79;
//                     break;
//             }
//         }
//
//         if (isInternetIncluded) {
//
//             if (monthlyPrice <= 10.00) {
//                 monthlyPrice = monthlyPrice + 5.50;
//             } else if (monthlyPrice <= 30.00) {
//                 monthlyPrice = monthlyPrice + 4.35;
//             } else {
//                 monthlyPrice = monthlyPrice + 3.85;
//             }
//         }
//
//         double totalSum = monthlyPrice * monthPeriod;
//
//         if (contractPeriod.equals("two")){
//             totalSum = totalSum - (totalSum * (3.75 / 100.0));
//         }
//
//         System.out.printf("%.2f lv.", totalSum);
//     }
// }
