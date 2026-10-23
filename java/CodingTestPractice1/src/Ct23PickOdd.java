import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct23] 홀수만 골라 담기 (4단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums에서 값이 홀수인 원소만 순서대로 골라 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (홀수가 하나도 없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 *
 * 입출력 예
 * nums               result
 * [1, 2, 3, 4, 5]    [1, 3, 5]
 * [2, 4]             []
 * [7]                [7]
 * [10, 11, 0, 13]    [11, 13]
 */
public class Ct23PickOdd {

    public int[] solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 선반(nums)을 돌면서, 홀수면 장바구니(list)에 담기
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                list.add(nums[i]);
            }
        }
        // 2. 장바구니 개수만큼 계란판(answer) 만들기
        int[] answer = new int [list.size()];
        // 3. 장바구니(list) i번째를 계란판(answer) i번째에 옮기기
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct23PickOdd q = new Ct23PickOdd();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3, 4, 5})) + " / 정답: [1, 3, 5]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{2, 4})) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{7})) + " / 정답: [7]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{10, 11, 0, 13})) + " / 정답: [11, 13]");
    }
}