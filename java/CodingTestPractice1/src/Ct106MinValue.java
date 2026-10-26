/*
 * [Ct106] 가장 작은 수 (복습 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 가장 작은 수를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - -100 ≤ nums의 원소 ≤ 100
 *
 * 입출력 예
 * nums            result
 * [3, 1, 2]       1
 * [5]             5
 * [-1, -5, 0]     -5
 * [7, 7]          7
 */
public class Ct106MinValue {

    public int solution(int[] nums) {
        int answer = nums[0];
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < answer) {
                answer = nums[i];
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct106MinValue q = new Ct106MinValue();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 1, 2}) + " / 정답: 1");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5}) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{-1, -5, 0}) + " / 정답: -5");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 7}) + " / 정답: 7");
    }
}