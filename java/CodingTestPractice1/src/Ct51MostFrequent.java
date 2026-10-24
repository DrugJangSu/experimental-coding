import java.util.HashMap;

/*
 * [Ct51] 가장 많이 나온 단어 (실전 모드 · 중상)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 가장 많이 나온 단어를 return 하도록 solution 메서드를 완성하세요.
 * 가장 많이 나온 단어가 여러 개라면, words에서 가장 먼저 나온 단어를 return 합니다.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 단어는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * words                                   result
 * ["a", "b", "a", "c", "b", "a"]          "a"
 * ["x"]                                   "x"
 * ["kim", "lee", "lee", "kim"]            "kim"
 * ["dog", "cat", "cat"]                   "cat"
 */
public class Ct51MostFrequent {

    public String solution(String[] words) {
        String answer = words[0]; // 여기 전에 틀림.
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        HashMap<String, Integer> map = new HashMap<>();
        // 문자열 -> HashMap으로 입력하되, 많이 나오는 단어를 확인해야됨. 숫자는 리턴 안해도 되지만, 같은 개수의 숫자가 나오면 첫번째가 디폴트
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }
        // 매핑 다 했으니 이제 숫자가 가장 많은 value 중에서 맨 앞에꺼 하면 되나
        int max; // 밖에다 두어야 했네...
        for (int i = 0; i < map.size(); i++) {
            max = map.get(words[0]); // 헷갈려서 변수 따로 만들어놂
            if (map.get(words[i]) > max) {
                max = map.get(words[i]);
                answer = words[i];
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct51MostFrequent q = new Ct51MostFrequent();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"a", "b", "a", "c", "b", "a"}) + "] / 정답: [a]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"x"}) + "] / 정답: [x]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"kim", "lee", "lee", "kim"}) + "] / 정답: [kim]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"dog", "cat", "cat"}) + "] / 정답: [cat]");
    }
}