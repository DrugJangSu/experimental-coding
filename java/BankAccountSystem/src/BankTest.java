public class BankTest {
    public static void main(String[] args) {
        System.out.println("--- 1번 계좌 개통 시도 ---");
        BankAccount myAccount = new BankAccount("이코딩", 10000);
        myAccount.printAccountInfo();

        System.out.println();
        System.out.println("--- 2번 계좌 개통 시도 (이상한 금액 입력) ---");
        BankAccount badAccount = new BankAccount("이해커", -500000);

    }
}
