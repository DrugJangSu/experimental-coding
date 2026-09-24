import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 생성
        Random random = new Random(); // Random 생성 (자바에서는 도구- 즉 객체를 사용하려면 새로 만들어서(new) 변수에 담아야 함)

        System.out.println("=== 가위바위보 게임 ===");
        System.out.println("가위, 바위, 보 중에서 하나를 입력하시오");

        String user = ""; // 사용자 입력을 넣을 변수. (while문 안에 값을 넣을 거라 빈 문자열로 만듦)

        while (true) { // 올바른 입력이 들어올 때까지 반복.
            user = scanner.nextLine(); // 사용자에게 입력을 받음
            if (user.equals("가위") || user.equals("바위") || user.equals("보")) {
                break; // 올바른 입력이면 반복을 끝냄.(break으로 탈출)
            } else {
                System.out.println("잘못 입력하였습니다. 가위 바위 보 중에서 다시 입력하세요."); // 잘못된 입력이면 안내 메시지 출력 및 반복
            }

        }

        String[] choices = {"가위", "바위", "보"}; // 배열(Array) -> String[]은 문자열을 여러개 담을 수 있는 상자이며, {} 안에 값을 넣으면 처음부터 값이 채워진 배열이 만들어짐

        String computer = choices[random.nextInt(3)]; // random.nextInt(3) -> 0, 1, 2 중 하나를 랜덤으로 뽑음
                                                            // choices[0] = "가위", choices[1] = "바위", choices[2] = "보"

        System.out.println("컴퓨터: " + computer);

        if (user.equals(computer)) { // 문자열 비교는 무조건 .equals(). 절대 == 사용 금물
            System.out.println("비겼습니다!");
        } else if (
                (user.equals("가위") && computer.equals("보")) ||
                (user.equals("바위") && computer.equals("가위")) ||
                (user.equals("보") && computer.equals("바위"))
        ) {
            System.out.println("이겼습니다!");
        } else {
            System.out.println("졌습니다!");
        }
        scanner.close();

    }
}