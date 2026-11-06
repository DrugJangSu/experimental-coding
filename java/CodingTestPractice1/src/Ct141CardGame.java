import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct141] 카드 버리기 (3단계 큐 · 중하)
 *
 * 문제
 * 1번부터 n번까지의 카드가 1번이 맨 위에 오도록 순서대로 쌓여 있습니다.
 * 카드가 한 장 남을 때까지 아래 동작을 반복합니다.
 *   1. 맨 위 카드를 버린다.
 *   2. 그다음 맨 위 카드를 맨 아래로 옮긴다.
 * 마지막에 남는 카드의 번호를 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * n    result
 * 4    4       (1,2,3,4 → 버림1 → 2를 아래로 → 3,4,2 → 버림3 → 4를 아래로 → 2,4 → 버림2 → 4)
 * 6    4
 * 1    1
 * 7    6
 */
public class Ct141CardGame {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        answer = queue.poll();
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct141CardGame q = new Ct141CardGame();
        System.out.println("테스트1 결과: " + q.solution(4) + " / 정답: 4");
        System.out.println("테스트2 결과: " + q.solution(6) + " / 정답: 4");
        System.out.println("테스트3 결과: " + q.solution(1) + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(7) + " / 정답: 6");
    }
}