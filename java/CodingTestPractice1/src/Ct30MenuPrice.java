import java.util.HashMap;

/*
 * [Ct30] 메뉴판 가격 찾기 (5단계 · 하)
 *
 * 문제
 * 메뉴 이름들이 문자열 배열 menus로, 각 메뉴의 가격이 정수 배열 prices로 주어집니다.
 * (menus[i]의 가격은 prices[i]입니다.)
 * 주문한 메뉴 이름 order가 주어질 때, 그 메뉴의 가격을 return 하고
 * 메뉴판에 없는 메뉴라면 -1을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ menus의 길이 = prices의 길이 ≤ 100
 * - 메뉴 이름은 서로 다릅니다.
 * - 0 ≤ prices의 원소 ≤ 100,000
 *
 * 입출력 예
 * menus                             prices                order         result
 * ["americano", "latte", "mocha"]   [4500, 5000, 5500]    "latte"       5000
 * ["americano", "latte", "mocha"]   [4500, 5000, 5500]    "tea"         -1
 * ["water"]                         [0]                   "water"       0
 * ["a", "b"]                        [100, 200]            "b"           200
 */
public class Ct30MenuPrice {

    public int solution(String[] menus, int[] prices, String order) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 메뉴판 만들기: menus[i]를 이름표(키), prices[i]를 내용물(값)로 HashMap에 넣기
        HashMap<String, Integer> map = new HashMap<>(); // integer도 I 대문자로 해야되네. 안그러면 빨간색이 뜸.
        for (int i = 0; i < menus.length; i++) {
            map.put(menus[i], prices[i]); // 맞을..려나? 일반적인 list는 add, 이런 맵은 put이 기입용이지?
        }
        // 2. order가 메뉴판에 있으면 그 가격을, 없으면 -1을 answer에 담기
        for (int i = 0; i < map.size(); i++) { // map도 length이 아니라 size.... 맞지??
            if (map.containsKey(order)) { // 배열을 맵에 넣어도 배열이 그대로 배열로...남나? 아니다. 기존 containskey 안이 엤던 menus[i] 없애고 order 변수 넣음.
                answer = map.get(order);
            } else { // yes 아니면 no인 상황이니...
                answer = -1;
            }
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct30MenuPrice q = new Ct30MenuPrice();
        String[] menus = {"americano", "latte", "mocha"};
        int[] prices = {4500, 5000, 5500};
        System.out.println("테스트1 결과: " + q.solution(menus, prices, "latte") + " / 정답: 5000");
        System.out.println("테스트2 결과: " + q.solution(menus, prices, "tea") + " / 정답: -1");
        System.out.println("테스트3 결과: " + q.solution(new String[]{"water"}, new int[]{0}, "water") + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"a", "b"}, new int[]{100, 200}, "b") + " / 정답: 200");
    }
}