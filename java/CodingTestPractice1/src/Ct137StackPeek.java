import java.util.Stack;

/*
 * [Ct137] 맨 위에 뭐가 있나 (3단계 스택 · 하)
 *
 * 문제
 * 정수 배열 nums의 숫자를 앞에서부터 차례대로 스택에 넣습니다.
 * 다 넣은 뒤, 스택 맨 위에 있는 숫자를 return 하도록 solution 메서드를 완성하세요.
 * (peek()은 맨 위를 빼지 않고 보기만 하는 도구예요.)
 *
 * 입출력 예
 * nums         result
 * [1, 2, 3]    3
 * [5]          5
 * [9, 4]       4
 * [7, 7, 1]    1
 */
public class Ct137StackPeek {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
        }
        answer = stack.pop();
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct137StackPeek q = new Ct137StackPeek();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3}) + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5}) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{9, 4}) + " / 정답: 4");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 7, 1}) + " / 정답: 1");
    }
}