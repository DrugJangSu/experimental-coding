/*
 * [Ct53] 가장 비싼 메뉴 (실전 모드 · 하)
 *
 * 문제
 * 메뉴 이름들이 문자열 배열 menus로, 각 메뉴의 가격이 정수 배열 prices로 주어집니다.
 * (menus[i]의 가격은 prices[i]입니다.)
 * 가장 비싼 메뉴의 이름을 return 하도록 solution 메서드를 완성하세요.
 * 가장 비싼 메뉴가 여러 개라면, 그중 가장 앞에 있는 메뉴를 return 합니다.
 *
 * 제한사항
 * - 1 ≤ menus의 길이 = prices의 길이 ≤ 100
 * - 0 ≤ prices의 원소 ≤ 100,000
 *
 * 입출력 예
 * menus                        prices                result
 * ["coffee", "tea", "cake"]    [4500, 3000, 5500]    "cake"
 * ["water"]                    [0]                   "water"
 * ["a", "b", "c"]              [100, 100, 50]        "a"
 * ["x", "y"]                   [10, 20]              "y"
 */
public class Ct53MostExpensive {

    public String solution(String[] menus, int[] prices) {
        String answer = menus[0]; // 배열 0에만 있는 경우도 고려해서 작성
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int maxPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                answer = menus[i];
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct53MostExpensive q = new Ct53MostExpensive();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"coffee", "tea", "cake"}, new int[]{4500, 3000, 5500}) + "] / 정답: [cake]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"water"}, new int[]{0}) + "] / 정답: [water]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"a", "b", "c"}, new int[]{100, 100, 50}) + "] / 정답: [a]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"x", "y"}, new int[]{10, 20}) + "] / 정답: [y]");
    }
}