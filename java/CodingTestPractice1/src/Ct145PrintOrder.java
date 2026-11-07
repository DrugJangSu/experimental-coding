import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct145] 프린터 출력 순서 (3단계 큐 · 중, 재도전)
 *
 * 문제
 * 인쇄 대기 중인 문서들의 중요도가 정수 배열 priorities로 주어집니다.
 * 아래 규칙으로 인쇄할 때, 인쇄되는 중요도를 순서대로 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 *   1. 맨 앞 문서를 꺼낸다.
 *   2. 줄에 남은 문서 중 이것보다 중요도가 높은 게 하나라도 있으면 → 맨 뒤로 보낸다.
 *   3. 없으면 → 인쇄한다.
 *
 * 입출력 예
 * priorities             result
 * [2, 1, 3, 2]           [3, 2, 2, 1]
 * [1, 1, 9, 1, 1, 1]     [9, 1, 1, 1, 1, 1]
 * [5]                    [5]
 * [1, 2, 3]              [3, 2, 1]
 */
public class Ct145PrintOrder {

    public int[] solution(int[] priorities) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();          // 꺼낸 문서를 now에 들고 있기
            boolean higher = false;
            for (int other : queue) {
                if (other > now) {
                    higher = true;
                    break;
                }
            }

            if (higher) {
                queue.offer(now);                  // 들고 있는 now를 맨 뒤로
            } else {
                result.add(now);                  // 들고 있는 now를 인쇄 목록에
            }
        }

        // 리스트 → 배열 (양식 ①) 직접 쓰기
        int [] answer = new int [result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] += result.get(i);
        }
        return answer;
        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct145PrintOrder q = new Ct145PrintOrder();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{2, 1, 3, 2})) + " / 정답: [3, 2, 2, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{1, 1, 9, 1, 1, 1})) + " / 정답: [9, 1, 1, 1, 1, 1]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{5})) + " / 정답: [5]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3})) + " / 정답: [3, 2, 1]");
    }
}