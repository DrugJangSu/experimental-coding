import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct139] 앞에서 k명 (3단계 큐 · 하)
 *
 * 문제
 * 정수 배열 nums의 숫자를 앞에서부터 차례대로 큐에 넣습니다.
 * 그다음 큐에서 k번 꺼내서, 꺼낸 숫자들의 합을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums               k    result
 * [3, 1, 4, 1, 5]    2    4       (3 + 1)
 * [5]                1    5
 * [1, 2, 3]          3    6
 * [9, 8]             1    9
 */
public class Ct139QueueFront {

    public int solution(int[] nums, int k) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Queue <Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
        for (int i = 0; i < k; i++) {
            answer += queue.poll();
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct139QueueFront q = new Ct139QueueFront();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 1, 4, 1, 5}, 2) + " / 정답: 4");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5}, 1) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{1, 2, 3}, 3) + " / 정답: 6");
        System.out.println("테스트4 결과: " + q.solution(new int[]{9, 8}, 1) + " / 정답: 9");
    }
}