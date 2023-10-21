import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoints;

        for (int i = 1; i <= n; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());

            int nameLength = juryName.length();

            totalPoints += (nameLength * juryPoints / 2);

            if (totalPoints > 1250.5) {
                break;
            }
        }


        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, Math.abs(totalPoints - 1250.5));
        }
    }
}



// import java.util.Scanner;
//
// public class Oscars {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//
//         String actorName = scanner.nextLine();
//         double initialPoints = Double.parseDouble(scanner.nextLine());
//         int judgesCount = Integer.parseInt(scanner.nextLine());
//
//         double totalPoints = 0;
//         totalPoints += initialPoints;
//
//         for (int i = 0; i < judgesCount; i++) {
//
//             String judgeName = scanner.nextLine();
//             double judgePoints = Double.parseDouble(scanner.nextLine());
//
//             //дължината на името * точките / две
//             totalPoints += judgeName.length() * judgePoints / 2;
//
//             if (totalPoints > 1250.5) {
//                 System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
//                 return;
//             }
//
//         }
//
//         System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
//
//     }
// }