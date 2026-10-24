import java.util.HashMap;

/*
 * [Ct39] 안 온 사람 찾기 (5단계 · 상, 도전)
 *
 * 문제
 * 모임에 등록한 사람들의 이름이 문자열 배열 registered로,
 * 실제로 온 사람들의 이름이 문자열 배열 attended로 주어집니다.
 * 등록한 사람 중 정확히 한 명이 오지 않았습니다.
 * 오지 않은 사람의 이름을 return 하도록 solution 메서드를 완성하세요.
 * (이름이 같은 사람이 있을 수 있습니다.)
 *
 * 제한사항
 * - 1 ≤ registered의 길이 ≤ 100
 * - attended의 길이 = registered의 길이 - 1
 *
 * 입출력 예
 * registered                       attended                result
 * ["kim", "lee", "park"]           ["park", "kim"]         "lee"
 * ["a", "b", "a"]                  ["a", "b"]              "a"
 * ["x"]                            []                      "x"
 * ["mike", "anna", "mike", "tom"]  ["tom", "mike", "anna"] "mike"
 */
public class Ct39NoShow {

    public String solution(String[] registered, String[] attended) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 등록 명단으로 세기 표 만들기 (Ct38 1번과 같음)
        //    → 반복문 안에서 볼 것: registered[i]
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < registered.length; i++) {
            if (!map.containsKey(registered[i])) {
                map.put(registered[i], 1);
            } else {
                map.put(registered[i], map.get(registered[i]) + 1);
            }
        }
        // 2. 온 사람을 하나씩 보면서, 표의 숫자를 1씩 빼기 (+1 대신 -1)
        //    → 반복문 안에서 볼 것: attended[i]
        for (int i = 0; i < attended.length; i++) {
            if (map.containsKey(attended[i])) {
                map.put(attended[i], map.get(attended[i]) - 1);
            }
        }
        // 3. 등록 명단을 다시 하나씩 보면서,
        //    표에 남은 숫자가 1 이상인 사람이 답 → 찾으면 멈추기 (Ct09처럼)
        for (int i = 0; i < registered.length; i++) {
            if (map.get(registered[i]) >= 1) {
                answer = registered[i];
                break;
            }

        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct39NoShow q = new Ct39NoShow();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"kim", "lee", "park"}, new String[]{"park", "kim"}) + "] / 정답: [lee]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"a", "b", "a"}, new String[]{"a", "b"}) + "] / 정답: [a]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"x"}, new String[]{}) + "] / 정답: [x]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"mike", "anna", "mike", "tom"}, new String[]{"tom", "mike", "anna"}) + "] / 정답: [mike]");
    }
}