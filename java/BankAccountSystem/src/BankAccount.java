public class BankAccount {
    private final String ownerName;
    private int balance;


    public BankAccount(String ownerName, int balance) {
        this.ownerName = ownerName;
        setBalance(balance);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("경고! 잔고는 0원 미만일 수 없습니다. 0원으로 초기화합니다.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void printAccountInfo() {
        System.out.println("[" + ownerName + "님의 통장] 현재 잔고 : " + balance + "원");
    }
}
