import java.util.HashMap;

/*
 * [Ct37] 색깔 투표 세기 (5단계 · 하)
 *
 * 문제
 * 사람들이 고른 색깔들이 문자열 배열 colors로, 찾을 색깔이 target으로 주어집니다.
 * 세기 표(HashMap)를 만든 뒤, target이 몇 표인지 return 하도록
 * solution 메서드를 완성하세요. (없으면 0입니다.)
 *
 * 제한사항
 * - 1 ≤ colors의 길이 ≤ 100
 * - 색깔 이름은 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * colors                                     target    result
 * ["red", "blue", "red", "green", "red"]     "red"     3
 * ["red", "blue", "red", "green", "red"]     "blue"    1
 * ["red", "blue", "red", "green", "red"]     "black"   0
 * ["blue", "blue"]                           "blue"    2
 */
public class Ct37ColorCount {

    public int solution(String[] colors, String target) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 세기 표 만들기: 색깔을 하나씩 보면서
        //    - 이미 표에 있으면 → 지금 숫자 + 1 로 고쳐 쓰기
        //    - 처음 보면       → 1 적기
        //    (확인용) 반복문 안 맨 아래에 이 줄 넣기:
        //    System.out.println(colors[i] + " → 표: " + map);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < colors.length; i++) {
            if (!map.containsKey(colors[i])) {
                map.put(colors[i], 1);
            } else {
                map.put(colors[i], map.get(colors[i]) + 1);
            }
        }
        // 2. target의 숫자를 answer에 담기 (표에 없으면 answer는 그대로 0)
        if (map.containsKey(target)) {
        answer = map.get(target);
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct37ColorCount q = new Ct37ColorCount();
        String[] colors = {"red", "blue", "red", "green", "red"};
        System.out.println("테스트1 결과: " + q.solution(colors, "red") + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(colors, "blue") + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(colors, "black") + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"blue", "blue"}, "blue") + " / 정답: 2");
    }
}