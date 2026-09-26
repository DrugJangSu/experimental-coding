// 캐릭터라는 설계도(class) 생성
class GameCharacter {
    private String name; // private를 붙여서 외부에서 데이터 템퍼링 불가
    private int level;
    private int hp;

    // constructor(생성자) : 객체 생성 시 딱 한번 실행되며 초기값 설정.
    public GameCharacter(String name, int level, int hp) { // 클래스 이름과 정확히 같아야 하며 리턴 타입(void 등)이 없음
        this.name = name;
        this.level = level;
        this.hp = hp;
    }
    // Getter : private 데이터를 안전하게 가져오는(get) method
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    // Setter : private으로 숨겨둔 데이터를 안전하게 바꾸고 설정(set)하는 method
    public void setHp(int hp) {
        if (hp < 0) { // 레벨이 0 미만으로 넘어가지 않게 검증하는 로직
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public void showInfo() { // 캐릭터 정보를 출력해 주는 메서드
        System.out.println("[캐릭터 정보] 이름 : " + name + " | 레벨 : " + level + " | HP : " + hp);

    }


}
