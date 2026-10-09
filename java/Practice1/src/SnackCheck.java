public class SnackCheck {
    public static void main(String[] args) {
    Snack snack1 = new Snack();
    snack1.name = "chips";
    snack1.price = 1500;
    snack1.stock = 10;


    Snack snack2 = new Snack();
    snack2.name = "cola";
    snack2.price = 2000;
    snack2.stock = 5;

    int order1 = snack1.stockValue();
    int order2 = snack2.stockValue();
    System.out.println("chips=" + order1);
    System.out.println("cola=" + order2);
    int total = order1 + order2;
    System.out.println("total=" + total);
    System.out.println("change=" + (change(30000, total)));


    }
    public static int change(int payment, int total) {
        return payment - total;
    }
}
