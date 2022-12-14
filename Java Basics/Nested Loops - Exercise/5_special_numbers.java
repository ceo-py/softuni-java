import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberToCheck = scanner.nextInt();

    for (int numberOne = 1; numberOne < 9; numberOne++) {
      if (numberToCheck % numberOne == 0) {
        for (int numberTwo = 1; numberTwo < 9; numberTwo++) {
          if (numberToCheck % numberTwo == 0) {
            for (int numberThree = 1; numberThree < 9; numberThree++) {
              if (numberToCheck % numberThree == 0) {
                for (int numberFour = 1; numberFour < 9; numberFour++) {
                  if (numberToCheck % numberFour == 0) {
                    System.out.print(numberOne + "" + numberTwo + "" + numberThree + "" + numberFour + " ");
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}