import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct148] 번호표 줄 (3단계 큐 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 큐에 nums의 "값"이 아니라 "칸 번호"(0, 1, 2, ...)를 차례대로 세웁니다.
 * 그다음 큐에서 번호를 k번 꺼내면서, 그 번호 칸에 들어 있는 값을 모두 더해
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums             k    result
 * [10, 20, 30]     2    30      (번호 0, 1 → 10 + 20)
 * [5]              1    5
 * [1, 2, 3, 4]     4    10
 * [7, 3]           1    7
 */
public class Ct148QueueIndex {

    public int solution(int[] nums, int k) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Queue<Integer> queue = new LinkedList<>();
//        for (int num : nums) {
//            queue.offer(num);
//        }
        for (int i = 0; i < nums.length; i++) {
            queue.offer(i);
        }
        for (int i = 0; i < k; i++) {
//            answer += queue.poll();
            int idx = queue.poll();
            answer += nums[idx];
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct148QueueIndex q = new Ct148QueueIndex();
        System.out.println("테스트1 결과: " + q.solution(new int[]{10, 20, 30}, 2) + " / 정답: 30");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5}, 1) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{1, 2, 3, 4}, 4) + " / 정답: 10");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 3}, 1) + " / 정답: 7");
    }
}