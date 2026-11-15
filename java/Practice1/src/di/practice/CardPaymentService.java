package di.practice;

public class CardPaymentService implements PaymentService{

    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제했습니다.");
    }
}
