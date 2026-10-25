import java.util.HashMap;

/*
 * [Ct64] 안 온 사람 찾기 (5단계 · 상, 보류 재도전)
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
public class Ct64NoShowRetry {

    public String solution(String[] registered, String[] attended) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 등록 명단으로 세기 표 만들기 (+1)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < registered.length; i++) {
            if (!map.containsKey(registered[i])) {
                map.put(registered[i], 1);
            } else {
                map.put(registered[i], map.get(registered[i]) + 1);
            }
        }
        // 2. 온 사람마다 그 사람 숫자 -1 // 뭐????????
        // 아 맞다 1로 각각 지정해놓고 온 애들만 하나 빼라는 거지? ㅅㅂ 이걸 대체 문제보고 어떻게 생각내냐고
        for (int i = 0; i < attended.length; i++) {
            if (map.containsKey(attended[i])) {
                map.put(attended[i], (map.get(attended[i]) - 1)); // 결국 힌트 봤다ㅠ
            }
        }
        // 3. 등록 명단을 처음부터 끝까지 보면서, 숫자가 1 이상 남은 사람이 답 → 찾으면 멈추기
        for (int i = 0; i < map.size(); i++) {
            if (map.get(registered[i]) >= 1) {
                answer = registered[i];
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct64NoShowRetry q = new Ct64NoShowRetry();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"kim", "lee", "park"}, new String[]{"park", "kim"}) + "] / 정답: [lee]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"a", "b", "a"}, new String[]{"a", "b"}) + "] / 정답: [a]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"x"}, new String[]{}) + "] / 정답: [x]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"mike", "anna", "mike", "tom"}, new String[]{"tom", "mike", "anna"}) + "] / 정답: [mike]");
    }
}