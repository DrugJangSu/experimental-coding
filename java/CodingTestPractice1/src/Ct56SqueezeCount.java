import java.util.Stack;

/*
 * [Ct56] 연속 숫자 줄이기 (7단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 연속으로 같은 숫자가 나오면 하나만 남기고 줄였을 때,
 * 남는 숫자가 몇 개인지 return 하도록 solution 메서드를 완성하세요.
 * (떨어져서 다시 나온 숫자는 따로 셉니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 *
 * 입출력 예
 * nums                     result
 * [1, 1, 3, 3, 0, 1, 1]    4        → [1, 3, 0, 1]
 * [4, 4, 4, 3, 3]          2        → [4, 3]
 * [7]                      1        → [7]
 * [1, 2, 1, 2]             4        → [1, 2, 1, 2]
 */
public class Ct56SqueezeCount {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 숫자 스택 만들기
        Stack<Integer> stack = new Stack<>();
        // 2. nums를 앞에서부터 하나씩 보면서
        for (int i = 0; i < nums.length; i++) {
        //    - 스택이 비어 있으면           → push
            if (stack.isEmpty()) {
                stack.push(nums[i]);
            } else {
        //    - 비어 있지 않으면              → 맨 위(peek)와 지금 숫자가 "다를 때만" push
                if (stack.peek() != nums[i]) {
                    stack.push(nums[i]);
                }
            }
        }
        // 3. 스택에 남은 개수를 answer에 담기
        answer = stack.size();

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct56SqueezeCount q = new Ct56SqueezeCount();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 1, 3, 3, 0, 1, 1}) + " / 정답: 4");
        System.out.println("테스트2 결과: " + q.solution(new int[]{4, 4, 4, 3, 3}) + " / 정답: 2");
        System.out.println("테스트3 결과: " + q.solution(new int[]{7}) + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(new int[]{1, 2, 1, 2}) + " / 정답: 4");
    }
}