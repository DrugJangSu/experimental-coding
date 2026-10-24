/*
 * [Ct49] 가장 긴 단어 (실전 모드 · 중)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 이 중 글자 수가 가장 많은 단어를 return 하도록 solution 메서드를 완성하세요.
 * 가장 긴 단어가 여러 개라면, 그중 가장 앞에 있는 단어를 return 합니다.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 1 ≤ 각 단어의 길이 ≤ 20
 *
 * 입출력 예
 * words                         result
 * ["hi", "hello", "hey"]        "hello"
 * ["a"]                         "a"
 * ["abc", "xyz", "ab"]          "abc"
 * ["java", "spring", "jpa"]     "spring"
 */
public class Ct49LongestWord {

    public String solution(String[] words) {
        String answer = ""; // max의 역할을 하는 거려나
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        for (int i = 0; i < words.length; i++) { // words 언애 있는 단어 로테이션용
            if (words[i].length() > answer.length()) {
                answer = words[i];
            } else if
            (words[i].length() == answer.length()) {
                continue;
            }
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct49LongestWord q = new Ct49LongestWord();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"hi", "hello", "hey"}) + "] / 정답: [hello]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"a"}) + "] / 정답: [a]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"abc", "xyz", "ab"}) + "] / 정답: [abc]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"java", "spring", "jpa"}) + "] / 정답: [spring]");
    }
}