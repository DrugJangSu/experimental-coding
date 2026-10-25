import java.util.Arrays;
import java.util.Stack;

/*
 * [Ct58] 연속 숫자 지우기 (7단계 · 중)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 연속으로 같은 숫자가 나오면 하나만 남기고 지운 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (남은 숫자들의 순서는 그대로 유지합니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 *
 * 입출력 예
 * nums                     result
 * [1, 1, 3, 3, 0, 1, 1]    [1, 3, 0, 1]
 * [4, 4, 4, 3, 3]          [4, 3]
 * [7]                      [7]
 * [1, 2, 1, 2]             [1, 2, 1, 2]
 */
public class Ct58NoRepeat {

    public int[] solution(int[] nums) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 스택에 쌓기 (Ct56 2번과 똑같음)
        Stack <Integer> stack = new Stack<>(); // 더더욱 익숙해져야될듯
        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (stack.peek() != nums[i]) {
                stack.push(nums[i]);
            }
        }
        // 2. 스택 → 배열로 옮기기 (리스트 → 배열 옮기기 양식에서 list만 stack으로)
        int[] answer = new int [stack.size()]; // 지운 배열을 return해야 되니까 사실상 새로운 배열이 answer인듯
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct58NoRepeat q = new Ct58NoRepeat();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 1, 3, 3, 0, 1, 1})) + " / 정답: [1, 3, 0, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{4, 4, 4, 3, 3})) + " / 정답: [4, 3]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{7})) + " / 정답: [7]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 1, 2})) + " / 정답: [1, 2, 1, 2]");
    }
}