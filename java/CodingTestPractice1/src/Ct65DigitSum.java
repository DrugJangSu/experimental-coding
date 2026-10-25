/*
 * [Ct65] 자릿수 더하기 (3단계 · 하)
 *
 * 문제
 * 숫자로만 이루어진 문자열 s가 주어집니다.
 * 각 자리의 숫자를 모두 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - s는 '0'~'9'로만 이루어져 있습니다.
 *
 * 입출력 예
 * s        result
 * "123"    6
 * "9"      9
 * "1000"   1
 * "999"    27
 */
public class Ct65DigitSum {

    public int solution(String s) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < s.length(); i++) {
            answer += s.charAt(i) - '0';
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct65DigitSum q = new Ct65DigitSum();
        System.out.println("테스트1 결과: " + q.solution("123") + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution("9") + " / 정답: 9");
        System.out.println("테스트3 결과: " + q.solution("1000") + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution("999") + " / 정답: 27");
    }
}