import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct140] 맨 뒤로 보내기 (3단계 큐 · 하)
 *
 * 문제
 * 정수 배열 nums의 숫자를 앞에서부터 차례대로 큐에 넣습니다.
 * "맨 앞 숫자를 꺼내서 맨 뒤에 다시 넣기"를 k번 반복한 뒤,
 * 맨 앞에 있는 숫자를 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums            k    result
 * [1, 2, 3, 4]    1    2       (줄: 2, 3, 4, 1)
 * [1, 2, 3, 4]    2    3       (줄: 3, 4, 1, 2)
 * [5]             3    5
 * [7, 8, 9]       4    8       (한 바퀴 돌고 한 번 더)
 */
public class Ct140QueueRotate {

    public int solution(int[] nums, int k) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            queue.offer(queue.poll());
        }
        answer = queue.poll();

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct140QueueRotate q = new Ct140QueueRotate();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3, 4}, 1) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 2, 3, 4}, 2) + " / 정답: 3");
        System.out.println("테스트3 결과: " + q.solution(new int[]{5}, 3) + " / 정답: 5");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 8, 9}, 4) + " / 정답: 8");
    }
}