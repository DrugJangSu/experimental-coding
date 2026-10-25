import java.util.Stack;

/*
 * [Ct59] 괄호 짝 맞추기 (7단계 · 중, 보류 재도전)
 *
 * 문제
 * '(' 와 ')' 로만 이루어진 문자열 s가 주어집니다.
 * 괄호의 짝이 올바르게 맞으면 true, 아니면 false를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 *
 * 입출력 예
 * s          result
 * "()"       true
 * "(())()"   true
 * ")("       false
 * "(()"      false
 * "())"      false
 */
public class Ct59BracketsRetry {

    public boolean solution(String s) {
        boolean answer = false;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 글자 스택 만들기
        Stack<Character> stack = new Stack<>(); // 틀린거 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고 또틀리고
        // 2. s를 한 글자씩 보면서
        //    - '(' 이면 → push
        //    - ')' 이면 → 치울 접시가 없으면(비었으면) 바로 return false;
        //                  있으면 → pop
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        // 3. 다 봤을 때 스택이 비어 있으면 true
        if (stack.isEmpty()) {
            answer = true;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct59BracketsRetry q = new Ct59BracketsRetry();
        System.out.println("테스트1 결과: " + q.solution("()") + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution("(())()") + " / 정답: true");
        System.out.println("테스트3 결과: " + q.solution(")(") + " / 정답: false");
        System.out.println("테스트4 결과: " + q.solution("(()") + " / 정답: false");
        System.out.println("테스트5 결과: " + q.solution("())") + " / 정답: false");
    }
}