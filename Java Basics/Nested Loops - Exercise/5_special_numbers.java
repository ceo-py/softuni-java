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



// import java.util.Scanner;
//
// public class SpecialNumbers {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         int myNumber = Integer.parseInt(scanner.nextLine());
//
//         for (int currentNumber = 1111; currentNumber <= 9999; currentNumber++) {
//
//             boolean isSpecial = true;
//             String textNumber = String.valueOf(currentNumber);
//
//             for (int position = 0; position < textNumber.length(); position++) {
//
//                 int digit = Integer.parseInt(String.valueOf(textNumber.charAt(position)));
//
//                 if (digit == 0) {
//                     isSpecial = false;
//                     break;
//                 }
//
//                 if (myNumber % digit != 0) {
//                     isSpecial = false;
//                     break;
//                 }
//             }
//
//             if (isSpecial) {
//                 System.out.print(currentNumber + " ");
//             }
//         }
//
//     }
// }