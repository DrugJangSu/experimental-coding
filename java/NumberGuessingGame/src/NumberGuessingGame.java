import java.util.Random; // 랜덤 숫자를 만들어주는 도구
import java.util.Scanner; // 키보드로 입력을 받는 도구

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(100) + 1;
        int guess = 0;
        int count = 0;

        System.out.println("=== 숫자 맞추기 게임 ===");
        System.out.println("1부터 100 사이의 숫자를 맞춰보세요");

        while (guess != answer) {
            System.out.println("숫자를 입력하세요: ");
            guess = scanner.nextInt(); // "사용자가 입력한 숫자를 읽어와서 guess에 넣어라" & "nextInt()는 정수(숫자)를 읽어온다는 뜻." vs 문자열을 읽고 싶으면 nextLine()을 씀.
            count++;

            if (guess < answer) {
                System.out.println("더 큰 숫자입니다!");
            } else if (guess > answer) {
                System.out.println("더 작은 숫자입니다!");
            } else {
                System.out.println("정답입니다! " + count + "번 만에 맞췄어요!");
            }
        }
        scanner.close(); // 스캐너를 다 쓰고 나서 닫는다는 뜻. 보통은 프로그램이 바로 끝나는 간단한 경우에는 없어도 무방하나, 오류 방지를 위해 만들어주는 습관을 가지는 게 좋음


    }


}