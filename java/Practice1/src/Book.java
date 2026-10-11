public class Book {
    String title;
    int price;

    void setInfo(String pTitle, int pPrice) {
        title = pTitle;
        price = pPrice;
    }
    void printInfo() {
        System.out.println("Title: " + title + " Price: " + price);
    }

}
