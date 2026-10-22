/*
 * [Ct16] a 가리기 (3단계 · 하)
 *
 * 문제
 * 영어 소문자로만 이루어진 문자열 s가 주어집니다.
 * s에 있는 'a'를 모두 '*'로 바꾼 문자열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - s는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * s          result
 * "banana"   "b*n*n*"
 * "apple"    "*pple"
 * "kiwi"     "kiwi"
 * "aaa"      "***"
 */
public class Ct16ReplaceA {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                answer += '*';
            } else {
                answer += s.charAt(i);
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct16ReplaceA q = new Ct16ReplaceA();
        System.out.println("테스트1 결과: [" + q.solution("banana") + "] / 정답: [b*n*n*]");
        System.out.println("테스트2 결과: [" + q.solution("apple") + "] / 정답: [*pple]");
        System.out.println("테스트3 결과: [" + q.solution("kiwi") + "] / 정답: [kiwi]");
        System.out.println("테스트4 결과: [" + q.solution("aaa") + "] / 정답: [***]");
    }
}