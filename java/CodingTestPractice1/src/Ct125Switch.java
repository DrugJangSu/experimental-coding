/*
 * [Ct125] 가위바위보 번호 (LMS 1단계 · 하)
 *
 * 문제
 * 정수 n이 주어집니다.
 * n이 1이면 "가위", 2면 "바위", 3이면 "보", 그 외에는 "잘못된 입력"을
 * return 하도록 solution 메서드를 완성하세요.
 * 단, if문 대신 switch문을 쓰세요.
 *
 * 입출력 예
 * n     result
 * 1     "가위"
 * 2     "바위"
 * 3     "보"
 * 5     "잘못된 입력"
 */
public class Ct125Switch {

    public String solution(int n) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        switch (n) {
            case 1:
                answer = "가위";
                break;
            case 2:
                answer = "바위";
                break;
            case 3:
                answer = "보";
                break;
            default:
                answer = "잘못된 입력";
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct125Switch q = new Ct125Switch();
        System.out.println("테스트1 결과: " + q.solution(1) + " / 정답: 가위");
        System.out.println("테스트2 결과: " + q.solution(2) + " / 정답: 바위");
        System.out.println("테스트3 결과: " + q.solution(3) + " / 정답: 보");
        System.out.println("테스트4 결과: " + q.solution(5) + " / 정답: 잘못된 입력");
    }
}