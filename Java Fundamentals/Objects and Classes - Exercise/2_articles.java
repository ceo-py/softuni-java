package Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author =  input.split(", ")[2];

        Articles article = new Articles(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String typeCommand = command.split(": ")[0];
            String newData = command.split(": ")[1];

            switch (typeCommand) {
                case "Edit":
                    article.edit(newData);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newData);
                    break;
                case "Rename":
                    article.rename(newData);
                    break;
            }
        }

        System.out.println(article);
    }
}


package Articles_02;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }

}