/*
 * [Ct104] 가장 짧은 단어 (복습 · 하)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 글자 수가 가장 적은 단어를 return 하도록 solution 메서드를 완성하세요.
 * 가장 짧은 단어가 여러 개라면, 그중 가장 앞에 있는 단어를 return 합니다.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 *
 * 입출력 예
 * words                        result
 * ["apple", "hi", "banana"]    "hi"
 * ["a"]                        "a"
 * ["cat", "dog"]               "cat"
 * ["java", "go", "c"]          "c"
 */
public class Ct104ShortestWord {

    public String solution(String[] words) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        String small = words[0]; // 가장 작은거 우선 지정
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < small.length()) {
                small = words[i];
            }
        }
        answer = small;


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct104ShortestWord q = new Ct104ShortestWord();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"apple", "hi", "banana"}) + "] / 정답: [hi]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"a"}) + "] / 정답: [a]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"cat", "dog"}) + "] / 정답: [cat]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"java", "go", "c"}) + "] / 정답: [c]");
    }
}