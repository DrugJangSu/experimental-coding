/*
 * [Ct75] 문장에서 가장 긴 단어 (8단계 · 중)
 *
 * 문제
 * 단어들이 공백 한 칸으로 구분된 문장 s가 주어집니다.
 * 가장 긴 단어를 return 하도록 solution 메서드를 완성하세요.
 * 가장 긴 단어가 여러 개라면, 그중 가장 앞에 있는 단어를 return 합니다.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - 단어 사이에는 공백이 정확히 한 칸씩 있고, 맨 앞과 맨 뒤에는 공백이 없습니다.
 *
 * 입출력 예
 * s                       result
 * "I love programming"    "programming"
 * "a bb cc"               "bb"
 * "java"                  "java"
 * "hi there you"          "there"
 */
public class Ct75LongestInSentence {

    public String solution(String s) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        String[] words = s.split(" "); // 또 배꼈다 ㅅㅂ

        String answer = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > answer.length()) {
                answer = words[i];
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct75LongestInSentence q = new Ct75LongestInSentence();
        System.out.println("테스트1 결과: [" + q.solution("I love programming") + "] / 정답: [programming]");
        System.out.println("테스트2 결과: [" + q.solution("a bb cc") + "] / 정답: [bb]");
        System.out.println("테스트3 결과: [" + q.solution("java") + "] / 정답: [java]");
        System.out.println("테스트4 결과: [" + q.solution("hi there you") + "] / 정답: [there]");
    }
}