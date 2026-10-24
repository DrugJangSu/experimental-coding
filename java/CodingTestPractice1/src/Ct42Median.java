import java.util.Arrays;

/*
 * [Ct42] 중앙값 (6단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums를 작은 순으로 정렬했을 때 정확히 가운데에 있는 값(중앙값)을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - nums의 길이는 홀수입니다. (1, 3, 5, ...)
 * - 1 ≤ nums의 길이 ≤ 99
 *
 * 입출력 예
 * nums               result
 * [9, 1, 5]          5
 * [3]                3
 * [7, 2, 8, 1, 4]    4
 * [5, 5, 1]          5
 */
public class Ct42Median {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Arrays.sort(nums); // 이번엔 내림차순????
        int [] desc = new int [nums.length];
        int idx = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            desc[idx] = nums[i];
            idx++;
        }
        answer = desc[desc.length/2];
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct42Median q = new Ct42Median();
        System.out.println("테스트1 결과: " + q.solution(new int[]{9, 1, 5}) + " / 정답: 5");
        System.out.println("테스트2 결과: " + q.solution(new int[]{3}) + " / 정답: 3");
        System.out.println("테스트3 결과: " + q.solution(new int[]{7, 2, 8, 1, 4}) + " / 정답: 4");
        System.out.println("테스트4 결과: " + q.solution(new int[]{5, 5, 1}) + " / 정답: 5");
    }
}