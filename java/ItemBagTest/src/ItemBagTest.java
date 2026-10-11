public class ItemBagTest {
    public static void main(String[] args) {
        ItemBag bag = new ItemBag();

        Item item1 = new Item();
        item1.setInfo(1, "회복 물약", 5);
        Item item2 = new Item();
        item2.setInfo(2, "마나 물약", 3);
        Item item3 = new Item();
        item3.setInfo(3, "귀환 주문서", 1);

        System.out.println("=== 아이템 등록 ===");
        bag.addItem(item1);
        bag.addItem(item2);
        bag.addItem(item3);


        System.out.println("\n=== 전체 아이템 ===");
        bag.printAll();

        System.out.println("\n=== 개별 아이템 조회 ===");
        bag.printOne(2);
        bag.printOne(9);

        System.out.println("\n=== 수량 수정 ===");
        bag.updateQuantity(2, 10);
        bag.updateQuantity(1, -3);
        bag.updateQuantity(9, 5);

        System.out.println("\n=== 중복 등록 시도 ===");
        bag.addItem(item1);

        System.out.println("\n=== 아이템 삭제 ===");
        bag.deleteItem(3);
        bag.deleteItem(9);

        System.out.println("\n=== 최종 가방 ====");
        bag.printAll();

    }
}
