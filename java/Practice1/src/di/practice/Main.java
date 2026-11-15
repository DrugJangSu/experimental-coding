package di.practice; // 같은 패키지

// 프로그램 시작점. 여기서 "어떤 객체를 어디에 끼울지" 조립하는 역할을 한다.
// 이렇게 직접 조립하는 방식이 "수동 DI". Spring에서는 이 조립을 스프링 컨테이너(IoC 컨테이너)가 대신 해준다.
// (IoC = 제어의 역전: 객체 생성/연결의 제어권이 개발자 코드에서 프레임워크로 넘어간다는 뜻)
public class Main {
    // main: 자바 프로그램이 실행될 때 가장 먼저 호출되는 메서드
    public static void main(String[] args) {
        // 카드로 바꾸고 싶으면 아래 주석을 풀고 그 아래 Cash 줄을 주석 처리하면 된다.
        // OrderService는 한 줄도 안 고치고 결제수단만 교체된다 -> OCP + DI의 장점
//        PaymentService paymentService = new CardPaymentService();
        // 왼쪽 타입은 interface, 오른쪽은 실제 구현체(현금). 부모 타입 변수에 자식 객체를 담을 수 있다.
        PaymentService paymentService = new CashPaymentService();

        // 만든 결제수단을 OrderService 생성자에 넣어준다. = 의존성 "주입"이 일어나는 순간
        // (Spring이라면 @Autowired 또는 생성자 자동 주입이 이 일을 한다)
        OrderService orderService = new OrderService(paymentService);

        // 10000원 주문 실행 -> "주문을 처리합니다." 출력 후 -> 선택한 결제수단의 pay()가 실행된다.
        orderService.order(10000);
    }
}
