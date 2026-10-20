/*
 * [Ct01] 카페 총액 (1단계 · 하)
 *
 * 문제
 * 아메리카노 한 잔 가격 price와 잔 수 count가 주어질 때,
 * 총 금액을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ price ≤ 10,000
 * - 1 ≤ count ≤ 100
 *
 * 입출력 예
 * price   count   result
 * 4500    2       9000
 * 3000    5       15000
 */
public class Ct01CafeTotal {

    public int solution(int price, int count) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓



        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct01CafeTotal q = new Ct01CafeTotal();
        System.out.println("테스트1 결과: " + q.solution(4500, 2) + " / 정답: 9000");
        System.out.println("테스트2 결과: " + q.solution(3000, 5) + " / 정답: 15000");
    }
}