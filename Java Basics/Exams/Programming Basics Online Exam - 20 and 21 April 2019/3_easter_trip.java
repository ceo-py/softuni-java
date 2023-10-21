import java.util.Scanner;

public class EasterTrip03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double totalCost = 0;

        switch (destination) {
            case "France":
                switch (dates) {
                    case "21-23":
                        totalCost = nights * 30;
                        break;
                    case "24-27":
                        totalCost = nights * 35;
                        break;
                    case "28-31":
                        totalCost = nights * 40;
                        break;
                } break;
            case "Italy":
                switch (dates) {
                    case "21-23":
                        totalCost = nights * 28;
                        break;
                    case "24-27":
                        totalCost = nights * 32;
                        break;
                    case "28-31":
                        totalCost = nights * 39;
                        break;
                } break;
            case "Germany":
                switch (dates) {
                    case "21-23":
                        totalCost = nights * 32;
                        break;
                    case "24-27":
                        totalCost = nights * 37;
                        break;
                    case "28-31":
                        totalCost = nights * 43;
                        break;
                } break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalCost);
    }
}



// import java.util.Scanner;
//
// public class EasterTrip_03 {
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         String destination = scanner.nextLine();
//         String dates = scanner.nextLine();
//         int nights = Integer.parseInt(scanner.nextLine());
//
//         double totalCost = 0;
//         //        21-23  24-27  28-31
//         //Франция 30 лв. 35 лв. 40 лв.
//         //Италия 28 лв. 32 лв. 39 лв.
//         //Германия 32 лв. 37 лв. 43 лв.
//
//         switch (destination) {
//             case "France":
//                 if (dates.equals("21-23")) {
//                     totalCost = nights * 30;
//                 } else if (dates.equals("24-27")) {
//                     totalCost = nights * 35;
//                 } else if (dates.equals("28-31")) {
//                     totalCost = nights * 40;
//                 }
//                 break;
//             case "Italy":
//                 switch (dates) {
//                     case "21-23":
//                         totalCost = nights * 28;
//                         break;
//                     case "24-27":
//                         totalCost = nights * 32;
//                         break;
//                     case "28-31":
//                         totalCost = nights * 39;
//                         break;
//                     default:
//                         break;
//                 }
//                 break;
//             case "Germany":
//                 switch (dates) {
//                     case "21-23":
//                         totalCost = nights * 32;
//                         break;
//                     case "24-27":
//                         totalCost = nights * 37;
//                         break;
//                     case "28-31":
//                         totalCost = nights * 43;
//                         break;
//                     default:
//                         break;
//                 }
//                 break;
//             default:
//                 break;
//         }
//
//         System.out.printf("Easter trip to %s : %.2f leva.", destination, totalCost);
//     }
// }
