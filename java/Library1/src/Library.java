import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    ArrayList<LibraryBook> list = new ArrayList<>();
    HashMap<Integer, LibraryBook> map = new HashMap<>();

    void addBook(LibraryBook book) {
        if (map.containsKey(book.number)) {
            System.out.println("이미 등록된 책 번호에요.");
        } else {
            list.add(book);
            map.put(book.number, book);

            System.out.println(book.title + " 등록 완료!");
        }
    }

    void printAll() {
        if (list.isEmpty()) {
            System.out.println("등록된 책이 없어요.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                LibraryBook book = list.get(i);
                book.printInfo();
            }
        }
    }

    void printOne(int number) {
        if (map.containsKey(number)) {
            LibraryBook book = map.get(number);
            book.printInfo();
        } else {
            System.out.println("해당 번호의 책이 없어요.");
        }
    }

    void borrowBook(int number) {
        if (!map.containsKey(number)) {
            System.out.println("해당 번호의 책이 없어요.");
        } else {
            LibraryBook book = map.get(number);

            if (book.borrowed) {
                System.out.println("이미 대출 중인 책이에요.");
            } else {
                book.borrowed = true;
                System.out.println(book.title + " 대출 완료!");
            }
        }
    }

    void returnBook(int number) {
        if (!map.containsKey(number)) {
            System.out.println("해당 번호의 책이 없어요.");
        } else {
            LibraryBook book = map.get(number);
            if (!book.borrowed) {
                System.out.println("대출 중인 책이 아니에요.");
            } else {
                book.borrowed = false;
                System.out.println(book.title + " 반납 완료!");
            }
        }
    }
    int getAvailableCount() {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            LibraryBook book = list.get(i);

            if (!book.borrowed) {
                count++;
            }
        }
        return count;
    }
}

