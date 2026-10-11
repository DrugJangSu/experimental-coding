public class Order {
    String menu;
    int price;

    void setInfo(String pMenu, int pPrice) {
        menu = pMenu;
        price = pPrice;
    }


    void printInfo() {
        System.out.println(menu + " " + price);
    }
}
