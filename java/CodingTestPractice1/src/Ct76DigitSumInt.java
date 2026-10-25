/*
 * [Ct76] 정수 자릿수 더하기 (8단계 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * n의 각 자리 숫자를 모두 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ n ≤ 100,000,000
 *
 * 입출력 예
 * n      result
 * 123    6
 * 9      9
 * 1000   1
 * 987    24
 */
public class Ct76DigitSumInt {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. n을 문자열로 바꾸기
        String s = String.valueOf(n); // 처음보는 거네
        // 2. 한 글자씩 보면서, 진짜 숫자로 바꿔서 더하기 (Ct65와 같음)
        for (int i = 0; i < s.length(); i++) {
            answer += s.charAt(i) - '0';
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct76DigitSumInt q = new Ct76DigitSumInt();
        System.out.println("테스트1 결과: " + q.solution(123) + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution(9) + " / 정답: 9");
        System.out.println("테스트3 결과: " + q.solution(1000) + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(987) + " / 정답: 24");
    }
}