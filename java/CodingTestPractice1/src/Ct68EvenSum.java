/*
 * [Ct68] 짝수만 더하기 (복습 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums에 있는 짝수들의 합을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 *
 * 입출력 예
 * nums            result
 * [1, 2, 3, 4]    6
 * [1, 3]          0
 * [10]            10
 * [2, 2, 5]       4
 */
public class Ct68EvenSum {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                answer += nums[i];
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct68EvenSum q = new Ct68EvenSum();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3, 4}) + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 3}) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{10}) + " / 정답: 10");
        System.out.println("테스트4 결과: " + q.solution(new int[]{2, 2, 5}) + " / 정답: 4");
    }
}