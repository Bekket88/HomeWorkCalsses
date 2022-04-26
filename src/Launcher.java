
public class Launcher {

    public static void main(String[] strings) {

        Book witcher = new Book("Witcher", 1990, new Author("Andrzej", "Sapkowski"));
        witcher.setReleaseYear(1980);
        Book dune = new Book("Dune", 1965, new Author("Frank", "Herbert"));
        Book theStand = new Book("The Stand", 1978, new Author("Stephen", "Stephen King"));

        Library library = new Library(5);
        library.addBook(witcher);
        library.addBook(dune);
        library.addBook(theStand);
        library.changeReleaseYear(witcher, 1986);
        library.printAllBooks();
        library.printBookInfo(witcher);






    }
}
