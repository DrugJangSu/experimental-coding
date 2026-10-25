/*
 * [Ct77] 약수의 합 (9단계 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * n의 약수를 모두 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ n ≤ 3,000
 *
 * 입출력 예
 * n     result
 * 12    28       (1 + 2 + 3 + 4 + 6 + 12)
 * 1     1
 * 5     6        (1 + 5)
 * 6     12       (1 + 2 + 3 + 6)
 */
public class Ct77DivisorSum {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1부터 n까지 하나씩 보면서, 약수이면 answer에 더하기
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct77DivisorSum q = new Ct77DivisorSum();
        System.out.println("테스트1 결과: " + q.solution(12) + " / 정답: 28");
        System.out.println("테스트2 결과: " + q.solution(1) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(5) + " / 정답: 6");
        System.out.println("테스트4 결과: " + q.solution(6) + " / 정답: 12");
    }
}