package di.practice; // PaymentService, OrderService와 같은 패키지

// Card와 마찬가지로 PaymentService를 구현한 또 다른 결제 방식.
// 두 클래스는 pay()라는 "같은 이름의 기능"을 "다른 방식"으로 구현한다. (다형성)
// 새 결제수단은 이렇게 클래스를 "추가"만 하면 된다 -> 기존 코드 수정 없음 -> OCP 만족
public class CashPaymentService implements PaymentService {

    @Override // interface의 pay()를 우리 방식으로 다시 작성한다는 표시
    public void pay(int amount) {
        // 현금 방식의 결제 동작. 위 Card와 출력 문구만 다르다.
        System.out.println("현금으로 " + amount + "원 결제했습니다.");
    }
}
