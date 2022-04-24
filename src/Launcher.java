import java.util.ArrayList;

public class Launcher {

    public static void addBook(Book[] books, Book addBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = addBook;
                break;
            }
        }
    }
    public static void printBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ": " + book.getBookName() + ": " + book.getReleaseYear());
            }
        }
    }

    public static void main(String[] strings) {

        Book witcher = new Book("Ведьмак", 1990, new Author("Анджей", "Сапковский"));
        witcher.setReleaseYear(1986);
        Book dune = new Book("Дюна", 1965, new Author("Френк", "Герберт"));

        Book[] books = new Book[5];
        addBook(books, witcher);
        addBook(books, dune);
        printBooks(books);
    }
}
