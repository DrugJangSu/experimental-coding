import java.util.ArrayList;
import java.util.HashMap;

public class Cafe {
    ArrayList<CafeOrder> list = new ArrayList<>();
    HashMap<Integer, CafeOrder> map = new HashMap<>();

    void addOrder(CafeOrder order) {
        if (map.containsKey(order.number)) {
            System.out.println("이미 등록된 주문번호에요.");
        } else if (order.price < 0 || order.quantity <= 0) {
            System.out.println("가격은 0 이상, 수량은 1 이상이어야 합니다.");
        } else {
            list.add(order);
            map.put(order.number, order);

            System.out.println(order.menu + "주문 등록!");
        }
    }

    void printAll() {
        if (list.isEmpty()) {
            System.out.println("등록된 주문이 없어요.");
        } else {
            for (int i=0; i<list.size(); i++) {
                CafeOrder order = list.get(i);
                order.printInfo();
            }
        }
    }


    void printOne(int number) {
        if (map.containsKey(number)) {
            CafeOrder order = map.get(number);
            order.printInfo();
        } else {
            System.out.println("해당 주문이 없어요.");
        }
    }

    void cancelOrder(int number) {
        if (map.containsKey(number)) {
            CafeOrder order = map.get(number);

            map.remove(number);
            list.remove(order);
            System.out.println(order.menu + " 주문 취소!");
        } else {
            System.out.println("해당 주문이 없어요.");
        }
    }

    int getTotalSales() {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            CafeOrder order = list.get(i);
            total += order.getTotalPrice();
        }
        return total;
    }

}
