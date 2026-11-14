/*
 * [Ct155] k번째로 작은 수 (4단계 정렬 · 하)
 *
 * 문제
 * 정수 배열 nums와 정수 k가 주어집니다.
 * nums에서 k번째로 작은 수를 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums            k    result
 * [5, 3, 1, 4]    2    3       (정리하면 1, 3, 4, 5 → 두 번째는 3)
 * [7]             1    7
 * [9, 2, 8]       3    9
 * [4, 4, 1]       2    4       (정리하면 1, 4, 4)
 */
import java.util.Arrays;

public class Ct155KthSmallest {

    public int solution(int[] nums, int k) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Arrays.sort(nums);
        answer = nums[k-1];
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct155KthSmallest q = new Ct155KthSmallest();
        System.out.println("테스트1 결과: " + q.solution(new int[]{5, 3, 1, 4}, 2) + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(new int[]{7}, 1) + " / 정답: 7");
        System.out.println("테스트3 결과: " + q.solution(new int[]{9, 2, 8}, 3) + " / 정답: 9");
        System.out.println("테스트4 결과: " + q.solution(new int[]{4, 4, 1}, 2) + " / 정답: 4");
    }
}