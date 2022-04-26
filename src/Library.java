public class Library {
    private final Book[] books;
    private int size;

    public Library(int n) {
        this.books = new Book[n];
    }
    public void addBook(Book book) {
        books[size++] = book;

    }
    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + ": " + book.getBookName() + ": " + book.getReleaseYear());
        }
    }
    public void printBookInfo(Book book) {
        System.out.println(book.getBookName() + " by " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + " was published in " + book.getReleaseYear());
    }
    public void changeReleaseYear(Book book, int releaseYear) {
        book.setReleaseYear(releaseYear);
    }
}

