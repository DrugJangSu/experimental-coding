package di.practice; // 이 파일이 속한 폴더(패키지) 이름. 관련된 클래스끼리 묶어두는 "폴더" 역할

// interface = "이런 기능이 있어야 한다"는 약속(설계도)만 적어둔 것. 실제 동작 코드는 없다.
// 왜 interface로 만들까?
//  1) 카드/현금/계좌이체... 결제 방법이 달라도 "pay(금액)"이라는 같은 약속으로 다룰 수 있다. (다형성)
//  2) 사용하는 쪽(OrderService)이 구체적인 클래스(Card, Cash)를 몰라도 되게 해준다. (결합도 낮추기)
//  3) 이것이 OCP(개방-폐쇄 원칙, Open-Closed Principle)의 핵심 도구다.
//     OCP = "확장에는 열려 있고(새 결제수단 추가 OK), 수정에는 닫혀 있어야 한다(기존 코드는 안 고친다)"
//     예) 카카오페이를 추가하고 싶으면 PaymentService를 구현한 클래스 하나만 새로 만들면 되고,
//         OrderService는 한 줄도 고치지 않는다.
public interface PaymentService {

    // 결제 기능의 약속. 몸통({ })이 없고 세미콜론(;)으로 끝나는 것이 interface 메서드의 특징.
    // 실제로 어떻게 결제할지는 이 interface를 implements 하는 클래스들이 각자 정한다.
    void pay(int amount);
}
