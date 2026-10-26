/*
 * [Ct107] 가장 작은 수의 위치 (복습 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 가장 작은 수가 있는 칸 번호(인덱스)를 return 하도록 solution 메서드를 완성하세요.
 * 가장 작은 수가 여러 개면, 그중 가장 앞에 있는 칸 번호를 return 합니다.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 *
 * 입출력 예
 * nums            result
 * [3, 1, 2]       1
 * [5]             0
 * [-1, -5, 0]     1
 * [7, 7]          0
 */
public class Ct107MinIndex {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[answer]) {
                answer = i;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct107MinIndex q = new Ct107MinIndex();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 1, 2}) + " / 정답: 1");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5}) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{-1, -5, 0}) + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 7}) + " / 정답: 0");
    }
}