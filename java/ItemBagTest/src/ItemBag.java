import java.util.ArrayList;
import java.util.HashMap;

public class ItemBag {
    ArrayList<Item> list = new ArrayList<>();
    HashMap<Integer, Item> map = new HashMap<>();

    void addItem(Item item) {
        if (map.containsKey(item.number)) {
            System.out.println("이미 등록된 아이템 번호입니다.");
        } else if (item.quantity < 0) {
            System.out.println("수량은 0 이상이어야 합니다.");
        } else {
            list.add(item);
            map.put(item.number, item);

            System.out.println(item.name + " 등록 완료!");
        }
    }

    void printAll() {
        if (list.isEmpty()) {
            System.out.println("가방이 비어 있어요.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                Item item = list.get(i);
                item.printInfo();
            }
        }
    }

    void printOne(int number) {
        if (map.containsKey(number)) {
            Item item = map.get(number);
            item.printInfo();
        } else {
            System.out.println("해당 번호의 아이템이 없어요.");
        }
    }
    void updateQuantity(int number, int quantity) {
        if (quantity < 0) {
            System.out.println("수량은 0 이상이어야 합니다.");
        } else if (!map.containsKey(number)) {
            System.out.println("해당 번호의 아이템이 없어요.");
        } else {
            Item item = map.get(number);
            item.quantity = quantity;
            System.out.println(item.name + "수량 수정 완료!");
        }
    }
    void deleteItem(int number) {
        if (!map.containsKey(number)) {
            System.out.println("해당 번호의 아이템이 없어요.");
        } else {
            Item item = map.get(number);

            map.remove(number);
            list.remove(item);

            System.out.println(item.name + " 삭제 완료!");
        }
    }


}
