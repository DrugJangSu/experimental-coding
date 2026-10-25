/*
 * [Ct93] 대소문자 뒤바꾸기 (8단계 복습 · 하)
 *
 * 문제
 * 영어 대소문자와 공백으로 이루어진 문자열 s가 주어집니다.
 * 대문자는 소문자로, 소문자는 대문자로 바꾼 문자열을
 * return 하도록 solution 메서드를 완성하세요. (공백은 그대로 둡니다.)
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 *
 * 입출력 예
 * s         result
 * "aBc"     "AbC"
 * "JAVA"    "java"
 * "hello"   "HELLO"
 * "Ab Cd"   "aB cD"
 */
public class Ct93SwapCase {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 한 글자씩 보면서
        //    - 대문자면 → 소문자로 바꿔서 answer에 이어 붙이기
        //    - 아니면   → 대문자로 바꿔서 answer에 이어 붙이기
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += c;
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct93SwapCase q = new Ct93SwapCase();
        System.out.println("테스트1 결과: [" + q.solution("aBc") + "] / 정답: [AbC]");
        System.out.println("테스트2 결과: [" + q.solution("JAVA") + "] / 정답: [java]");
        System.out.println("테스트3 결과: [" + q.solution("hello") + "] / 정답: [HELLO]");
        System.out.println("테스트4 결과: [" + q.solution("Ab Cd") + "] / 정답: [aB cD]");
    }
}