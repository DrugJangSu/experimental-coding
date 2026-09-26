public class BankAccount {
    private final String ownerName; // 예금주 이름은 한번 적으면 변경X, Getter와 final 처리 완료 및 setter 필요 X
    private int balance;    // balance는 getter setter 둘다 기입

    // 첫 실행목적 생성자
    public BankAccount(String ownerName, int balance) {
        this.ownerName = ownerName;
        setBalance(balance);
    }

    // getter
    public String getOwnerName() {
        return ownerName;
    }

    // getter
    public int getBalance() {
        return balance;
    }

    // setter(잔고 세팅 및 방어로직 기입)
    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("경고! 잔고는 0원 미만일 수 없습니다. 0원으로 초기화합니다.");
            this.balance = 0; // 마이너스 방지 위해 0 미만 시 0원 디폴트
        } else {
            this.balance = balance; // 정상 범위면 그대로 세팅
        }
    }

    // 게좌정보 출력 메서드
    public void printAccountInfo() {
        System.out.println("[" + ownerName + "님의 통장] 현재 잔고 : " + balance + "원");
    }
}
