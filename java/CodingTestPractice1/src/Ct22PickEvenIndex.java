import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct22] 짝수 칸 골라 담기 (4단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 인덱스가 짝수(0, 2, 4, ...)인 칸의 원소만 순서대로 골라 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (인덱스는 0부터 셉니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 *
 * 입출력 예
 * nums                    result
 * [10, 20, 30, 40, 50]    [10, 30, 50]
 * [5]                     [5]
 * [1, 2]                  [1]
 * [9, 8, 7, 6]            [9, 7]
 */
public class Ct22PickEvenIndex {

    public int[] solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // ↓↓↓ 여기에 코드 작성 (골라 담기 + 옮기기 전부) ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
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
        Ct22PickEvenIndex q = new Ct22PickEvenIndex();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{10, 20, 30, 40, 50})) + " / 정답: [10, 30, 50]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5})) + " / 정답: [5]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{1, 2})) + " / 정답: [1]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{9, 8, 7, 6})) + " / 정답: [9, 7]");
    }
}