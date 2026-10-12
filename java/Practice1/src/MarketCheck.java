public class MarketCheck {
    public static void main(String[] args) {
        Market market = new Market();
        Product product1 = new Product();
        product1.setInfo(1, "milk", "drink", 1500);
        Product product2 = new Product();
        product2.setInfo(2, "bread", "food", 3000);
        Product product3 = new Product();
        product3.setInfo(3, "juice", "drink", 2000);

        market.addProduct(product1);
        market.addProduct(product2);
        market.addProduct(product3);


//        Market market = new Market();
//// 상품 3개 만들고 setInfo → addProduct (직접 작성)
//
        market.printAll();
        System.out.println("---");
        market.printOne(3);
        market.printOne(7);
        System.out.println("---");
        market.updatePrice(1, 1800);
        market.updatePrice(1, -500);
        market.updatePrice(9, 1000);
        System.out.println("---");
        market.deleteProduct(2);
        market.deleteProduct(9);
        System.out.println("---");
        market.printByCategory("drink");
        market.printByCategory("food");
        System.out.println("---");
        market.printAll();

    }
}
