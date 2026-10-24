import java.util.Arrays;

/*
 * [Ct43] 내림차순 정렬 (6단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums를 큰 수부터 작은 수 순서(내림차순)로 정렬한 배열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 *
 * 입출력 예
 * nums            result
 * [3, 1, 2]       [3, 2, 1]
 * [5]             [5]
 * [4, 4, 1, 9]    [9, 4, 4, 1]
 * [0, 10, 5]      [10, 5, 0]
 */
public class Ct43SortDesc {

    public int[] solution(int[] nums) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Arrays.sort(nums);
        int [] answer = new int [nums.length];
        int dex = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            answer[dex] = nums[i];
            dex++;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct43SortDesc q = new Ct43SortDesc();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{3, 1, 2})) + " / 정답: [3, 2, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5})) + " / 정답: [5]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{4, 4, 1, 9})) + " / 정답: [9, 4, 4, 1]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{0, 10, 5})) + " / 정답: [10, 5, 0]");
    }
}