package di.practice; // 같은 패키지

// 주문을 처리하는 클래스. 결제는 직접 하지 않고 PaymentService에게 "맡긴다". (역할 분리)
// Spring에서는 보통 @Service를 붙이고, 필요한 객체는 스프링이 생성자로 넣어준다.
public class OrderService {

    // 필드의 타입이 구체 클래스(Card/Cash)가 아니라 interface(PaymentService)인 점이 핵심!
    // -> 어떤 결제수단이 오든 이 클래스는 수정할 필요가 없다. (OCP)
    // private: 클래스 밖에서 직접 못 바꾸게 막음 / final: 한 번 정해지면 바꿀 수 없음(안전)
    private final PaymentService paymentService;

    // 생성자: OrderService 객체를 만들 때 실행된다.
    // DI(의존성 주입, Dependency Injection): 필요한 객체(PaymentService)를 내가 new로 만들지 않고
    // "밖에서 넣어주는 것". 여기서는 생성자로 받으니 "생성자 주입"이라고 부른다. (스프링이 권장하는 방식)
    // 만약 안에서 new CardPaymentService()를 직접 쓰면 카드에 고정되어 버리고 수정 없이는 못 바꾼다.
    public OrderService(PaymentService paymentService) {
        // this.paymentService = 필드, 오른쪽 paymentService = 매개변수. 받은 걸 필드에 저장한다.
        this.paymentService = paymentService;
    }

    // 주문 기능: 금액을 받아 주문을 처리한다.
    public void order(int amount) {
        // 주문 처리 안내 출력 (실제로는 재고 확인, 주문 저장 등이 들어갈 자리)
        System.out.println("주문을 처리합니다.");

        // 결제는 PaymentService에게 위임. 실제로 카드인지 현금인지는 여기서 알 필요도, 알지도 못한다.
        // 호출 시점에 넣어진 객체의 pay()가 실행된다. (다형성)
        this.paymentService.pay(amount);
    }



}
