/*
 * [Ct121] 기준보다 큰 수들의 평균
 *
 * 문제
 * 정수 배열 nums와 정수 target이 주어집니다.
 * nums에서 target보다 큰 수들의 평균을 return 하도록 solution 메서드를 완성하세요.
 * (평균은 소수점 아래를 버린 정수입니다.)
 * target보다 큰 수가 하나도 없으면 0을 return 합니다.
 *
 * 입출력 예
 * nums             target   result
 * [1, 5, 3, 8]     4        6       ((5 + 8) / 2 = 6)
 * [1, 2]           5        0       (큰 수 없음)
 * [10]             9        10
 * [7, 8, 9]        7        8       ((8 + 9) / 2 = 8)
 */
public class Ct121BiggerAverage {

    public int solution(int[] nums, int target) {
        int answer = 0;
        int total = 0;
        int count = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                total += nums[i];
                count++;
            }
        }
        if (count > 0) {
            answer = total / count;

        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct121BiggerAverage q = new Ct121BiggerAverage();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 5, 3, 8}, 4) + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 2}, 5) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{10}, 9) + " / 정답: 10");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 8, 9}, 7) + " / 정답: 8");
    }
}