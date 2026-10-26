/*
 * [Ct115] 짝수 자릿수 세기 (복습 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * n의 각 자리 숫자 중 짝수가 몇 개인지 return 하도록 solution 메서드를 완성하세요.
 * (0도 짝수입니다.)
 *
 * 입출력 예
 * n        result
 * 1234     2       (2, 4)
 * 13579    0
 * 2        1
 * 2020     4       (2, 0, 2, 0)
 */
public class Ct115EvenDigits {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            if (d % 2 == 0) {
                answer++;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct115EvenDigits q = new Ct115EvenDigits();
        System.out.println("테스트1 결과: " + q.solution(1234) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(13579) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(2) + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(2020) + " / 정답: 4");
    }
}