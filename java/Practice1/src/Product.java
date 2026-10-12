public class Product {
    int no;
    String name;
    String category;
    int price;

    void setInfo(int pNo, String pName, String pCategory, int pPrice) {
        no = pNo;
        name = pName;
        category = pCategory;
        price = pPrice;
    }

    void printInfo() {
        System.out.println("No:" + no + " Name:" + name + " Category:" + category + " Price:" + price);
    }
}
