// 실행용 메인 클래스
public class BankTest {
    public static void main(String[] args) {
        // 1. 정상적으로 10,000원 입금 및 계좌 개통
        System.out.println("--- 1번 계좌 개통 시도 ---");
        BankAccount myAccount = new BankAccount("이코딩", 10000);
        myAccount.printAccountInfo();

        // 2. 비정상 -500,000원 개통
        System.out.println();
        System.out.println("--- 2번 계좌 개통 시도 (이상한 금액 입력) ---");
        BankAccount badAccount = new BankAccount("이해커", -500000);

    }
}
