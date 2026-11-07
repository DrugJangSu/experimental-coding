import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct146] 프린터 (LMS 2부 05 · 프로그래머스 Lv.2)
 *
 * 문제
 * 문서들의 중요도가 priorities로, 내가 찾는 문서의 위치(번호)가 location으로 주어집니다.
 * Ct145와 같은 규칙으로 인쇄할 때, 내 문서가 몇 번째로 인쇄되는지
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * priorities            location   result
 * [2, 1, 3, 2]          2          1
 * [1, 1, 9, 1, 1, 1]    0          5
 * [5]                   0          1
 * [2, 1, 3, 2]          0          3
 */
public class Ct146Printer {

    public int solution(int[] priorities, int location) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);                      // ★ 중요도 대신 "번호"를 세움
        }

        int count = 0;                           // 지금까지 인쇄한 개수
        while (!queue.isEmpty()) {
            int now = queue.poll();              // now = 문서 번호

            boolean higher = false;
            for (int other : queue) {
                if (__________) {                // 번호로 중요도를 꺼내서 비교
                    higher = true;
                    break;
                }
            }

            if (higher) {
                queue.offer(now);
            } else {
                count++;                         // 인쇄!
                if (__________) {                // 방금 인쇄한 게 내가 찾던 문서면
                    return count;
                }
            }
        }
        return count;
        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct146Printer q = new Ct146Printer();
        System.out.println("테스트1 결과: " + q.solution(new int[]{2, 1, 3, 2}, 2) + " / 정답: 1");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 1, 9, 1, 1, 1}, 0) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{5}, 0) + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(new int[]{2, 1, 3, 2}, 0) + " / 정답: 3");
    }
}