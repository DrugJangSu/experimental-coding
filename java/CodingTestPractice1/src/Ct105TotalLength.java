/*
 * [Ct105] 글자 수 총합 (복습 · 하)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 모든 단어의 글자 수를 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 *
 * 입출력 예
 * words              result
 * ["hi", "abc"]      5
 * ["a"]              1
 * ["java", "go"]     6
 * ["x", "y", "z"]    3
 */
public class Ct105TotalLength {

    public int solution(String[] words) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < words.length; i++) {
            answer += words[i].length();
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct105TotalLength q = new Ct105TotalLength();
        System.out.println("테스트1 결과: " + q.solution(new String[]{"hi", "abc"}) + " / 정답: 5");
        System.out.println("테스트2 결과: " + q.solution(new String[]{"a"}) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(new String[]{"java", "go"}) + " / 정답: 6");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"x", "y", "z"}) + " / 정답: 3");
    }
}