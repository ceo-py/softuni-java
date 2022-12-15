import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> spaceList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int index = Integer.parseInt(scanner.nextLine());
        int removedSum = 0;
        while (spaceList.size() > 0) {

            if (index < 0) {
                int toRemove = spaceList.get(0);
                spaceList.remove(0);
                removedSum += toRemove;
                int lastIndexValue = spaceList.get(spaceList.size() - 1);
                spaceList.add(0, lastIndexValue);
            } else if (index > spaceList.size() - 1) {
                int toRemove = spaceList.get(spaceList.size() - 1);
                removedSum += toRemove;
                spaceList.remove(spaceList.size() - 1);
                int firstIndexValue = spaceList.get(0);
                spaceList.add(spaceList.size() - 1, firstIndexValue);
            } else {
                int currentRemoved = spaceList.get(index);
                int toRemove = spaceList.get(index);
                removedSum += toRemove;
                spaceList.remove(index);
                for (int i = 0; i < spaceList.size(); i++) {
                    if (currentRemoved >= spaceList.get(i)) {
                        int current = spaceList.get(i);
                        spaceList.add(i,current + currentRemoved);
                        spaceList.remove(i + 1);
                    } else {
                        int current = spaceList.get(i);
                        spaceList.add(i,current - currentRemoved);
                        spaceList.remove(i + 1);
                    }

                }
            }
            if (spaceList.size() == 0) {
                break;
            }

            index = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(removedSum);
    }
}
