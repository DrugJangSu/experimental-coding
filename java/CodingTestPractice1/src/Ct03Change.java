/*
 * [Ct03] 거스름돈 (1단계 · 중)
 *
 * 문제
 * 메뉴 가격 price와 손님이 낸 돈 money가 주어집니다.
 * 낸 돈이 충분하면 거스름돈을, 부족하면 -1을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ price ≤ 100,000
 * - 1 ≤ money ≤ 100,000
 *
 * 입출력 예
 * price   money   result
 * 4500    5000    500
 * 4500    4500    0
 * 4500    3000    -1
 */
public class Ct03Change {

    public int solution(int price, int money) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        if (money >= price) {
            answer = money - price;
        } else {
            answer = -1;
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct03Change q = new Ct03Change();
        System.out.println("테스트1 결과: " + q.solution(4500, 5000) + " / 정답: 500");
        System.out.println("테스트2 결과: " + q.solution(4500, 4500) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(4500, 3000) + " / 정답: -1");
    }
}