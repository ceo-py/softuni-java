import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String stringNumber = "" + number;
        int sum = 0;

//        for (int i = 0; i < stringNumber.length() ; i++) {
//            char digit = stringNumber.charAt(i);
//            int current = Integer.parseInt("" +digit);
//            sum += current;
//        }
//        System.out.println(sum);

        int numberDigits = number;

        for (int i = 1; i <= (int) String.valueOf(numberDigits).length(); i++) {
            int current = number % 10;
            sum += current;
            number /= 10;
        }
        System.out.println(sum);
    }
}
