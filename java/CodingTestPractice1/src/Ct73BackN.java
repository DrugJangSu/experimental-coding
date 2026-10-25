/*
 * [Ct73] 뒤에서 n글자 (8단계 · 하)
 *
 * 문제
 * 문자열 s와 정수 n이 주어집니다.
 * s의 뒤에서부터 n글자를 잘라 낸 문자열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ n ≤ s의 길이 ≤ 100
 *
 * 입출력 예
 * s          n    result
 * "hello"    2    "lo"
 * "java"     4    "java"
 * "a"        1    "a"
 * "coding"   3    "ing"
 */
public class Ct73BackN {

    public String solution(String s, int n) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        answer = s.substring(s.length() - n); // 이번에는 뒤에서부터 n글자... 처음에는  s.substring(n); 이렇게 했다가 아차 싶었음
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct73BackN q = new Ct73BackN();
        System.out.println("테스트1 결과: [" + q.solution("hello", 2) + "] / 정답: [lo]");
        System.out.println("테스트2 결과: [" + q.solution("java", 4) + "] / 정답: [java]");
        System.out.println("테스트3 결과: [" + q.solution("a", 1) + "] / 정답: [a]");
        System.out.println("테스트4 결과: [" + q.solution("coding", 3) + "] / 정답: [ing]");
    }
}