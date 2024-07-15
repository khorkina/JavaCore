package lesson8;

public class Book {
    String name;
    String author;
    int papers;
    boolean isNonFiction;

    public Book(String name, String author, int papers, boolean isNonFiction) {
        this.name = name;
        this.author = author;
        this.papers = papers;
        this.isNonFiction = isNonFiction;
    }

    public void printCountRows() {
        System.out.println("Numbers of str in the book: " + this.papers * 40);

    }

    public void printCountRows(int countRowsOnPage) {
        System.out.println("Numbers of str in the book: " + this.papers * countRowsOnPage);

    }

    public void printInfo() {
        System.out.printf("%s of %s - %s\n", this.name, this.author,
                this.isNonFiction ? "Documentary" : "Not documentary");
        printCountRows();
    }

}
