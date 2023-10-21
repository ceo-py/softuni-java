import java.util.Scanner;

public class OldBooks01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favoriteBook = scanner.nextLine();

        String currentBook = scanner.nextLine();
        int booksChecked = 0;

        while (!currentBook.equals(favoriteBook)) {

            if (currentBook.equals("No More Books")) {
                System.out.printf("The book you search is not here!%n");
                System.out.printf("You checked %d books.", booksChecked);
                break;
            }
            currentBook = scanner.nextLine();
            booksChecked++;
        }
        if (currentBook.equals(favoriteBook)) {
            System.out.printf("You checked %d books and found it.", booksChecked);
        }
    }
}



// import java.util.Scanner;
//
// public class OldBooks {
//
//     public static void main(String[] args) {
//
//         Scanner scanner = new Scanner(System.in);
//
//         String theBookOfAnnie = scanner.nextLine();
//
//         int checkedBooks = 0;
//
//         // Начало:
//         String book = scanner.nextLine();
//
//         // Условие за край:
//         while (!book.equals(theBookOfAnnie)) {
//
//             if (book.equals("No More Books")) {
//                 System.out.println("The book you search is not here!");
//                 System.out.printf("You checked %d books.", checkedBooks);
//                 return;
//             }
//
//             checkedBooks++;
//
//             // Стъпка напред (проверяваме следващата книга.):
//             book = scanner.nextLine();
//         }
//
//         System.out.printf("You checked %d books and found it.", checkedBooks);
//     }
// }