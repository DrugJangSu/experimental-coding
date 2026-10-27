/*
 * [Ct123] 최댓값과 최솟값의 차이
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 가장 큰 수에서 가장 작은 수를 뺀 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums                 result
 * [3, 1, 4, 1, 5]      4       (5 - 1)
 * [7]                  0       (7 - 7)
 * [-2, 5]              7       (5 - (-2))
 * [10, 10]             0
 */
public class Ct123MaxMinGap {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        if (max == min) {
            answer = 0;
        } else {
            answer = max - min;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct123MaxMinGap q = new Ct123MaxMinGap();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 1, 4, 1, 5}) + " / 정답: 4");
        System.out.println("테스트2 결과: " + q.solution(new int[]{7}) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{-2, 5}) + " / 정답: 7");
        System.out.println("테스트4 결과: " + q.solution(new int[]{10, 10}) + " / 정답: 0");
    }
}