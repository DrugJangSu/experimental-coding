/*
 * [Ct06] 장바구니 총액 (2단계 · 하)
 *
 * 문제
 * 장바구니에 담긴 상품 가격들이 정수 배열 prices로 주어집니다.
 * 모든 상품 가격의 합을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ prices의 길이 ≤ 100
 * - 1 ≤ prices의 원소 ≤ 10,000
 *
 * 입출력 예
 * prices                      result
 * [4500, 3000, 5000]          12500
 * [1000]                      1000
 * [2000, 2000, 2000, 2000]    8000
 */
public class Ct06CartTotal {

    public int solution(int[] prices) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct06CartTotal q = new Ct06CartTotal();
        System.out.println("테스트1 결과: " + q.solution(new int[]{4500, 3000, 5000}) + " / 정답: 12500");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1000}) + " / 정답: 1000");
        System.out.println("테스트3 결과: " + q.solution(new int[]{2000, 2000, 2000, 2000}) + " / 정답: 8000");
    }
}