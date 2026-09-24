import java.util.Scanner;

public class MinlAccountBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0; // 잔액을 저장할 변수
        boolean isRunning = true; // 반복문을 제어할 변수

        System.out.println("=== 나만의 미니 가계부 ===");

        while (isRunning) {
            System.out.println("\n----------------------------------"); // 첫 줄 \n는 줄바꿈 문자로 예쁘게 프린트 목적으로 기입. 그 뒤로 println으로 알아서 다음줄 내려감.
            System.out.println("1. 예금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("------------------------------------");
            System.out.println("선택>");

            int menu = scanner.nextInt(); // 메뉴 번호 입력받기

            switch (menu) {
                case 1 :
                    System.out.println("예금할 금액을 입력하세요: ");
                    int deposit = scanner.nextInt();
                    if (deposit > 0) {
                        balance += deposit; // 복합 대입 연산자 (balance = balance + deposit)
                        System.out.println(deposit + "원이 예금되었습니다.");
                    } else {
                        System.out.println("금액은 0원보다 커야 합니다!");
                    }
                    break; // switch문의 case마다 break;은 필수

                case 2:
                    System.out.println("출금할 금액을 입력하세요: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw > balance) {
                        System.out.println("잔액이 부족합니다! (현재 잔액: " + balance + "원)");
                    } else if (withdraw <= 0) { // 0원 이하의 경우를 위한 예외처리
                        System.out.println("올바른 금액을 입력해주세요");
                    } else {
                        balance -= withdraw; // 정상적으로 잔액에서 차감 (balance = balance - withdraw)
                        System.out.println(withdraw + "원이 출금되었습니다.");
                    }
                    break;

                case 3:
                    System.out.println("현재 잔액은 " + balance + "원 입니다.");
                    break;

                case 4:
                    System.out.println("가계부 프로그램을 종료합니다. 감사합니다.");
                    isRunning = false; // while문 조건변수 false로 반복 탈출
                    break;
                default: // switch문의 맨 마지막에 위치함 -> break을 쓰지 않아도 자연스럽게 switch문 탈출 (안전상으로 써도 무방함)
                    System.out.println("올바른 번호를 선택해주세요 (1, 2, 3, 4)");
                    break;


            }
        }
        scanner.close();

    }
}
