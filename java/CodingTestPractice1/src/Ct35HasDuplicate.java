import java.util.HashMap;

/*
 * [Ct35] 중복 단어가 있나? (5단계 · 하)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 같은 단어가 두 번 이상 나오면 true, 모두 다르면 false를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 단어는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * words              result
 * ["a", "b", "a"]    true
 * ["x", "y", "z"]    false
 * ["k"]              false
 * ["p", "p"]         true
 */
public class Ct35HasDuplicate {

    public boolean solution(String[] words) {
        boolean answer = false;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        HashMap <String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        if (words.length != map.size()) {
            answer = true;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct35HasDuplicate q = new Ct35HasDuplicate();
        System.out.println("테스트1 결과: " + q.solution(new String[]{"a", "b", "a"}) + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution(new String[]{"x", "y", "z"}) + " / 정답: false");
        System.out.println("테스트3 결과: " + q.solution(new String[]{"k"}) + " / 정답: false");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"p", "p"}) + " / 정답: true");
    }
}