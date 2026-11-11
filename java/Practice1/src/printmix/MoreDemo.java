package printmix; // 이 파일이 속한 폴더(패키지) 이름. PrintMix.java와 같은 패키지라 Printable, LinePrinter를 import 없이 쓸 수 있음

// 인터페이스: "요일 이름을 돌려주는 기능"을 약속(설계도)으로 정의
interface Dated {
    String dayLabel(); // 몸체 없이 선언만. 문자열(String)을 반환하겠다는 약속
}

// 한 클래스가 인터페이스를 여러 개 구현할 수 있음 (Printable과 Dated 둘 다 지킴)
class StampSlip implements Printable, Dated {
    @Override // 인터페이스의 메서드를 구현한다는 표시
    public void print() { // Printable이 요구한 print() 구현
        System.out.println("stamp=ok"); // "stamp=ok" 한 줄 출력
    }

    @Override // 인터페이스의 메서드를 구현한다는 표시
    public String dayLabel() { // Dated가 요구한 dayLabel() 구현
        return "friday"; // 호출한 곳에 "friday" 문자열을 돌려줌
    }
}

// 추상 클래스: 직접 객체를 만들 수 없고, 자식 클래스가 상속받아 완성해야 하는 "미완성 부모 클래스"
abstract class CafeItem {
    abstract int price(); // 추상 메서드: 몸체가 없음. 가격 계산 방식은 자식이 각자 정함

    void printWon() { // 일반 메서드: 모든 자식이 공통으로 물려받아 사용
        System.out.println("won=" + price()); // 자식이 구현한 price()를 호출해서 "won=가격" 출력
    }
}

class KimbapItem extends CafeItem { // CafeItem을 상속(extends)한 자식 클래스
    @Override // 부모의 추상 메서드를 구현한다는 표시
    int price() { // 김밥의 가격을 정의
        return 4500; // 김밥 가격 4500원 반환
    }
}

class WaterItem extends CafeItem { // CafeItem을 상속한 또 다른 자식 클래스
    @Override // 부모의 추상 메서드를 구현한다는 표시
    int price() { // 물의 가격을 정의
        return 1000; // 물 가격 1000원 반환
    }
}

class SavedPrinter { // Printable 객체를 "저장해 두었다가" 나중에 출력하는 클래스
    private final Printable target; // 저장할 객체. private=외부 접근 불가, final=한 번 정하면 바꿀 수 없음

    SavedPrinter(Printable target) { // 생성자: 객체를 만들 때 가장 먼저 실행됨
        this.target = target; // 매개변수 target을 이 객체의 필드 target에 저장 (this = 자기 자신)
    }

    void run() { // 저장해 둔 객체로 출력 실행
        target.print(); // 저장된 객체의 print() 호출 (실제 타입에 맞는 출력이 나옴)
    }
}

public class MoreDemo { // 프로그램의 시작 클래스 (파일 이름과 같아야 함)
    public static void main(String[] args) { // 프로그램 실행 시 가장 먼저 호출되는 메서드
        StampSlip stamp = new StampSlip(); // StampSlip 객체를 만들어 stamp 변수에 담음
        LinePrinter printer = new LinePrinter(); // PrintMix.java에 있는 LinePrinter 객체 생성
        printer.run(stamp); // stamp는 Printable이므로 전달 가능 → "stamp=ok" 출력
        Dated d = stamp; // 같은 객체를 Dated 타입 변수에 담음 (이 변수로는 dayLabel()만 보임)
        System.out.println(d.dayLabel()); // "friday" 출력

        CafeItem a = new KimbapItem(); // 부모 타입 변수에 자식(김밥) 객체를 담음 (다형성)
        CafeItem b = new WaterItem(); // 부모 타입 변수에 자식(물) 객체를 담음
        a.printWon(); // 김밥의 price()가 쓰여서 "won=4500" 출력
        b.printWon(); // 물의 price()가 쓰여서 "won=1000" 출력

        SavedPrinter saved = new SavedPrinter(stamp); // stamp를 저장한 SavedPrinter 객체 생성
        saved.run(); // 저장해 둔 stamp의 print()가 실행되어 "stamp=ok" 출력
    }
}
