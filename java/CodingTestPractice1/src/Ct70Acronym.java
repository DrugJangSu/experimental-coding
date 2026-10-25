/*
 * [Ct70] 첫 글자 모으기 (8단계 · 하)
 *
 * 문제
 * 단어들이 공백 한 칸으로 구분된 문장 s가 주어집니다.
 * 각 단어의 첫 글자를 순서대로 이어 붙인 문자열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - 단어 사이에는 공백이 정확히 한 칸씩 있고, 맨 앞과 맨 뒤에는 공백이 없습니다.
 *
 * 입출력 예
 * s                      result
 * "hello world"          "hw"
 * "java"                 "j"
 * "a b c d"              "abcd"
 * "I love coding test"   "Ilct"
 */
public class Ct70Acronym {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 공백 기준으로 자르기 (Ct69)
        String [] words = s.split(" "); // 당황해서 결국 또 배낌
        // 2. 단어를 하나씩 보면서, 첫 글자를 answer에 이어 붙이기 (Ct46)
        // 맨 앞거 빼야겠네 charAt 써야되나
        for (int i = 0; i < words.length; i++) {
            answer += words[i].charAt(0);
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct70Acronym q = new Ct70Acronym();
        System.out.println("테스트1 결과: [" + q.solution("hello world") + "] / 정답: [hw]");
        System.out.println("테스트2 결과: [" + q.solution("java") + "] / 정답: [j]");
        System.out.println("테스트3 결과: [" + q.solution("a b c d") + "] / 정답: [abcd]");
        System.out.println("테스트4 결과: [" + q.solution("I love coding test") + "] / 정답: [Ilct]");
    }
}