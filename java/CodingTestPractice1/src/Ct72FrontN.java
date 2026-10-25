/*
 * [Ct72] 앞에서 n글자 (8단계 · 하)
 *
 * 문제
 * 문자열 s와 정수 n이 주어집니다.
 * s의 앞에서부터 n글자를 잘라 낸 문자열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ n ≤ s의 길이 ≤ 100
 *
 * 입출력 예
 * s          n    result
 * "hello"    2    "he"
 * "java"     4    "java"
 * "a"        1    "a"
 * "coding"   3    "cod"
 */
public class Ct72FrontN {

    public String solution(String s, int n) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        answer = s.substring(0, n); // 앞이 시작점, 하나만 있으면 그게 시작점이지? 만약에 끝부분만 요구하면 앞에다 0을 넣어야 되고...
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct72FrontN q = new Ct72FrontN();
        System.out.println("테스트1 결과: [" + q.solution("hello", 2) + "] / 정답: [he]");
        System.out.println("테스트2 결과: [" + q.solution("java", 4) + "] / 정답: [java]");
        System.out.println("테스트3 결과: [" + q.solution("a", 1) + "] / 정답: [a]");
        System.out.println("테스트4 결과: [" + q.solution("coding", 3) + "] / 정답: [cod]");
    }
}