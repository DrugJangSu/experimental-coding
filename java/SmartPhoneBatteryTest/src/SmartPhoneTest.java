public class SmartPhoneTest {
    public static void main(String[] args) {
    SmartPhone myPhone = new SmartPhone("갤럭시 S26", 90);

    myPhone.printPhoneInfo();

    System.out.println("게임을 열심히 해서 배터리 30%까지 하락");
    myPhone.setBattery(30);
    myPhone.printPhoneInfo();

    System.out.println("과충전으로 999%까지 도달");
    myPhone.setBattery(999);
    myPhone.printPhoneInfo();


    }
}
