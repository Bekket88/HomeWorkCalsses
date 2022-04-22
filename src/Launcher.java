public class Launcher {

    public static void main (String[] strings) {

        Book witcher = new Book("Ведьмак", 1990, new Author("Анджей", "Сапковский"));
        witcher.setReleaseYear(1986);
        System.out.println(witcher.getBookName() + ", " + witcher.getAuthor().getFirstName() + " " + witcher.getAuthor().getLastName() + ", " + witcher.getReleaseYear());

        Book dune = new Book ("Дюна", 1965, new Author("Френк", "Герберт"));
        System.out.println(dune.getBookName() + ", " + dune.getAuthor().getFirstName() + " " + dune.getAuthor().getLastName() + ", " + dune.getReleaseYear());
    }
}
