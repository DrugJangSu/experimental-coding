import java.util.Arrays;

/*
 * [Ct156] 정렬로 최댓값과 최솟값의 차이 (4단계 정렬 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 가장 큰 수에서 가장 작은 수를 뺀 값을 return 하도록 solution 메서드를 완성하세요.
 * 단, 이번엔 반복문 대신 Arrays.sort를 써 보세요.
 *
 * 입출력 예
 * nums                 result
 * [3, 1, 4, 1, 5]      4       (정리하면 1, 1, 3, 4, 5 → 5 - 1)
 * [7]                  0
 * [-2, 5]              7
 * [10, 10]             0
 */
public class Ct156SortGap {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Arrays.sort(nums);
        answer = nums[nums.length - 1] - nums[0];

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct156SortGap q = new Ct156SortGap();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 1, 4, 1, 5}) + " / 정답: 4");
        System.out.println("테스트2 결과: " + q.solution(new int[]{7}) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{-2, 5}) + " / 정답: 7");
        System.out.println("테스트4 결과: " + q.solution(new int[]{10, 10}) + " / 정답: 0");
    }
}