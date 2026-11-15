package di.practice;

public class CashPaymentService implements PaymentService {

    @Override
    public void pay(int amount) {
        System.out.println("현금으로 " + amount + "원 결제했습니다.");
    }
}
