package lesson8.book;

public class Tusk {
    public static void main(String[] args) {
        Book book = new Book("Blue Latern", "Pelevin", 230, false);
        book.printCountRows();
        book.printCountRows(38);
        book.printInfo();
    }
}
