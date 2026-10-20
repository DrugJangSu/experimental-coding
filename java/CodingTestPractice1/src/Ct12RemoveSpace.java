/*
 * [Ct12] 공백 빼기 (3단계 · 하)
 *
 * 문제
 * 문자열 s가 주어집니다.
 * s에서 공백(' ')을 모두 빼고 나머지 글자를 순서대로 이어 붙인 문자열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - s는 영어 소문자와 공백으로만 이루어져 있습니다.
 *
 * 입출력 예
 * s               result
 * "hello world"   "helloworld"
 * "a b c"         "abc"
 * "java"          "java"
 * " hi "          "hi"
 */
public class Ct12RemoveSpace {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                answer += s.charAt(i);
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct12RemoveSpace q = new Ct12RemoveSpace();
        System.out.println("테스트1 결과: [" + q.solution("hello world") + "] / 정답: [helloworld]");
        System.out.println("테스트2 결과: [" + q.solution("a b c") + "] / 정답: [abc]");
        System.out.println("테스트3 결과: [" + q.solution("java") + "] / 정답: [java]");
        System.out.println("테스트4 결과: [" + q.solution(" hi ") + "] / 정답: [hi]");
    }
}