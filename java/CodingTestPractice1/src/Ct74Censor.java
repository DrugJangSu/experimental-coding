/*
 * [Ct74] 단어 가리기 (8단계 · 하)
 *
 * 문제
 * 문자열 s와 가릴 단어 bad가 주어집니다.
 * s에 있는 bad를 모두 "***"로 바꾼 문자열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - 1 ≤ bad의 길이 ≤ 10
 *
 * 입출력 예
 * s               bad      result
 * "i hate bugs"   "hate"   "i *** bugs"
 * "hello"         "x"      "hello"
 * "ha ha ha"      "ha"     "*** *** ***"
 * "java"          "java"   "***"
 */
public class Ct74Censor {

    public String solution(String s, String bad) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        answer = s.replace(bad, "***");// 거참 어렵구먼
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct74Censor q = new Ct74Censor();
        System.out.println("테스트1 결과: [" + q.solution("i hate bugs", "hate") + "] / 정답: [i *** bugs]");
        System.out.println("테스트2 결과: [" + q.solution("hello", "x") + "] / 정답: [hello]");
        System.out.println("테스트3 결과: [" + q.solution("ha ha ha", "ha") + "] / 정답: [*** *** ***]");
        System.out.println("테스트4 결과: [" + q.solution("java", "java") + "] / 정답: [***]");
    }
}