import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int numberGroups = in.nextInt();

    int fivePeopleGroups = 0;
    int sixToTwelveGroups = 0;
    int thirteenPeopleGroups = 0;
    int twentySixPeopleGroups = 0;
    int overFortyOnePeopleGroups = 0;
    int totalPeople = 0;
    int totalMusala = 0;
    int totalMonblan = 0;
    int totalKilimandjaro = 0;
    int totalKtwo = 0;
    int totalEverest = 0;

    for (int groups = 0; groups < numberGroups; groups++) {
      int group = in.nextInt();
      totalPeople += group;
      if (group <= 5) {
        fivePeopleGroups += 1;
        totalMusala += group;
      } else if (5 < group && group <= 12) {
        sixToTwelveGroups += 1;
        totalMonblan += group;
      } else if (12 < group && group <= 25) {
        thirteenPeopleGroups += 1;
        totalKilimandjaro += group;
      } else if (25 < group && group <= 40) {
        twentySixPeopleGroups += 1;
        totalKtwo += group;
      } else if (group > 40) {
        overFortyOnePeopleGroups += 1;
        totalEverest += group;
      }
    }

    double musala = (double) totalMusala / totalPeople * 100;
    double monblan = (double) totalMonblan / totalPeople * 100;
    double kilimandjaro = (double) totalKilimandjaro / totalPeople * 100;
    double ktwo = (double) totalKtwo / totalPeople * 100;
    double everest = (double) totalEverest / totalPeople * 100;

    System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n", musala, monblan, kilimandjaro, ktwo, everest);
  }
}


// import java.util.Scanner;
//
// public class TrekkingMania {
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         //На първия ред – броя на групите от катерачи – цяло число в интервала [1...1000]
//         //За всяка една група на отделен ред – броя на хората в групата – цяло число в интервала [1...1000]
//
//         int groups = Integer.parseInt(scanner.nextLine());
//
//         int groupOne = 0;
//         int groupTwo = 0;
//         int groupThree = 0;
//         int groupFour = 0;
//         int groupFive = 0;
//
//         int totalPeople = 0;
//
//         for (int currentGroup = 0; currentGroup < groups; currentGroup++) {
//
//             int membersInTheGroup = Integer.parseInt(scanner.nextLine());
//             totalPeople += membersInTheGroup;
//
//             if (membersInTheGroup <= 5) {
//                 groupOne += membersInTheGroup;
//             } else if (membersInTheGroup <= 12) {
//                 groupTwo += membersInTheGroup;
//             } else if (membersInTheGroup <= 25) {
//                 groupThree += membersInTheGroup;
//             } else if (membersInTheGroup <= 40) {
//                 groupFour += membersInTheGroup;
//             } else {
//                 groupFive += membersInTheGroup;
//             }
//
//         }
//
//         System.out.printf("%.02f%%%n", groupOne * 1.0 / totalPeople * 100);
//         System.out.printf("%.02f%%%n", groupTwo * 1.0 / totalPeople * 100);
//         System.out.printf("%.02f%%%n", groupThree * 1.0 / totalPeople * 100);
//         System.out.printf("%.02f%%%n", groupFour * 1.0 / totalPeople * 100);
//         System.out.printf("%.02f%%%n", groupFive * 1.0 / totalPeople * 100);
//
//
//     }
// }