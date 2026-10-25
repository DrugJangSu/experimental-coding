import java.util.LinkedList;
import java.util.Queue;

/*
 * [Ct60] k번 꺼낸 뒤 맨 앞 (7단계 · 하)
 *
 * 문제
 * 정수 배열 nums와 정수 k가 주어집니다.
 * nums의 숫자를 앞에서부터 차례로 큐에 넣은 뒤, 맨 앞에서 k번 꺼냅니다.
 * 그때 큐의 맨 앞에 있는 숫자를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ k < nums의 길이
 *
 * 입출력 예
 * nums            k    result
 * [1, 2, 3, 4]    1    2
 * [1, 2, 3, 4]    2    3
 * [7]             0    7
 * [5, 9, 2]       2    2
 */
public class Ct60QueueFront {

    public int solution(int[] nums, int k) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 숫자 큐 만들기 (위 양식)
        Queue<Integer> queue = new LinkedList<>(); // 이건... Queue로 안끝나네.
        // 2. nums를 앞에서부터 하나씩 offer
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]); // 이렇게? 큐의 offer는 맨 뒤에 넣는다는 거지?
        }
        // 3. k번 poll -> poll는 맨 앞을 꺼내서 돌려준다는 뜻
//        queue.poll(k); // ... 이게 맞나 에러뜨는거보니까 아닌데
        for (int i = 0; i < k; i++) { // k번이라고 했으니..
            queue.poll(); // 에라이 이것도 괄호안에 아무것도 안들어가네. 근데 이걸 어디어 넣으라고
        }
        // 4. 맨 앞을 보기만 해서(peek) answer에
        answer = queue.peek(); //??? 이렇게???w

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct60QueueFront q = new Ct60QueueFront();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3, 4}, 1) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 2, 3, 4}, 2) + " / 정답: 3");
        System.out.println("테스트3 결과: " + q.solution(new int[]{7}, 0) + " / 정답: 7");
        System.out.println("테스트4 결과: " + q.solution(new int[]{5, 9, 2}, 2) + " / 정답: 2");
    }
}