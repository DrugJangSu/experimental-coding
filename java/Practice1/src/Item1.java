public class Item1 {
    String name;
    Integer price;

    public void print() {
        System.out.println(name + "=" + price);
    }

    public void lineTotal(int qty) {
        System.out.println(qty * price);
    }

    public int lineTotal(int price, int qty) {
        return price * qty;
    }

}
