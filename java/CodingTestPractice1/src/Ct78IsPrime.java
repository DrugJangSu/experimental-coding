/*
 * [Ct78] 소수 판별 (9단계 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * n이 소수이면 true, 아니면 false를 return 하도록 solution 메서드를 완성하세요.
 * (소수: 1과 자기 자신만을 약수로 가지는 수. 1은 소수가 아닙니다.)
 *
 * 제한사항
 * - 1 ≤ n ≤ 1,000
 *
 * 입출력 예
 * n     result
 * 7     true
 * 1     false
 * 12    false
 * 2     true
 * 13    true
 */
public class Ct78IsPrime {

    public boolean solution(int n) {
        boolean answer = false;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 약수가 몇 개인지 세기 (Ct77에서 "더하기" 대신 "개수 세기")
        int count = 0; // 몇개인지 확인해야될듯
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        // 2. 약수가 정확히 2개이면 true
        if (count == 2) {
            answer = true;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct78IsPrime q = new Ct78IsPrime();
        System.out.println("테스트1 결과: " + q.solution(7) + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution(1) + " / 정답: false");
        System.out.println("테스트3 결과: " + q.solution(12) + " / 정답: false");
        System.out.println("테스트4 결과: " + q.solution(2) + " / 정답: true");
        System.out.println("테스트5 결과: " + q.solution(13) + " / 정답: true");
    }
}