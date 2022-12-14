import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int totalNumbersForInput = sc.nextInt();

    ArrayList<Double> allNumbers = new ArrayList<>();
    ArrayList<Double> oddNumbers = new ArrayList<>();
    ArrayList<Double> evenNumbers = new ArrayList<>();

    for (int i = 0; i < totalNumbersForInput; i++) {
      allNumbers.add(sc.nextDouble());
    }

    int check = 0;

    for (double number : allNumbers) {
      if (check % 2 == 0) {
        oddNumbers.add(number);
      } else {
        evenNumbers.add(number);
      }
      check++;
    }

    double evenSum = 0;
    for (double number : evenNumbers) {
      evenSum += number;
    }

    double oddSum = 0;
    for (double number : oddNumbers) {
      oddSum += number;
    }

    evenNumbers.sort(null);
    oddNumbers.sort(null);

    if (totalNumbersForInput == 1) {
      System.out.printf("OddSum=%.2f,\n", oddSum);
      System.out.printf("OddMin=%.2f,\n", oddNumbers.get(0));
      System.out.printf("OddMax=%.2f,\n", oddNumbers.get(oddNumbers.size() - 1));
      System.out.printf("EvenSum=%.2f,\n", evenSum);
      System.out.println("EvenMin=No,");
      System.out.println("EvenMax=No");
    } else if (totalNumbersForInput == 0) {
        System.out.printf("OddSum=0.00,\n");
        System.out.printf("OddMin=No,\n");
        System.out.printf("OddMax=No,\n");
        System.out.printf("EvenSum=0.00,\n");
        System.out.println("EvenMin=No,");
        System.out.println("EvenMax=No");
    } else {
        System.out.printf("OddSum=%.2f,\n", oddSum);
        System.out.printf("OddMin=%.2f,\n", oddNumbers.get(0));
        System.out.printf("OddMax=%.2f,\n", oddNumbers.get(oddNumbers.size() - 1));
        System.out.printf("EvenSum=%.2f,\n", evenSum);
        System.out.printf("EvenMin=%.2f,\n", evenNumbers.get(0));
        System.out.printf("EvenMax=%.2f\n", evenNumbers.get(evenNumbers.size() - 1));
    }
  }
}