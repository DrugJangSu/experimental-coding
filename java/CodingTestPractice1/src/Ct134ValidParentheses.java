import java.util.Stack;

/*
 * [Ct134] 올바른 괄호 (LMS 2부 05 · 프로그래머스 Lv.2 재도전)
 *
 * 문제
 * '(' 또는 ')'로만 이루어진 문자열 s가 주어집니다.
 * 괄호가 바르게 짝지어져 있으면 true, 아니면 false를
 * return 하도록 solution 메서드를 완성하세요.
 * (안에 괄호가 또 들어 있는 "(())"도 올바른 괄호입니다.)
 *
 * 입출력 예
 * s          result
 * "()()"     true
 * "(())()"   true
 * ")()("     false
 * "(()("     false
 */
public class Ct134ValidParentheses {

    public boolean solution(String s) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct134ValidParentheses q = new Ct134ValidParentheses();
        System.out.println("테스트1 결과: " + q.solution("()()") + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution("(())()") + " / 정답: true");
        System.out.println("테스트3 결과: " + q.solution(")()(") + " / 정답: false");
        System.out.println("테스트4 결과: " + q.solution("(()(") + " / 정답: false");
    }
}