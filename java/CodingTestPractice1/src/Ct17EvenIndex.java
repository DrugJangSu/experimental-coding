/*
 * [Ct17] 짝수 칸 글자 모으기 (3단계 · 하)
 *
 * 문제
 * 문자열 s가 주어집니다.
 * s에서 인덱스가 짝수(0, 2, 4, ...)인 칸의 글자만 순서대로 이어 붙인 문자열을
 * return 하도록 solution 메서드를 완성하세요.
 * (인덱스는 0부터 셉니다.)
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - s는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * s          result
 * "abcdef"   "ace"
 * "hello"    "hlo"
 * "a"        "a"
 * "ab"       "a"
 * "java"     "jv"
 */
public class Ct17EvenIndex {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct17EvenIndex q = new Ct17EvenIndex();
        System.out.println("테스트1 결과: [" + q.solution("abcdef") + "] / 정답: [ace]");
        System.out.println("테스트2 결과: [" + q.solution("hello") + "] / 정답: [hlo]");
        System.out.println("테스트3 결과: [" + q.solution("a") + "] / 정답: [a]");
        System.out.println("테스트4 결과: [" + q.solution("ab") + "] / 정답: [a]");
        System.out.println("테스트5 결과: [" + q.solution("java") + "] / 정답: [jv]");
    }
}