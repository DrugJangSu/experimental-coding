public class Item1 {
    String name;
    Integer price;

    public void print() {
        System.out.println(name + "=" + price);
    }


    public int lineTotal(int qty) {
        return price * qty;
    }

}
