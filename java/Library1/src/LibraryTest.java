public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        LibraryBook book1 = new LibraryBook();
        book1.setInfo(1, "자바 첫걸음", "김자바");

        LibraryBook book2 = new LibraryBook();
        book2.setInfo(2, "파이썬 여행", "이파이");

        LibraryBook book3 = new LibraryBook();
        book3.setInfo(3, "코딩하는 고양이", "박냥이");

        System.out.println("=== 책 등록 ===");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\n=== 전체 책 목록 ===");
        library.printAll();

        System.out.println("\n=== 책 대출 ===");
        library.borrowBook(2);
        library.borrowBook(2);
        library.borrowBook(9);

        System.out.println("\n=== 대출 후 조회 ===");
        library.printOne(2);

        System.out.println("\n=== 대출 가능한 책 수 ===");
        int available = library.getAvailableCount();
        System.out.println(available + "권");

        System.out.println("\n=== 책 반납 ===");
        library.returnBook(2);
        library.returnBook(2);

        System.out.println("\n=== 최종 책 목록 ===");
        library.printAll();

        System.out.println("\n=== 대출 가능한 책 수 ===");
        System.out.println(library.getAvailableCount() + "권");
    }
}