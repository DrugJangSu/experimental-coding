public class ShelfCheck {
    public static void main(String[] args) {
    Shelf shelf = new Shelf();
    Book book1 = new Book();
    book1.title = "java";
    book1.price = 20000;
    Book book2 = new Book();
    book2.title = "sql";
    book2.price = 15000;
    Book book3 = new Book();
    book3.title = "git";
    book3.price = 12000;

    shelf.addBook(book1);
    shelf.addBook(book2);
    shelf.addBook(book3);

    shelf.printAll();
    }
}
