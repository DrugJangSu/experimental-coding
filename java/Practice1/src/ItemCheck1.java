public class ItemCheck1 {
    public static void main(String[] args) {

        Item1 item1 = new Item1();
        item1.name = "americano";
        item1.price = 4500;

        Item1 item2 = new Item1();
        item2.name = "water";
        item2.price = 1000;
        item1.print();
        item2.print();

    }

}
