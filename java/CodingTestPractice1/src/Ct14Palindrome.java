/*
 * [Ct14] 팰린드롬 판별 (3단계 · 중)
 *
 * 문제
 * 앞에서부터 읽어도, 뒤에서부터 읽어도 똑같은 문자열을 팰린드롬이라고 합니다.
 * (예: 기러기, 토마토, level)
 * 문자열 s가 팰린드롬이면 true, 아니면 false를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - s는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * s         result
 * "level"   true
 * "hello"   false
 * "a"       true
 * "abba"    true
 * "abca"    false
 */
public class Ct14Palindrome {

    public boolean solution(String s) {
        boolean answer = false;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        String invertedS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertedS += s.charAt(i);
        }
        if (invertedS.equals(s)) {
            answer = true;
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct14Palindrome q = new Ct14Palindrome();
        System.out.println("테스트1 결과: " + q.solution("level") + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution("hello") + " / 정답: false");
        System.out.println("테스트3 결과: " + q.solution("a") + " / 정답: true");
        System.out.println("테스트4 결과: " + q.solution("abba") + " / 정답: true");
        System.out.println("테스트5 결과: " + q.solution("abca") + " / 정답: false");
    }
}