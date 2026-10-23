import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct19] 짝수만 골라 담기 (4단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums에서 값이 짝수인 원소만 순서대로 골라 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (짝수가 하나도 없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 *
 * 입출력 예
 * nums                  result
 * [1, 2, 3, 4, 5, 6]    [2, 4, 6]
 * [1, 3, 5]             []
 * [8]                   [8]
 * [0, 7, 10]            [0, 10]
 */
public class Ct19PickEven {

    public int[] solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();   // 골라 담을 장바구니
        // ↓↓↓ 여기에 코드 작성 (list에 골라 담기) ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                list.add(nums[i]);
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑

        // 장바구니(list) → 배열(answer)로 옮기기 (이번엔 수정하지 않기)
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct19PickEven q = new Ct19PickEven();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3, 4, 5, 6})) + " / 정답: [2, 4, 6]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{1, 3, 5})) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{8})) + " / 정답: [8]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{0, 7, 10})) + " / 정답: [0, 10]");
    }
}