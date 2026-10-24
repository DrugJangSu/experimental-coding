import java.util.Arrays;

/*
 * [Ct44] 상위 k개 (6단계 · 중)
 *
 * 문제
 * 정수 배열 nums와 정수 k가 주어집니다.
 * nums에서 가장 큰 수부터 k개를, 큰 순서대로 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 1 ≤ k ≤ nums의 길이
 *
 * 입출력 예
 * nums            k    result
 * [5, 1, 9, 3]    2    [9, 5]
 * [5, 1, 9, 3]    4    [9, 5, 3, 1]
 * [7]             1    [7]
 * [2, 8, 8, 4]    3    [8, 8, 4]
 */
public class Ct44TopK {

    public int[] solution(int[] nums, int k) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 내림차순 배열(desc) 만들기 (Ct43 양식 그대로)
        Arrays.sort(nums); // 일단 배열 오름차순 정리.
        int [] desc = new int [nums.length];
        int dex = 0;
        for (int i = nums.length -1; i >= 0; i--) {
            desc [dex] = nums[i];
            dex++;
        }
        // 2. k칸짜리 answer를 만들고, desc의 앞에서부터 k개를 옮기기
        // answer도 배열이겠네...
        int [] answer = new int [k];
        for (int i = 0; i < k; i++) { // 이번엔 오름차순으로 해야겠지..?
            answer[i] = desc[i];
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct44TopK q = new Ct44TopK();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{5, 1, 9, 3}, 2)) + " / 정답: [9, 5]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5, 1, 9, 3}, 4)) + " / 정답: [9, 5, 3, 1]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{7}, 1)) + " / 정답: [7]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{2, 8, 8, 4}, 3)) + " / 정답: [8, 8, 4]");
    }
}