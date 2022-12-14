public class MultiplicationTable02 {
    public static void main(String[] args) {
        for (int firstNumber = 1; firstNumber <= 10 ; firstNumber++) {
            for (int secondNumber = 1; secondNumber <= 10  ; secondNumber++) {
                System.out.printf("%d * %d = %d%n", firstNumber, secondNumber, firstNumber * secondNumber);
            }
        }
    }
}
