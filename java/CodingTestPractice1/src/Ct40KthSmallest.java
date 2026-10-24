import java.util.Arrays;

/*
 * [Ct40] k번째로 작은 수 (6단계 · 하)
 *
 * 문제
 * 정수 배열 nums와 정수 k가 주어집니다.
 * nums에서 k번째로 작은 수를 return 하도록 solution 메서드를 완성하세요.
 * (k는 1부터 셉니다. k=1이면 가장 작은 수입니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 1 ≤ k ≤ nums의 길이
 *
 * 입출력 예
 * nums            k    result
 * [5, 2, 9, 1]    1    1
 * [5, 2, 9, 1]    3    5
 * [7]             1    7
 * [3, 3, 1]       2    3
 */
public class Ct40KthSmallest {

    public int solution(int[] nums, int k) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 정렬하기
        Arrays.sort(nums);
        // 2. k번째로 작은 수를 answer에 담기
        answer = nums[k-1];

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct40KthSmallest q = new Ct40KthSmallest();
        System.out.println("테스트1 결과: " + q.solution(new int[]{5, 2, 9, 1}, 1) + " / 정답: 1");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5, 2, 9, 1}, 3) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{7}, 1) + " / 정답: 7");
        System.out.println("테스트4 결과: " + q.solution(new int[]{3, 3, 1}, 2) + " / 정답: 3");
    }
}