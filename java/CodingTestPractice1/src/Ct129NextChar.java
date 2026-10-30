/*
 * [Ct129] 다음 알파벳 (LMS 1단계 · 하)
 *
 * 문제
 * 알파벳 한 글자 c가 주어집니다. ('z', 'Z'는 주어지지 않습니다.)
 * 알파벳 순서에서 c 바로 다음 글자를 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * c      result
 * 'a'    'b'
 * 'y'    'z'
 * 'A'    'B'
 * 'm'    'n'
 */
public class Ct129NextChar {

    public char solution(char c) {
        char answer = ' ';
        // ↓↓↓ 여기에 코드 작성 (한 줄) ↓↓↓
        answer = (char) (c + 1);
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct129NextChar q = new Ct129NextChar();
        System.out.println("테스트1 결과: " + q.solution('a') + " / 정답: b");
        System.out.println("테스트2 결과: " + q.solution('y') + " / 정답: z");
        System.out.println("테스트3 결과: " + q.solution('A') + " / 정답: B");
        System.out.println("테스트4 결과: " + q.solution('m') + " / 정답: n");
    }
}