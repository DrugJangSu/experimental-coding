public class CafeOrder {
    int number;
    String menu;
    int price;
    int quantity;

    void setInfo(int pNumber, String pMenu, int pPrice, int pQuantity) {
        number = pNumber;
        menu = pMenu;
        price = pPrice;
        quantity = pQuantity;
    }

    int getTotalPrice() {
        return price * quantity;
    }

    void printInfo() {
        System.out.println(
                "주문번호: " + number
                        + " | 메뉴 :" + menu
                        + " | 단가 :" + price + "원"
                        + " | 수량 :" + quantity
                        + " | 금액 :" + getTotalPrice() + "원"
        );
    }

}
