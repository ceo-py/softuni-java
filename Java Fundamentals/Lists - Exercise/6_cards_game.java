import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> playerOneCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwoCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        while (playerOneCards.size() > 0 && playerTwoCards.size() > 0) {

            if (playerOneCards.get(0) >= playerTwoCards.get(0)) {
                if (playerOneCards.get(0) > playerTwoCards.get(0)) {
                    playerOneCards.add(playerTwoCards.get(0));
                    playerOneCards.add(playerOneCards.get(0));
                }
                playerOneCards.remove(0);
                playerTwoCards.remove(0);
            } else {
                playerTwoCards.add(playerOneCards.get(0));
                playerTwoCards.add(playerTwoCards.get(0));
                playerTwoCards.remove(0);
                playerOneCards.remove(0);
            }
        }
        if (playerOneCards.size() > 0) {
            for (int i = 0; i < playerOneCards.size(); i++) {
                sum += playerOneCards.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int i = 0; i < playerTwoCards.size(); i++) {
                sum += playerTwoCards.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
