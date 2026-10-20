/*
 * [Ct04] 놀이공원 입장료 (1단계 · 중)
 *
 * 문제
 * 나이 age가 주어질 때, 아래 요금표에 따라 입장료를
 * return 하도록 solution 메서드를 완성하세요.
 *
 *   - 7세 이하       : 0원
 *   - 8세 ~ 19세     : 5000원
 *   - 20세 ~ 64세    : 10000원
 *   - 65세 이상      : 3000원
 *
 * 제한사항
 * - 0 ≤ age ≤ 120
 *
 * 입출력 예
 * age   result
 * 7     0
 * 8     5000
 * 19    5000
 * 20    10000
 * 64    10000
 * 65    3000
 */
public class Ct04Ticket {

    public int solution(int age) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        if (age <= 7) {
            answer = 0;
        } else if (age >= 8 && age <= 19) {
            answer = 5000;
        } else if (age >= 20 && age <= 64) {
            answer = 10000;
        } else if (age >= 65) {
            answer = 3000;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct04Ticket q = new Ct04Ticket();
        System.out.println("테스트1 결과: " + q.solution(7) + " / 정답: 0");
        System.out.println("테스트2 결과: " + q.solution(8) + " / 정답: 5000");
        System.out.println("테스트3 결과: " + q.solution(19) + " / 정답: 5000");
        System.out.println("테스트4 결과: " + q.solution(20) + " / 정답: 10000");
        System.out.println("테스트5 결과: " + q.solution(64) + " / 정답: 10000");
        System.out.println("테스트6 결과: " + q.solution(65) + " / 정답: 3000");
    }
}