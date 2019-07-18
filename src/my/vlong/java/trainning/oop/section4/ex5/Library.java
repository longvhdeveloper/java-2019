package my.vlong.java.trainning.oop.section4.ex5;

import java.util.List;

public class Library {
    // reference to refer to list of books.
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getTotalBooksInLibrary() {

        return books;
    }
}
