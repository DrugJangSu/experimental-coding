import java.util.ArrayList;

public class Shelf {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void printAll() {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).printInfo();
        }
    }

}
