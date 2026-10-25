import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct62] 줄 돌리기 (7단계 · 중)
 *
 * 문제
 * 정수 배열 nums와 정수 k가 주어집니다.
 * nums를 앞에서부터 차례로 큐에 넣은 뒤,
 * "맨 앞을 꺼내서 맨 뒤로 보내기"를 k번 합니다.
 * 그 뒤 큐의 앞에서부터 순서대로 담은 배열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ k ≤ 1,000
 *
 * 입출력 예
 * nums            k    result
 * [1, 2, 3, 4]    1    [2, 3, 4, 1]
 * [1, 2, 3, 4]    3    [4, 1, 2, 3]
 * [5]             3    [5]
 * [7, 8]          2    [7, 8]
 */
public class Ct62Rotate {

    public int[] solution(int[] nums, int k) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. nums를 큐에 넣기
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
        // 2. k번 반복: 맨 앞을 꺼내서 맨 뒤로  (Ct61의 그 한 줄)
        for (int i = 0; i < k; i++) {
            queue.offer(queue.poll());
        }
        // 3. 큐 → 배열
        //    - 큐 크기를 먼저 변수에 저장해 두기
        //    - 그 횟수만큼 poll해서 answer[i]에 넣기
        int size = queue.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = queue.poll();
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct62Rotate q = new Ct62Rotate();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3, 4}, 1)) + " / 정답: [2, 3, 4, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3, 4}, 3)) + " / 정답: [4, 1, 2, 3]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{5}, 3)) + " / 정답: [5]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{7, 8}, 2)) + " / 정답: [7, 8]");
    }
}