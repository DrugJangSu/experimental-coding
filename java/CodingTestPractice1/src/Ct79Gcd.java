/*
 * [Ct79] 최대공약수 (9단계 · 하)
 *
 * 문제
 * 자연수 a와 b가 주어집니다.
 * a와 b의 최대공약수(둘 다 나누어떨어지는 수 중 가장 큰 수)를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ a, b ≤ 1,000
 *
 * 입출력 예
 * a     b     result
 * 12    18    6
 * 7     3     1
 * 10    5     5
 * 8     8     8
 */
public class Ct79Gcd {

    public int solution(int a, int b) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1부터 a까지 i를 하나씩 보면서
        //    a도 나누어떨어지고 b도 나누어떨어지면 → answer에 i 덮어쓰기
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct79Gcd q = new Ct79Gcd();
        System.out.println("테스트1 결과: " + q.solution(12, 18) + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution(7, 3) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(10, 5) + " / 정답: 5");
        System.out.println("테스트4 결과: " + q.solution(8, 8) + " / 정답: 8");
    }
}