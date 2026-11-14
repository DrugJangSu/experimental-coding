import java.util.Arrays;

/*
 * [Ct152] 주식가격 (LMS 2부 05 · 프로그래머스 Lv.2)
 *
 * 문제
 * 초 단위로 기록된 주식가격 prices가 주어집니다.
 * 각 시점마다 "가격이 떨어지지 않은 기간이 몇 초인지" 구해
 * 같은 길이의 배열로 return 하도록 solution 메서드를 완성하세요.
 * (떨어지는 그 1초도 버틴 시간으로 칩니다.)
 *
 * 입출력 예
 * prices             result
 * [1, 2, 3, 2, 3]    [4, 3, 1, 1, 0]
 * [3, 1]             [1, 0]
 * [1, 1, 1]          [2, 1, 0]
 * [5]                [0]
 */
public class Ct152StockPrice {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < prices.length; i++) {              // 기준 시점
            for (int j = i + 1; j < prices.length; j++) {      // 그 뒤로 1초씩
                answer[i]++;                                   // 1초 버팀
                if (prices[j] < prices[i]) {                              // 기준 가격보다 떨어졌으면
                    break;                                     // 거기서 멈춤
                }
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct152StockPrice q = new Ct152StockPrice();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3, 2, 3})) + " / 정답: [4, 3, 1, 1, 0]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{3, 1})) + " / 정답: [1, 0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{1, 1, 1})) + " / 정답: [2, 1, 0]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{5})) + " / 정답: [0]");
    }
}