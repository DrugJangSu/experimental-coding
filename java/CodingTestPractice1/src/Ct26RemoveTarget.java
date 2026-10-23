import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct26] 특정 숫자 빼기 (4단계 · 중)
 *
 * 문제
 * 정수 배열 nums와 정수 target이 주어집니다.
 * nums에서 target과 같은 값을 모두 빼고, 나머지를 순서대로 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (남는 값이 없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소, target ≤ 1,000
 *
 * 입출력 예
 * nums               target   result
 * [1, 2, 3, 2, 4]    2        [1, 3, 4]
 * [5, 5, 5]          5        []
 * [7, 8]             9        [7, 8]
 * [0, 1, 0]          0        [1]
 */
public class Ct26RemoveTarget {

    public int[] solution(int[] nums, int target) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 먼저 생각하기: 결과 개수를 미리 알 수 있나?
        // ㄴㄴ. 고로... 또 리스트 짜야겠네.
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                list.add(nums[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct26RemoveTarget q = new Ct26RemoveTarget();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3, 2, 4}, 2)) + " / 정답: [1, 3, 4]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5, 5, 5}, 5)) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{7, 8}, 9)) + " / 정답: [7, 8]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{0, 1, 0}, 0)) + " / 정답: [1]");
    }
}