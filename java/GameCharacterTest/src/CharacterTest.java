// 실제로 프로그램을 실행시키는 메인 클래스
public class CharacterTest {
    public static void main(String[] args) {
        // 생성자(constructor)를 활용해 캐릭터 객체 생성
        GameCharacter myChar = new GameCharacter("초보전사", 1, 100);

        System.out.println("=== 게임 시작 ===");
        myChar.showInfo();

        // setter 사용
        System.out.println("\n몬스터에게 공격받아 HP가 30 깎였다!");
        myChar.setHp(70);

        // getter 사용
        System.out.println("현재 남은 체력 확인: " + myChar.getHp());

        myChar.showInfo();


        myChar.setHp(-50); // 이상한 값을 집어넣어도 Setter 내부 if 로직으로 오류X
        myChar.showInfo();
    }
}
