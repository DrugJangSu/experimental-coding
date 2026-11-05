import java.util.Arrays;
import java.util.Stack;

/*
 * [Ct135] 스택으로 배열 뒤집기 (3단계 스택 · 하)
 *
 * 문제
 * 정수 배열 arr가 주어집니다.
 * 스택을 이용해 arr를 거꾸로 뒤집은 배열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * arr             result
 * [1, 2, 3]       [3, 2, 1]
 * [5]             [5]
 * [4, 8, 1, 9]    [9, 1, 8, 4]
 * [0, 0, 1]       [1, 0, 0]
 */
public class Ct135StackReverseArray {

    public int[] solution(int[] arr) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        int [] answer = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = stack.pop();
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct135StackReverseArray q = new Ct135StackReverseArray();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3})) + " / 정답: [3, 2, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5})) + " / 정답: [5]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{4, 8, 1, 9})) + " / 정답: [9, 1, 8, 4]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{0, 0, 1})) + " / 정답: [1, 0, 0]");
    }
}