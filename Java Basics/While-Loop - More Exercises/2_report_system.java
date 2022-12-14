import java.util.Scanner;

public class ReportSystem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumExpected = Integer.parseInt(scanner.nextLine());

        String sales = scanner.nextLine();
        double sumDonatedCash = 0;
        double sumDonatedCard = 0;
        int salesAttempted = 0;
        int salesCountCash = 0;
        int salesCountCard = 0;

        while (!sales.equals("End")) {
            int sum = Integer.parseInt(sales);
            salesAttempted++;
            if (salesAttempted % 2 != 0) {
                if (sum <= 100) {
                    System.out.println("Product sold!");
                    sumDonatedCash += sum;
                    salesCountCash++;
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (sum <= 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    sumDonatedCard += sum;
                    salesCountCard++;
                }
            }
            if (sumDonatedCard + sumDonatedCash >= sumExpected) {
                break;
            }
            sales = scanner.nextLine();
        }

        if (sumDonatedCard + sumDonatedCash >= sumExpected) {
            System.out.printf("Average CS: %.2f%n", sumDonatedCash / salesCountCash);
            System.out.printf("Average CC: %.2f", sumDonatedCard / salesCountCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
            }


    }

}


