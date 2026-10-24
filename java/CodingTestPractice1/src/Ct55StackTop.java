import java.util.Stack;

/*
 * [Ct55] k번 꺼낸 뒤 맨 위 (7단계 · 하)
 *
 * 문제
 * 정수 배열 nums와 정수 k가 주어집니다.
 * nums의 숫자를 앞에서부터 차례로 스택에 쌓은 뒤, 맨 위에서 k번 꺼냅니다.
 * 그때 스택의 맨 위에 있는 숫자를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ k < nums의 길이 (꺼내고 나서도 최소 1개는 남습니다)
 *
 * 입출력 예
 * nums            k    result
 * [1, 2, 3, 4]    1    3
 * [1, 2, 3, 4]    2    2
 * [7]             0    7
 * [5, 9, 2]       2    5
 */
public class Ct55StackTop {

    public int solution(int[] nums, int k) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 숫자 스택 만들기
        Stack<Integer> stack = new Stack<>();
        // 2. nums를 앞에서부터 하나씩 push  (Ct54와 같음)
        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
        }
        // 3. k번 pop  (반복문으로 k번)
        for (int i = 0; i < k; i++) {
            stack.pop();
        }
        // 4. 맨 위를 보기만 해서(peek) answer에 담기
        answer = stack.peek();

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct55StackTop q = new Ct55StackTop();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3, 4}, 1) + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 2, 3, 4}, 2) + " / 정답: 2");
        System.out.println("테스트3 결과: " + q.solution(new int[]{7}, 0) + " / 정답: 7");
        System.out.println("테스트4 결과: " + q.solution(new int[]{5, 9, 2}, 2) + " / 정답: 5");
    }
}