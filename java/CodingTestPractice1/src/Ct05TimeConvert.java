import java.util.Arrays;

/*
 * [Ct05] 시간 변환 (1단계 · 상, 도전)
 *
 * 문제
 * 총 초 seconds가 주어질 때, 이를 분과 초로 바꿔
 * [분, 초] 형태의 int 배열로 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 0 ≤ seconds ≤ 3,599
 *
 * 입출력 예
 * seconds   result
 * 125       [2, 5]
 * 60        [1, 0]
 * 59        [0, 59]
 */
public class Ct05TimeConvert {

    public int[] solution(int seconds) {
        int[] answer = new int[2];
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int minutes = 0;
        int remainSeconds = 0;
        if (seconds >= 60) {
            minutes = seconds / 60;
            remainSeconds = seconds % 60;
        } else {
            minutes = 0;
            remainSeconds = seconds;
        }
        answer[0] = minutes;
        answer[1] = remainSeconds;
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct05TimeConvert q = new Ct05TimeConvert();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(125)) + " / 정답: [2, 5]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(60)) + " / 정답: [1, 0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(59)) + " / 정답: [0, 59]");
    }
}