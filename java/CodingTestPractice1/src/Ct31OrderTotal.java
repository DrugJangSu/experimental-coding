import java.util.HashMap;

/*
 * [Ct31] 주문 총액 (5단계 · 하)
 *
 * 문제
 * 메뉴 이름들이 문자열 배열 menus로, 각 메뉴의 가격이 정수 배열 prices로 주어집니다.
 * (menus[i]의 가격은 prices[i]입니다.)
 * 손님이 주문한 메뉴들이 문자열 배열 orders로 주어질 때,
 * 주문 총액을 return 하도록 solution 메서드를 완성하세요.
 * 메뉴판에 없는 메뉴는 계산하지 않습니다.
 *
 * 제한사항
 * - 1 ≤ menus의 길이 = prices의 길이 ≤ 100
 * - 1 ≤ orders의 길이 ≤ 100
 * - 메뉴 이름은 서로 다릅니다.
 *
 * 입출력 예 (menus, prices는 모두 아래와 같음)
 * menus  = ["americano", "latte", "mocha"]
 * prices = [4500, 5000, 5500]
 *
 * orders                         result
 * ["latte", "latte", "mocha"]    15500
 * ["americano"]                  4500
 * ["tea", "latte"]               5000
 * ["tea"]                        0
 */
public class Ct31OrderTotal {

    public int solution(String[] menus, int[] prices, String[] orders) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 메뉴판(HashMap) 만들기
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < prices.length; i++) { // 길이는 menus 아니면 prices 둘중 하나 이렇게 진행해도 되는거지? 그런거지?
            map.put(menus[i], prices[i]);
        }
        // 2. 주문 목록을 하나씩 보면서, 메뉴판에 있으면 그 가격을 answer에 더하기
        for (int i = 0; i < orders.length; i++) { // orders라는 배열 하나하나 확인해야 되기 때문에 여기서 반복문이 또 필요한거야?
            if (map.containsKey(orders[i])) {
                answer += map.get(orders[i]);
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct31OrderTotal q = new Ct31OrderTotal();
        String[] menus = {"americano", "latte", "mocha"};
        int[] prices = {4500, 5000, 5500};
        System.out.println("테스트1 결과: " + q.solution(menus, prices, new String[]{"latte", "latte", "mocha"}) + " / 정답: 15500");
        System.out.println("테스트2 결과: " + q.solution(menus, prices, new String[]{"americano"}) + " / 정답: 4500");
        System.out.println("테스트3 결과: " + q.solution(menus, prices, new String[]{"tea", "latte"}) + " / 정답: 5000");
        System.out.println("테스트4 결과: " + q.solution(menus, prices, new String[]{"tea"}) + " / 정답: 0");
    }
}