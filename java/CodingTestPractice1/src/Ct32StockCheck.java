import java.util.HashMap;

/*
 * [Ct32] 재고 확인 (5단계 · 하)
 *
 * 문제
 * 상품 이름들이 문자열 배열 items로, 각 상품의 재고가 정수 배열 stocks로 주어집니다.
 * (items[i]의 재고는 stocks[i]입니다.)
 * 손님이 찾는 상품 이름 product가 주어질 때, 아래 규칙대로 return 하도록
 * solution 메서드를 완성하세요.
 *
 *   - 없는 상품이면          : "unknown"
 *   - 있는데 재고가 0이면     : "sold out"
 *   - 있고 재고가 1개 이상이면 : "ok"
 *
 * 제한사항
 * - 1 ≤ items의 길이 = stocks의 길이 ≤ 100
 * - 상품 이름은 서로 다릅니다.
 * - 0 ≤ stocks의 원소 ≤ 100
 *
 * 입출력 예 (items, stocks는 모두 아래와 같음)
 * items  = ["apple", "milk", "bread"]
 * stocks = [5, 0, 3]
 *
 * product    result
 * "apple"    "ok"
 * "milk"     "sold out"
 * "egg"      "unknown"
 * "bread"    "ok"
 */
public class Ct32StockCheck {

    public String solution(String[] items, int[] stocks, String product) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 재고표(HashMap) 만들기
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < stocks.length; i++) {
           map.put(items[i], stocks[i]);
        }
        // 2. 규칙대로 answer 정하기
        if (!map.containsKey(product)) {
            answer = "unknown";
        } else {
            if (map.get(product) >= 1) {
                answer = "ok";
            } else {
                answer = "sold out";
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct32StockCheck q = new Ct32StockCheck();
        String[] items = {"apple", "milk", "bread"};
        int[] stocks = {5, 0, 3};
        System.out.println("테스트1 결과: [" + q.solution(items, stocks, "apple") + "] / 정답: [ok]");
        System.out.println("테스트2 결과: [" + q.solution(items, stocks, "milk") + "] / 정답: [sold out]");
        System.out.println("테스트3 결과: [" + q.solution(items, stocks, "egg") + "] / 정답: [unknown]");
        System.out.println("테스트4 결과: [" + q.solution(items, stocks, "bread") + "] / 정답: [ok]");
    }
}