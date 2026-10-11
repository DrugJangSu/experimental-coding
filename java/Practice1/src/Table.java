import java.util.ArrayList;

public class Table {

    ArrayList<Order> orders = new ArrayList<>();

    void addOrder(Order order) {
        orders.add(order);
    }

    void printAll() {
        for (int i = 0; i < orders.size(); i++) {
            orders.get(i).printInfo();
        }
    }

    int count() {
        int count = 0;
        for (int i = 0; i < orders.size(); i++) {
            orders.get(i);
            count++;
        }
        return count;
    }

    int total() {
        int total = 0;
        for (int i = 0; i < orders.size(); i++) {
            total += orders.get(i).price;
        }
        return total;
    }

}
