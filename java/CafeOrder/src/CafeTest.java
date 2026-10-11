public class CafeTest {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        CafeOrder order1 =  new CafeOrder();
        order1.setInfo(1, "아메리카노", 3000, 2);
        CafeOrder order2 = new CafeOrder();
        order2.setInfo(2, "카페라떼", 4000, 1);
        CafeOrder order3 = new CafeOrder();
        order3.setInfo(3, "초코쿠키", 2000, 3);

        System.out.println("=== 주문 등록 ===");
        cafe.addOrder(order1);
        cafe.addOrder(order2);
        cafe.addOrder(order3);


        System.out.println("\n=== 전체 주문 ===");
        cafe.printAll();

        System.out.println("\n=== 개별 주문 조회");
        cafe.printOne(2);
        cafe.printOne(9);


        System.out.println("\n=== 전체 주문 금액 ===");
        int total = cafe.getTotalSales();
        System.out.println("합계: " + total + "원");

        System.out.println("\n=== 주문 취소 ===");
        cafe.cancelOrder(2);

        System.out.println("\n=== 취소 후 주문 목록 ===");
        cafe.printAll();

        System.out.println("\n=== 취소 후 주문 금액 ===");
        int remainingTotal = cafe.getTotalSales();
        System.out.println("합계: " + remainingTotal + "원");

    }
}
