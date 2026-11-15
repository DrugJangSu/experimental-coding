package di.practice;

public class Main {
    public static void main(String[] args) {
//        PaymentService paymentService = new CardPaymentService();
        PaymentService paymentService = new CashPaymentService();

        OrderService orderService = new OrderService(paymentService);

        orderService.order(10000);
    }
}
