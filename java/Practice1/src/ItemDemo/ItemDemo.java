package ItemDemo;

import java.util.ArrayList;

class Item {
    String name;
    int price;

    void print() {
        System.out.println(name + " " + price + "원");
    }
}

class EventItem extends Item {
    @Override
    void print() {
        System.out.println("[행사] " + name + " " + price + "원");
    }
}

public class ItemDemo {
    public static void main(String[] args) {
//        Item cola = new Item();
//        cola.name = "콜라";
//        cola.price = 2000;
//
//        EventItem kimbap = new EventItem();
//        kimbap.name = "삼각김밥";
//        kimbap.price = 1500;
//
//        ArrayList<Item> items = new ArrayList<>();
//        items.add(cola);
//        items.add(kimbap);
//
//        for (int i = 0; i < items.size(); i++) {
//            items.get(i).print();
//        }
        Item kimbap = new EventItem();     // ← 이 한 줄이 04의 전부
        kimbap.name = "삼각김밥";
        kimbap.price = 1500;
        kimbap.print();
    }
}