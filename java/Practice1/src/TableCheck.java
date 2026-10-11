public class TableCheck {
    public static void main(String[] args) {
        Table table1 = new Table();
        Table table2 = new Table();
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();

        order1.setInfo("pasta", 12000);
        order2.setInfo("coke", 2000);
        order3.setInfo("pizza", 15000);

        table1.addOrder(order1);
        table1.addOrder(order2);
        table2.addOrder(order3);

        System.out.println("[T1]");
        table1.printAll();
        System.out.println("count1=" + table1.count());
        System.out.println("total1=" + table1.total());
        System.out.println("[T2]");
        table2.printAll();
        System.out.println("count2=" + table2.count());
        System.out.println("total2=" + table2.total());
    }


}
