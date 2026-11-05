import java.util.Stack;

/*
 * [Ct136] 장부 정리 (3단계 스택 · 하)
 *
 * 문제
 * 장부에 금액을 차례대로 적습니다. 금액이 담긴 정수 배열 nums가 주어집니다.
 * 그런데 0이 나오면 "방금 적은 금액이 잘못됐다"는 뜻이라, 가장 최근에 적은 금액을 지웁니다.
 * 끝까지 정리한 뒤, 장부에 남은 금액의 합을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 0이 나왔을 때 지울 금액은 항상 있습니다.
 *
 * 입출력 예
 * nums                               result
 * [3, 0, 4, 0]                       0
 * [1, 3, 5, 4, 0, 0, 7, 0, 0, 6]     7       (1 + 6)
 * [5]                                5
 * [2, 4, 0]                          2
 */
public class Ct136Zero {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                stack.pop();
            } else {
                stack.push(nums[i]);
            }
        }
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct136Zero q = new Ct136Zero();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 0, 4, 0}) + " / 정답: 0");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 3, 5, 4, 0, 0, 7, 0, 0, 6}) + " / 정답: 7");
        System.out.println("테스트3 결과: " + q.solution(new int[]{5}) + " / 정답: 5");
        System.out.println("테스트4 결과: " + q.solution(new int[]{2, 4, 0}) + " / 정답: 2");
    }
}