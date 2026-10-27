/*
 * [Ct120] 기준보다 큰 수의 합
 *
 * 문제
 * 정수 배열 nums와 정수 target이 주어집니다.
 * nums에서 target보다 큰 수들만 모두 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums             target   result
 * [1, 5, 3, 8]     4        13      (5 + 8)
 * [1, 2]           5        0
 * [10]             9        10
 * [7, 7, 7]        7        0
 */
public class Ct120BiggerSum {

    public int solution(int[] nums, int target) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                answer+= nums[i];
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct120BiggerSum q = new Ct120BiggerSum();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 5, 3, 8}, 4) + " / 정답: 13");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 2}, 5) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{10}, 9) + " / 정답: 10");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 7, 7}, 7) + " / 정답: 0");
    }
}