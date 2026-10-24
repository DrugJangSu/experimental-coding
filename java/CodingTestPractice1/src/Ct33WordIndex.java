import java.util.HashMap;

/*
 * [Ct33] 단어 위치 찾기 (5단계 · 하)
 *
 * 문제
 * 단어들이 문자열 배열 words로, 찾을 단어가 target으로 주어집니다.
 * target이 words의 몇 번째 칸(인덱스)에 있는지 return 하고,
 * 없으면 -1을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 단어는 서로 다릅니다. (같은 단어가 두 번 나오지 않습니다.)
 *
 * 입출력 예
 * words                         target    result
 * ["apple", "banana", "kiwi"]   "kiwi"    2
 * ["apple", "banana", "kiwi"]   "grape"   -1
 * ["a"]                         "a"       0
 * ["x", "y"]                    "x"       0
 */
public class Ct33WordIndex {

    public int solution(String[] words, String target) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 장부 만들기: 단어를 이름표로, 그 단어의 칸 번호 i를 서랍 안에 넣기
        //    (Ct30에서 menus[i], prices[i]를 넣었던 것처럼)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        // 2. target이 장부에 있으면 그 칸 번호를, 없으면 -1을 answer에 담기
        //    (Ct32처럼)
        if (!map.containsKey(target)) {
            answer = -1;
        } else {
            answer = map.get(target);
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct33WordIndex q = new Ct33WordIndex();
        String[] words = {"apple", "banana", "kiwi"};
        System.out.println("테스트1 결과: " + q.solution(words, "kiwi") + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(words, "grape") + " / 정답: -1");
        System.out.println("테스트3 결과: " + q.solution(new String[]{"a"}, "a") + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"x", "y"}, "x") + " / 정답: 0");
    }
}