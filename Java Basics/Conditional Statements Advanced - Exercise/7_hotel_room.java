import java.util.Scanner;

public class HotelRoom07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine().toLowerCase();
        int vacationDays = Integer.parseInt(scanner.nextLine());

        double studioCost = 0;
        double apartmentCost = 0;

        switch (month) {
            case "may":
            case "october":
                studioCost = 50 * vacationDays;
                apartmentCost = 65 * vacationDays;
                if (vacationDays <= 7) {
                    studioCost *= 1;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                } else if (vacationDays <= 14) {
                    studioCost *= 0.95;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                } else {
                    studioCost *= 0.7;
                    apartmentCost *= 0.9;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                }
                break;
            case "june":
            case "september":
                studioCost = 75.2 * vacationDays;
                apartmentCost = 68.7 * vacationDays;
                if (vacationDays > 14) {
                    studioCost *= 0.8;
                    apartmentCost *= 0.9;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                }
                break;
            case "july":
            case "august":
                studioCost = 76 * vacationDays;
                apartmentCost = 77 * vacationDays;
                if (vacationDays > 14) {
                    apartmentCost *= 0.9;
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", apartmentCost);
                    System.out.printf("Studio: %.2f lv.", studioCost);
                }
                break;
        }
    }
}





// import java.util.Scanner;
//
// public class HotelRoom {
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//
//         //На първия ред е месецът – May, June, July, August, September или October
//         //На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
//
//         String month = scanner.nextLine();
//         int overnights = Integer.parseInt(scanner.nextLine());
//
//         double apartmentPrice = 0.00;
//         double studioPrice = 0.00;
//
//         switch (month) {
//             case "May":
//             case "October":
//                 apartmentPrice = 65.00 * overnights;
//                 studioPrice = 50.00 * overnights;
//                 break;
//             case "June":
//             case "September":
//                 apartmentPrice = 68.70 * overnights;
//                 studioPrice = 75.20 * overnights;
//                 break;
//             case "July":
//             case "August":
//                 apartmentPrice = 77.00 * overnights;
//                 studioPrice = 76.00 * overnights;
//                 break;
//         }
//
//         //За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
//         //За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
//         //За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
//         //За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
//
//         if ((month.equals("May") || month.equals("October")) && (overnights < 14 && overnights > 7)){
//             studioPrice *= 0.95;
//         }else if ((month.equals("May") || month.equals("October")) && overnights > 14){
//             studioPrice *= 0.70;
//         }else if ((month.equals("June") || month.equals("September")) && overnights > 14){
//             studioPrice *= 0.80;
//         }
//         if (overnights > 14){
//             apartmentPrice *= 0.90;
//         }
//
//         System.out.printf("Apartment: %.02f lv.%n", apartmentPrice);
//         System.out.printf("Studio: %.02f lv.", studioPrice);
//
//     }
// }
