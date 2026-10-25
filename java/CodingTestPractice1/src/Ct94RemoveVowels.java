/*
 * [Ct94] 모음 빼기 (복습 · 하)
 *
 * 문제
 * 영어 소문자와 공백으로 이루어진 문자열 s가 주어집니다.
 * s에서 모음('a', 'e', 'i', 'o', 'u')을 모두 빼고 남은 글자를 순서대로 이어 붙인
 * 문자열을 return 하도록 solution 메서드를 완성하세요. (공백은 그대로 둡니다.)
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 *
 * 입출력 예
 * s                     result
 * "nice to meet you"    "nc t mt y"
 * "aeiou"               ""
 * "java"                "jv"
 * "sky"                 "sky"
 */
public class Ct94RemoveVowels {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            } else {
                answer += c;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct94RemoveVowels q = new Ct94RemoveVowels();
        System.out.println("테스트1 결과: [" + q.solution("nice to meet you") + "] / 정답: [nc t mt y]");
        System.out.println("테스트2 결과: [" + q.solution("aeiou") + "] / 정답: []");
        System.out.println("테스트3 결과: [" + q.solution("java") + "] / 정답: [jv]");
        System.out.println("테스트4 결과: [" + q.solution("sky") + "] / 정답: [sky]");
    }
}