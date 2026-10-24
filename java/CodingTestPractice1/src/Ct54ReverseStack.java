import java.util.Arrays;
import java.util.Stack;

/*
 * [Ct54] 스택으로 뒤집기 (7단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 스택을 이용해서 nums의 순서를 거꾸로 뒤집은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 *
 * 입출력 예
 * nums         result
 * [1, 2, 3]    [3, 2, 1]
 * [5]          [5]
 * [4, 9]       [9, 4]
 * [7, 7, 1]    [1, 7, 7]
 */
public class Ct54ReverseStack {

    public int[] solution(int[] nums) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 숫자 스택 만들기
        Stack<Integer> stack = new Stack<>(); // 어우 스택은 처음이야...그냥 Array 비슷하게 생각하고 해야겠네
        // 2. nums를 앞에서부터 하나씩 push (접시 쌓기)
        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]); // 이렇게 하면 되나?
        }
        // 3. nums 길이만큼 계란판(answer) 만들기
        int [] answer = new int [nums.length]; // 계란판? 이것도 배열 만들면 돼? Integer로?
        // 4. answer의 0번 칸부터 차례로, pop()으로 꺼낸 값을 넣기
        // 이것도 for문 작성해야되나... stack 개념이면 LIFO 방식이겠네
        for (int i = 0; i < nums.length; i++) {
            answer[i] = stack.pop(); // ????? 이건가? pop이라며
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct54ReverseStack q = new Ct54ReverseStack();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3})) + " / 정답: [3, 2, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5})) + " / 정답: [5]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{4, 9})) + " / 정답: [9, 4]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{7, 7, 1})) + " / 정답: [1, 7, 7]");
    }
}