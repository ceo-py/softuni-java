import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Book bookFour = new Book("Lord of The Rings", 1950, "J. R. R. Tolkein");

        List<Book> books = new ArrayList<>();

        books.add(bookOne);
        books.add(bookThree);
        books.add(bookTwo);
        books.add(bookFour);

        books.stream()
                .sorted(new BookComparator())
                .forEach(System.out::println);
    }
}