import java.util.ArrayList; // 여러 개를 담는 목록(ArrayList)을 쓰기 위해 가져옴

// 상품의 설계도(클래스)
class Item {
    String name; // 상품 이름을 저장하는 변수
    int price;   // 상품 가격을 저장하는 변수

    // 상품 정보를 화면에 출력하는 기능(메서드)
    void print() {
        // 이름과 가격을 이어 붙여서 출력
        System.out.println(name + " " + price + "원");
    }
}

// Item을 물려받는(상속) 행사 상품 클래스 → name, price, print()를 그대로 가짐
class EventItem extends Item {
    int discount;     // 행사 상품에만 있는 칸

    @Override // 부모(Item)의 print()를 내 방식으로 다시 만든다는 표시
    void print() {
        // 앞에 [행사]를 붙여서 출력
        System.out.println("[행사] " + name + " " + price + "원");
    }
}

// 프로그램을 실행하는 클래스
public class ItemDemo2 {
    // 프로그램이 시작되는 곳
    public static void main(String[] args) {
        Item cola = new Item(); // 일반 상품 객체 생성
        cola.name = "콜라";      // 이름 저장
        cola.price = 2000;      // 가격 저장

        EventItem kimbap = new EventItem(); // 행사 상품 객체 생성
        kimbap.name = "삼각김밥";            // 이름 저장
        kimbap.price = 1500;                // 가격 저장
        kimbap.discount = 300;              // 할인 금액 저장

        // Item을 담는 목록 만들기 (EventItem도 Item의 자식이라 담을 수 있음)
        ArrayList<Item> items = new ArrayList<>();
        items.add(cola);   // 목록에 콜라 추가
        items.add(kimbap); // 목록에 삼각김밥 추가

        // 목록의 처음부터 끝까지 한 개씩 반복
        for (int i = 0; i < items.size(); i++) {
            Item it = items.get(i); // i번째 상품 꺼내기
            it.print();             // 출력 (실제 객체 종류에 맞는 print()가 실행됨)

            // 꺼낸 상품이 행사 상품(EventItem)인지 확인
            if (it instanceof EventItem) {
                EventItem e = (EventItem) it; // 행사 상품으로 형변환해야 discount를 쓸 수 있음
                System.out.println("   할인: " + e.discount + "원"); // 할인 금액 출력
            }
        }
    }
}
