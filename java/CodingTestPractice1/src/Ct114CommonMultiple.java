/*
 * [Ct114] 두 수의 공배수 개수 (복습 · 하)
 *
 * 문제
 * 자연수 n, a, b가 주어집니다.
 * 1부터 n까지의 수 중 a의 배수이면서 b의 배수이기도 한 수가 몇 개인지
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * n     a    b    result
 * 12    2    3    2       (6, 12)
 * 10    2    5    1       (10)
 * 5     2    3    0
 * 6     1    1    6
 */
public class Ct114CommonMultiple {

    public int solution(int n, int a, int b) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 && i % b == 0) {
                answer++;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct114CommonMultiple q = new Ct114CommonMultiple();
        System.out.println("테스트1 결과: " + q.solution(12, 2, 3) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(10, 2, 5) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(5, 2, 3) + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(6, 1, 1) + " / 정답: 6");
    }
}