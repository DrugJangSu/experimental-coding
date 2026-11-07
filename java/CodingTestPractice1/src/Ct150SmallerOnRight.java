import java.util.Arrays;

/*
 * [Ct150] 내 오른쪽에 나보다 작은 수 (3단계 준비 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 각 칸마다 "자기보다 오른쪽에 있는 수 중 자기보다 작은 수가 몇 개인지" 세어
 * 같은 길이의 배열로 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums         result
 * [3, 1, 2]    [2, 0, 0]
 * [1, 2, 3]    [0, 0, 0]
 * [3, 2, 1]    [2, 1, 0]
 * [2, 2]       [0, 0]       (같은 건 작은 게 아님)
 */
public class Ct150SmallerOnRight {

    public int[] solution(int[] nums) {
        int[] answer = new int[nums.length];    // 처음엔 전부 0
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    answer[i]++;
                }
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct150SmallerOnRight q = new Ct150SmallerOnRight();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{3, 1, 2})) + " / 정답: [2, 0, 0]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3})) + " / 정답: [0, 0, 0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{3, 2, 1})) + " / 정답: [2, 1, 0]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{2, 2})) + " / 정답: [0, 0]");
    }
}