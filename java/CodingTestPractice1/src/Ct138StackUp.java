import java.util.Stack;

/*
 * [Ct138] 계단 쌓기 (3단계 스택 · 하)
 *
 * 문제
 * 정수 배열 nums의 숫자를 앞에서부터 하나씩 봅니다.
 * 첫 번째 숫자는 무조건 스택에 넣고,
 * 그다음부터는 "지금 숫자가 스택 맨 위 숫자보다 클 때만" 스택에 넣습니다.
 * 다 본 뒤 스택에 들어 있는 숫자의 개수를 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums            result
 * [1, 3, 2, 5]    3       (1, 3, 5)
 * [5, 4, 3]       1       (5)
 * [1, 2, 3]       3       (1, 2, 3)
 * [2, 2]          1       (2)
 */
public class Ct138StackUp {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > stack.peek()) {
                stack.push(nums[i]);
            }
        }
        answer = stack.size();
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct138StackUp q = new Ct138StackUp();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 3, 2, 5}) + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5, 4, 3}) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(new int[]{1, 2, 3}) + " / 정답: 3");
        System.out.println("테스트4 결과: " + q.solution(new int[]{2, 2}) + " / 정답: 1");
    }
}