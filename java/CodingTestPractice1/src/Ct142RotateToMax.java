import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct142] 제일 큰 수가 맨 앞에 올 때까지 (3단계 큐 · 중하)
 *
 * 문제
 * 정수 배열 nums의 숫자를 앞에서부터 차례대로 큐에 넣습니다.
 * 맨 앞 숫자가 "큐에서 가장 큰 숫자"가 될 때까지
 * 맨 앞 숫자를 꺼내서 맨 뒤로 보내는 걸 반복합니다.
 * 몇 번 보냈는지 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums            result
 * [2, 1, 3, 2]    2       (2를 뒤로, 1을 뒤로 → 3, 2, 2, 1)
 * [3, 1, 2]       0       (처음부터 3이 맨 앞)
 * [1, 1, 9, 1]    2
 * [5]             0
 */
public class Ct142RotateToMax {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        while (max != queue.peek()) {
            queue.offer(queue.poll());
            answer++;
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct142RotateToMax q = new Ct142RotateToMax();
        System.out.println("테스트1 결과: " + q.solution(new int[]{2, 1, 3, 2}) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{3, 1, 2}) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{1, 1, 9, 1}) + " / 정답: 2");
        System.out.println("테스트4 결과: " + q.solution(new int[]{5}) + " / 정답: 0");
    }
}