package di.practice;

public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void order(int amount) {
        System.out.println("주문을 처리합니다.");

        this.paymentService.pay(amount);
    }



}
