import java.util.Scanner;

public class MovieDay02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeShooting = Integer.parseInt(scanner.nextLine());
        int numberScenes = Integer.parseInt(scanner.nextLine());
        int timePerScene = Integer.parseInt(scanner.nextLine());

        double totalTime = numberScenes * timePerScene + timeShooting * 0.15;

        if (totalTime <= timeShooting) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(timeShooting - totalTime));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(totalTime - timeShooting));
        }
    }
}




// import java.util.Scanner;
//
// public class MovieDay {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         // 1. Прочитаме входните данни
//         int shootingTime = Integer.parseInt(scanner.nextLine());
//         int sceneCount = Integer.parseInt(scanner.nextLine());
//         int sceneDuration = Integer.parseInt(scanner.nextLine());
//
//         // 2. Изчисляваме подготовката на терен -> 15% от времето за снимки
//         double preparation = shootingTime * 0.15;
//
//         // 3. Намираме общото време за снимки
//         double totalTime = (sceneCount * sceneDuration) + preparation;
//
//         // 4. Проверяваме дали времето e достатъчно
//         if (shootingTime >= totalTime) {
//             System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(shootingTime - totalTime));
//         } else {
//             System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(totalTime - shootingTime));
//         }
//     }
// }