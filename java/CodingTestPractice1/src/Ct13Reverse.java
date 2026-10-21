/*
 * [Ct13] 문자열 뒤집기 (3단계 · 중)
 *
 * 문제
 * 문자열 s가 주어집니다.
 * s의 글자 순서를 거꾸로 뒤집은 문자열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - s는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * s         result
 * "hello"   "olleh"
 * "abc"     "cba"
 * "a"       "a"
 * "level"   "level"
 */
public class Ct13Reverse {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = s.length() - 1; i >= 0; i--) {
            answer += s.charAt(i);
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct13Reverse q = new Ct13Reverse();
        System.out.println("테스트1 결과: [" + q.solution("hello") + "] / 정답: [olleh]");
        System.out.println("테스트2 결과: [" + q.solution("abc") + "] / 정답: [cba]");
        System.out.println("테스트3 결과: [" + q.solution("a") + "] / 정답: [a]");
        System.out.println("테스트4 결과: [" + q.solution("level") + "] / 정답: [level]");
    }
}