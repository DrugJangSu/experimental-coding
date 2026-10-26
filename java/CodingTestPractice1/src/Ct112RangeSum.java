/*
 * [Ct112] a부터 b까지의 합 (복습 · 하)
 *
 * 문제
 * 정수 a와 b가 주어집니다. (a ≤ b)
 * a부터 b까지의 모든 정수를 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * a     b     result
 * 1     3     6       (1 + 2 + 3)
 * 5     5     5
 * 2     4     9       (2 + 3 + 4)
 * -1    1     0       (-1 + 0 + 1)
 */
public class Ct112RangeSum {

    public int solution(int a, int b) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct112RangeSum q = new Ct112RangeSum();
        System.out.println("테스트1 결과: " + q.solution(1, 3) + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution(5, 5) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(2, 4) + " / 정답: 9");
        System.out.println("테스트4 결과: " + q.solution(-1, 1) + " / 정답: 0");
    }
}