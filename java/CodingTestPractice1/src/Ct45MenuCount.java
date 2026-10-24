import java.util.Arrays;
import java.util.HashMap;

/*
 * [Ct45] 메뉴별 주문 수 (5단계 복습 · 중)
 *
 * 문제
 * 들어온 주문들이 문자열 배열 orders로, 메뉴판이 문자열 배열 menu로 주어집니다.
 * 각 메뉴가 몇 번 주문됐는지 menu 순서대로 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (한 번도 주문되지 않은 메뉴는 0입니다.)
 *
 * 제한사항
 * - 1 ≤ orders의 길이 ≤ 100
 * - 1 ≤ menu의 길이 ≤ 10
 *
 * 입출력 예
 * orders                                            menu                        result
 * ["coffee", "tea", "coffee", "juice", "coffee"]    ["coffee", "tea", "cake"]   [3, 1, 0]
 * ["tea"]                                           ["tea", "coffee"]           [1, 0]
 * ["a", "a", "b"]                                   ["b", "a"]                  [1, 2]
 * ["x"]                                             ["y"]                       [0]
 */
public class Ct45MenuCount {

    public int[] solution(String[] orders, String[] menu) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 세기 표 만들기            → 반복문 안에서 볼 것: orders[i]
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < orders.length; i++) {
            if (!map.containsKey(orders[i])) {
                map.put(orders[i], 1);
            } else {
                map.put(orders[i], map.get(orders[i]) + 1);
            }
        }
        // 2. 메뉴 수만큼 계란판 만들기
        int[] answer = new int[menu.length];
        // 3. 메뉴마다 표에서 숫자 꺼내기 → 반복문 안에서 볼 것: menu[i]
        // 어우 갑자기 헷갈린다
        for (int i = 0; i < menu.length; i++) {
            if (map.containsKey(menu[i])) {
                answer[i] = map.get(menu[i]);
            }
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct45MenuCount q = new Ct45MenuCount();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new String[]{"coffee", "tea", "coffee", "juice", "coffee"}, new String[]{"coffee", "tea", "cake"})) + " / 정답: [3, 1, 0]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new String[]{"tea"}, new String[]{"tea", "coffee"})) + " / 정답: [1, 0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new String[]{"a", "a", "b"}, new String[]{"b", "a"})) + " / 정답: [1, 2]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new String[]{"x"}, new String[]{"y"})) + " / 정답: [0]");
    }
}