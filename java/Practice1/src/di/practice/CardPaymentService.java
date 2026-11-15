package di.practice; // 같은 패키지 안의 PaymentService를 import 없이 바로 쓸 수 있다

// implements = "PaymentService의 약속을 지키겠다"는 선언. 그래서 pay()를 반드시 만들어야 한다.
// 이 클래스는 PaymentService를 확장(구현)한 것 중 하나일 뿐, OrderService는 이 클래스의 존재를 모른다. (OCP)
// 나중에 Spring에서는 클래스 위에 @Service(또는 @Component)를 붙여 "스프링이 객체를 대신 만들어 관리해줘"라고 표시한다.
public class CardPaymentService implements PaymentService{

    // @Override = 부모(interface)의 메서드를 재정의했다는 표시. 이름/매개변수가 틀리면 컴파일러가 오류로 알려준다.
    @Override
    public void pay(int amount) {
        // 카드 방식의 실제 결제 동작. (현실에서는 카드사 연동 코드가 들어갈 자리)
        System.out.println("카드로 " + amount + "원 결제했습니다.");
    }
}
5
