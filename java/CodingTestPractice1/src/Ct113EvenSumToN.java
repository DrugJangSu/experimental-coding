/*
 * [Ct113] 1부터 n까지 짝수의 합 (복습 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * 1부터 n까지의 수 중 짝수만 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * n     result
 * 4     6       (2 + 4)
 * 1     0
 * 10    30      (2 + 4 + 6 + 8 + 10)
 * 2     2
 */
public class Ct113EvenSumToN {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct113EvenSumToN q = new Ct113EvenSumToN();
        System.out.println("테스트1 결과: " + q.solution(4) + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution(1) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(10) + " / 정답: 30");
        System.out.println("테스트4 결과: " + q.solution(2) + " / 정답: 2");
    }
}