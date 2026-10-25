import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct61] 마지막 남는 카드 (7단계 · 중)
 *
 * 문제
 * 1부터 n까지 번호가 적힌 카드가 1번이 맨 위로 차례대로 쌓여 있습니다.
 * 카드가 한 장 남을 때까지 아래 동작을 반복합니다.
 *   1) 맨 위 카드를 버린다.
 *   2) 그다음 맨 위 카드를 맨 아래로 옮긴다.
 * 마지막에 남는 카드의 번호를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ n ≤ 1,000
 *
 * 입출력 예
 * n    result
 * 1    1
 * 2    2
 * 4    4
 * 6    4
 * 7    6
 */
public class Ct61LastCard {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 1부터 n까지 큐에 넣기
        Queue<Integer> queue = new LinkedList<>(); // 새로운 큐 생성
        for (int i = 1; i <= n; i++) { // 1부터 n까지니깐...
            queue.offer(i);
        }
        // 2. 큐에 2장 이상 남아 있는 동안 반복 (while) // while..??
        while (queue.size() >= 2) { // 뭐야 빨간줄 미친듯이 떠
        //    - 맨 앞 카드 버리기
            queue.poll(); // <- 이거... 맞나??
        //    - 그다음 맨 앞 카드를 꺼내서 맨 뒤에 넣기
            queue.offer(queue.poll()); // ????????
        }

        // 3. 남은 한 장을 answer에
        // 몰것다 쉬발
        answer = queue.peek();

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct61LastCard q = new Ct61LastCard();
        System.out.println("테스트1 결과: " + q.solution(1) + " / 정답: 1");
        System.out.println("테스트2 결과: " + q.solution(2) + " / 정답: 2");
        System.out.println("테스트3 결과: " + q.solution(4) + " / 정답: 4");
        System.out.println("테스트4 결과: " + q.solution(6) + " / 정답: 4");
        System.out.println("테스트5 결과: " + q.solution(7) + " / 정답: 6");
    }
}