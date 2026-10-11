public class Item {
    int number;
    String name;
    int quantity;

    void setInfo(int pNumber, String pName, int pQuantity) {
        number = pNumber;
        name = pName;
        quantity = pQuantity;
    }

    void printInfo() {
        System.out.println(
                "번호: " + number
                + " | 이름: " + name
                + " | 수량: " + quantity
        );
    }

}
