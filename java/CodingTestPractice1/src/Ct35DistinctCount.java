import java.util.HashMap;

/*
 * [Ct35] 서로 다른 단어 개수 (5단계 · 하)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 서로 다른 단어가 모두 몇 종류인지 return 하도록 solution 메서드를 완성하세요.
 * (같은 단어가 여러 번 나와도 한 종류로 셉니다.)
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 단어는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * words                          result
 * ["apple", "banana", "apple"]   2
 * ["a", "a", "a"]                1
 * ["x", "y", "z"]                3
 * ["k"]                          1
 */
public class Ct35DistinctCount {

    public int solution(String[] words) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 단어를 하나씩 서랍장(HashMap)에 넣기 (서랍 안 값은 아무 숫자나. 예: 1)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        // 2. 서랍장에 이름표가 몇 개 있는지 세기
        answer = map.size();
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct35DistinctCount q = new Ct35DistinctCount();
        System.out.println("테스트1 결과: " + q.solution(new String[]{"apple", "banana", "apple"}) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new String[]{"a", "a", "a"}) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(new String[]{"x", "y", "z"}) + " / 정답: 3");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"k"}) + " / 정답: 1");
    }
}