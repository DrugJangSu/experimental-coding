import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct144] 두 배로 만들어 뒤로 (3단계 큐 · 하)
 *
 * 문제
 * 정수 배열 nums의 숫자를 앞에서부터 차례대로 큐에 넣습니다.
 * "맨 앞 숫자를 꺼내서, 2배로 만든 다음 맨 뒤에 넣기"를 k번 반복한 뒤
 * 맨 앞 숫자를 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums         k    result
 * [1, 2, 3]    1    2       (줄: 2, 3, 2)
 * [1, 2, 3]    2    3       (줄: 3, 2, 4)
 * [5]          3    40      (5 → 10 → 20 → 40)
 * [4, 1]       3    2       (줄: 2, 16)
 */
public class Ct144DoubleBack {

    public int solution(int[] nums, int k) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            queue.offer(num);
        }
        for (int i = 0; i < k; i++) {
            queue.offer(2 * queue.poll());
        }
        answer = queue.poll();
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct144DoubleBack q = new Ct144DoubleBack();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3}, 1) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 2, 3}, 2) + " / 정답: 3");
        System.out.println("테스트3 결과: " + q.solution(new int[]{5}, 3) + " / 정답: 40");
        System.out.println("테스트4 결과: " + q.solution(new int[]{4, 1}, 3) + " / 정답: 2");
    }
}