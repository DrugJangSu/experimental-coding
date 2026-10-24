import java.util.Arrays;
import java.util.HashMap;

/*
 * [Ct38] 개표하기 (5단계 · 중, 보류 재도전)
 *
 * 문제
 * 투표 용지에 적힌 이름들이 문자열 배열 votes로,
 * 후보 이름들이 문자열 배열 candidates로 주어집니다.
 * 각 후보가 받은 표 수를 candidates 순서대로 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (한 표도 못 받은 후보는 0입니다.)
 *
 * 제한사항
 * - 1 ≤ votes의 길이 ≤ 100
 * - 1 ≤ candidates의 길이 ≤ 10
 *
 * 입출력 예
 * votes                                          candidates              result
 * ["kim", "lee", "kim", "park", "kim", "lee"]    ["kim", "lee", "park"]  [3, 2, 1]
 * ["a"]                                          ["a", "b"]              [1, 0]
 * ["x", "x"]                                     ["x"]                   [2]
 * ["lee", "kim"]                                 ["park"]                [0]
 */
public class Ct38VoteRetry {

    public int[] solution(String[] votes, String[] candidates) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 표 만들기: votes를 하나씩 보면서, 처음이면 1 / 이미 있으면 +1  (Ct37과 같음)
        //    → 반복문 안에서 볼 것: votes[i]
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < votes.length; i++) {
            if (!map.containsKey(votes[i])) {
                map.put(votes[i], 1);
            } else {
                map.put(votes[i], map.get(votes[i]) + 1);
            }
        }
        // 2. 계란판: 후보 수만큼 int[] 만들기  (Ct24와 같음)
        int [] answer = new int [candidates.length];


        // 3. 채우기: candidates를 하나씩 보면서, 표에 있으면 그 숫자를 answer[i]에
        //    → 반복문 안에서 볼 것: candidates[i]
        for (int i = 0; i < candidates.length; i++) {
            if (map.containsKey(candidates[i])) {
                answer[i] = map.get(candidates[i]);
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct38VoteRetry q = new Ct38VoteRetry();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new String[]{"kim", "lee", "kim", "park", "kim", "lee"}, new String[]{"kim", "lee", "park"})) + " / 정답: [3, 2, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new String[]{"a"}, new String[]{"a", "b"})) + " / 정답: [1, 0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new String[]{"x", "x"}, new String[]{"x"})) + " / 정답: [2]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new String[]{"lee", "kim"}, new String[]{"park"})) + " / 정답: [0]");
    }
}