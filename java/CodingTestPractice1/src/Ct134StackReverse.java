import java.util.Stack;

/*
 * [Ct134] 스택으로 문자열 뒤집기 (3단계 스택 · 하)
 *
 * 문제
 * 문자열 s가 주어집니다.
 * 스택을 이용해 s를 거꾸로 뒤집은 문자열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * s         result
 * "abc"     "cba"
 * "a"       "a"
 * "hello"   "olleh"
 * "java"    "avaj"
 */
public class Ct134StackReverse {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Stack<Character> stack = new Stack<>();
        // 1. 글자를 하나씩 스택에 넣기
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        // 2. 스택이 빌 때까지 하나씩 꺼내서 answer에 붙이기
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct134StackReverse q = new Ct134StackReverse();
        System.out.println("테스트1 결과: " + q.solution("abc") + " / 정답: cba");
        System.out.println("테스트2 결과: " + q.solution("a") + " / 정답: a");
        System.out.println("테스트3 결과: " + q.solution("hello") + " / 정답: olleh");
        System.out.println("테스트4 결과: " + q.solution("java") + " / 정답: avaj");
    }
}