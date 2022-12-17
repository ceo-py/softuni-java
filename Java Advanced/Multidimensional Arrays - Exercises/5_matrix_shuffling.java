import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private final static String INVALID_INPUT = "Invalid input!";
    private final static String END_COMMAND = "END";
    private final static String SWAP_COMMAND = "swap";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = createMatrix(bufferedReader);

        while (true) {
            String[] command = bufferedReader.readLine().split("\\s+");
            if (command[0].equals(END_COMMAND)) {
                break;
            }
            if (!command[0].equals(SWAP_COMMAND) || command.length - 3 > matrix[0].length - 1) {
                System.out.println(INVALID_INPUT);
                continue;
            }

            int rowA = Integer.parseInt(command[1]);
            int colA = Integer.parseInt(command[2]);
            int rowB = Integer.parseInt(command[3]);
            int colB = Integer.parseInt(command[4]);

            if (!isInputValid(matrix, rowA, colA) || !isInputValid(matrix, rowB, colB)) {
                System.out.println(INVALID_INPUT);
                continue;
            }

            int firstNumber = matrix[rowA][colA];
            int secondNumber = matrix[rowB][colB];
            matrix[rowA][colA] = secondNumber;
            matrix[rowB][colB] = firstNumber;
            printMatrix(matrix);
        }

    }


    private static boolean isInputValid(int[][] matrix, int row, int col) {
        if (row < 0 || row > matrix.length - 1) {
            return false;
        }
        if (col < 0 || col > matrix[0].length - 1) {
            return false;
        }

        return true;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] createMatrix(BufferedReader bufferedReader) throws IOException {

        String[] input = bufferedReader.readLine().split("\\s+");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);


        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            int[] currentRow = Arrays.stream(bufferedReader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = currentRow;
        }

        return matrix;
    }
}