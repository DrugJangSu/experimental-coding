import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct21] 3의 배수 골라 담기 (4단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums에서 3의 배수인 원소만 순서대로 골라 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (3의 배수가 하나도 없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 * - 0도 3의 배수입니다.
 *
 * 입출력 예
 * nums               result
 * [1, 3, 6, 7, 9]    [3, 6, 9]
 * [1, 2, 4]          []
 * [0, 3]             [0, 3]
 * [30]               [30]
 */
public class Ct21PickThree {

    public int[] solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // ↓↓↓ 여기에 코드 작성 (골라 담기 + 옮기기 전부) ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
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
        Ct21PickThree q = new Ct21PickThree();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 3, 6, 7, 9})) + " / 정답: [3, 6, 9]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 4})) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{0, 3})) + " / 정답: [0, 3]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{30})) + " / 정답: [30]");
    }
}