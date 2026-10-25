/*
 * [Ct71] 대문자 첫 글자 모으기 (8단계 · 하)
 *
 * 문제
 * 단어들이 공백 한 칸으로 구분된 문장 s가 주어집니다.
 * 각 단어의 첫 글자를 순서대로 이어 붙이고, 전부 대문자로 바꾼 문자열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - 단어 사이에는 공백이 정확히 한 칸씩 있고, 맨 앞과 맨 뒤에는 공백이 없습니다.
 *
 * 입출력 예
 * s                      result
 * "hello world"          "HW"
 * "java"                 "J"
 * "a b c d"              "ABCD"
 * "I love coding test"   "ILCT"
 */
public class Ct71AcronymUpper {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1~2. Ct70과 똑같이 첫 글자 모으기
        // 뭐 다시 해봐야지
        String [] words = s.split(" "); // 또 배꼈다 십ㅋㅋㅋㅋ
        for (int i = 0; i < words.length; i++) {
            answer += words[i].charAt(0);
        }
        // 3. answer를 대문자로 바꿔서 다시 answer에 담기
        answer = answer.toUpperCase(); // 자꾸 camelCase로 해야되는거 까멱어 ㅅㅂ
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct71AcronymUpper q = new Ct71AcronymUpper();
        System.out.println("테스트1 결과: [" + q.solution("hello world") + "] / 정답: [HW]");
        System.out.println("테스트2 결과: [" + q.solution("java") + "] / 정답: [J]");
        System.out.println("테스트3 결과: [" + q.solution("a b c d") + "] / 정답: [ABCD]");
        System.out.println("테스트4 결과: [" + q.solution("I love coding test") + "] / 정답: [ILCT]");
    }
}