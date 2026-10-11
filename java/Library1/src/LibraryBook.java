public class LibraryBook {
    int number;
    String title;
    String author;
    boolean borrowed;


    void setInfo(int pNumber, String pTitle, String pAuthor) {
        number = pNumber;
        title = pTitle;
        author = pAuthor;
    }

    void printInfo() {
        String status;

        if (borrowed) {
            status = "대출 중";
        } else {
            status = "대출 가능";
        }
        System.out.println(
                "번호: " + number
                + " | 제목 : " + title
                + " | 저자 : " + author
                + " | 상태 : " + status
        );
    }

}
