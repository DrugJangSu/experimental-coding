/*
 * [Ct18] 짝수 칸 더하기 (워밍업 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 인덱스가 짝수(0, 2, 4, ...)인 칸의 값만 모두 더한 값을
 * return 하도록 solution 메서드를 완성하세요.
 * (인덱스는 0부터 셉니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 *
 * 입출력 예
 * nums               result
 * [1, 2, 3, 4, 5]    9
 * [10, 20]           10
 * [7]                7
 * [0, 100, 0, 100]   0
 */
public class Ct18EvenIndexSum {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                answer += nums[i];
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct18EvenIndexSum q = new Ct18EvenIndexSum();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3, 4, 5}) + " / 정답: 9");
        System.out.println("테스트2 결과: " + q.solution(new int[]{10, 20}) + " / 정답: 10");
        System.out.println("테스트3 결과: " + q.solution(new int[]{7}) + " / 정답: 7");
        System.out.println("테스트4 결과: " + q.solution(new int[]{0, 100, 0, 100}) + " / 정답: 0");
    }
}