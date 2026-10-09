public class ItemCheck2 {
    public static void main(String[] args) {
        Item1 item1 = new Item1();
        item1.name = "americano";
        item1.price = 4500;

        Item1 item2 = new Item1();
        item2.name = "water";
        item2.price = 1000;

        System.out.println(item1.lineTotal(2));
        System.out.println(item2.lineTotal(3));
        System.out.println("total=" + (item1.lineTotal(2) + item2.lineTotal(3)));
    }
}
