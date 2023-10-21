import java.util.Scanner;

public class Moving07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;
        String action = scanner.nextLine();

        while (!action.equals("Done")) {
            int box = Integer.parseInt(action);

            volume -= box;

            if (volume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
                break;
            }
            action = scanner.nextLine();
        }
        if (action.equals("Done")) {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}


//
// import java.util.Scanner;
//
// public class Moving {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//
//         //1.	Широчина на свободното пространство - цяло число в интервала [1...1000]
//         //2.	Дължина на свободното пространство - цяло число в интервала [1...1000]
//         //3.	Височина на свободното пространство - цяло число в интервала [1...1000]
//
//         int width = Integer.parseInt(scanner.nextLine());
//         int length = Integer.parseInt(scanner.nextLine());
//         int height = Integer.parseInt(scanner.nextLine());
//
//         //Бележка: Един кашон е с точни размери:  1m. x 1m. x 1m.
//
//         int apartmentVolume = width * length * height;
//
//          String input = scanner.nextLine();
//          while (!input.equals("Done")){
//              int boxes = Integer.parseInt(input);
//              apartmentVolume -= boxes;
//
//              if (apartmentVolume < 0){
//                  System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(apartmentVolume));
//                  break;
//              }
//              input = scanner.nextLine();
//          }
//
//          if (apartmentVolume >= 0){
//              System.out.printf("%d Cubic meters left.", apartmentVolume);
//          }
//
//     }
// }