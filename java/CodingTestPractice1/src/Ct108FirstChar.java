/*
 * [Ct108] 글자가 처음 나오는 위치 (복습 · 하)
 *
 * 문제
 * 문자열 s와 글자 c가 주어집니다.
 * s에서 c가 처음 나오는 칸 번호를 return 하고, 없으면 -1을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 *
 * 입출력 예
 * s         c     result
 * "hello"   'l'   2
 * "java"    'a'   1
 * "abc"     'z'   -1
 * "x"       'x'   0
 */
public class Ct108FirstChar {

    public int solution(String s, char c) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct108FirstChar q = new Ct108FirstChar();
        System.out.println("테스트1 결과: " + q.solution("hello", 'l') + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution("java", 'a') + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution("abc", 'z') + " / 정답: -1");
        System.out.println("테스트4 결과: " + q.solution("x", 'x') + " / 정답: 0");
    }
}