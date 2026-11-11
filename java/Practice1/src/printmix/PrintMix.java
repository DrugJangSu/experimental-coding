package printmix; // 이 파일이 속한 폴더(패키지) 이름. 파일 위치(printmix 폴더)와 맞아야 함
import java.util.ArrayList; // 크기가 자유롭게 늘어나는 배열(ArrayList)을 사용하기 위해 가져옴(import)

// 인터페이스: "이 기능을 가진 클래스는 반드시 이 메서드를 만들어야 한다"는 약속(설계도)
interface Printable {
    void print(); // 몸체({}) 없이 이름만 선언. 실제 내용은 구현하는 클래스가 채움
}

// Printable 약속을 지키겠다(implements)고 선언한 클래스
class Post implements Printable {
    String title; // 글 제목을 저장하는 변수 (필드)

    @Override // 인터페이스의 메서드를 다시 정의(구현)한다는 표시
    public void print() { // Printable이 요구한 print()를 실제로 구현
        System.out.println("title=" + title); // "title=제목" 형태로 한 줄 출력
    }
}

class LunchSlip implements Printable {     // Post와 아무 관계 없음 (하지만 같은 Printable 약속은 지킴)
    @Override // 인터페이스의 메서드를 구현한다는 표시
    public void print() { // LunchSlip만의 방식으로 print()를 구현
        System.out.println("pork=6000"); // 돼지고기 가격 출력
        System.out.println("rice=1000"); // 밥 가격 출력
    }
}

class LinePrinter { // 출력을 대신 실행해 주는 클래스
    void run(Printable target) { // Printable이면 무엇이든 받음 (Post든 LunchSlip이든 상관없음)
        target.print(); // 받은 객체의 print()를 호출 → 실제 객체에 맞는 출력이 실행됨
    }
}

public class PrintMix { // 프로그램의 시작 클래스 (파일 이름과 같아야 함)
    public static void main(String[] args) { // 자바 프로그램이 실행될 때 가장 먼저 호출되는 메서드
        Post post = new Post(); // Post 객체를 새로 만들어 post 변수에 담음
        post.title = "exam"; // post의 title 필드에 "exam" 저장

        LunchSlip slip = new LunchSlip(); // LunchSlip 객체를 새로 만들어 slip 변수에 담음

        // Printable 타입만 담을 수 있는 리스트 생성 (Post, LunchSlip 둘 다 Printable이라 담기 가능)
        ArrayList<Printable> lines = new ArrayList<>();
        lines.add(post); // 리스트에 post 추가
        lines.add(slip); // 리스트에 slip 추가 (서로 다른 클래스인데도 함께 담김!)

        for (int i = 0; i < lines.size(); i++) { // i를 0부터 (리스트 크기 - 1)까지 1씩 증가시키며 반복
            lines.get(i).print(); // i번째 객체를 꺼내 print() 호출 → 각 객체가 자기 방식대로 출력 (다형성)
        }
        LinePrinter printer = new LinePrinter(); // LinePrinter 객체를 만들어 printer 변수에 담음
        printer.run(post); // post를 넘겨 출력 → "title=exam"
        printer.run(slip); // slip을 넘겨 출력 → "pork=6000", "rice=1000"
    }
}
