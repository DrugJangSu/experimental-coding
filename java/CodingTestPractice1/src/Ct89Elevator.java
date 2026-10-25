/*
 * [Ct89] 엘리베이터 (11단계 · 하)
 *
 * 문제
 * 1층부터 10층까지 있는 건물에서, 엘리베이터가 1층에 서 있습니다.
 * 이동 명령이 정수 배열 moves로 주어지고, 앞에서부터 차례로 처리합니다.
 *   - 양수 : 그 수만큼 올라감
 *   - 음수 : 그 수만큼 내려감
 *   단, 이동한 결과가 1층보다 아래이거나 10층보다 위라면 그 명령은 무시합니다.
 * 모든 명령을 처리한 뒤 엘리베이터가 있는 층을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ moves의 길이 ≤ 100
 *
 * 입출력 예
 * moves         result
 * [3, -2]       2        (1 → 4 → 2)
 * [-1]          1        (0층은 없으니 무시)
 * [5, 5, 1]     7        (1 → 6 → 11은 무시 → 7)
 * [9, 1]        10       (1 → 10 → 11은 무시)
 */
public class Ct89Elevator {

    public int solution(int[] moves) {
        int answer = 1;     // 지금 층 (1층에서 시작)
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < moves.length; i++) {
            if (answer + moves[i] <= 10 && answer + moves[i] >= 1) {
                answer += moves[i];
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct89Elevator q = new Ct89Elevator();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, -2}) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{-1}) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(new int[]{5, 5, 1}) + " / 정답: 7");
        System.out.println("테스트4 결과: " + q.solution(new int[]{9, 1}) + " / 정답: 10");
    }
}