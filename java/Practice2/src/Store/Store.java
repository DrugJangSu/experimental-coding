package Store;

public class Store {

    String name;
    String location;
    boolean isOpen;
    Item[] items = new Item[4];


    public static void main(String[] args) {
        Store store = new Store();
        store.name = "GS25";
        store.location = "서울시 강남구";
        store.isOpen = true;

        Item item1 = new Item();
        item1.name = "삼각김밥";
        item1.price = 1500;
        item1.stock = 10;
        item1.isEvent = true;
        store.items[0] = item1;

        Item item2 = new Item();
        item2.name = "콜라";
        item2.price = 2000;
        item2.stock = 5;
        item2.isEvent = false;
        store.items[1] = item2;

        Item item3 = new Item();
        item3.name = "라면";
        item3.price = 1200;
        item3.stock = 20;
        item3.isEvent = true;
        store.items[2] = item3;

        Item item4 = new Item();
        item4.name = "초코바";
        item4.price = 800;
        item4.stock = 0;
        item4.isEvent = false;
        store.items[3] = item4;

        System.out.println("===== 편의점 정보 =====");
        System.out.println("편의점명: " + store.name);
        System.out.println("위치: " + store.location);
        System.out.println("영업 중: " + store.isOpen);
        System.out.println("총 상품 수: " + store.items.length);
        System.out.println("----- 상품 목록 -----");
        for (int i = 0; i < store.items.length; i++) {
            System.out.println((i + 1) + ". " + store.items[i].name);
            System.out.println("   가격: " + store.items[i].price + "원");
            System.out.println("   재고: " + store.items[i].stock + "개");
            System.out.println("   행사: " + store.items[i].isEvent);
        }
    }
}
