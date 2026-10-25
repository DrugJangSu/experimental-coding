import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct67] 기준보다 큰 수 골라 담기 (복습 · 하)
 *
 * 문제
 * 정수 배열 nums와 정수 target이 주어집니다.
 * nums에서 target보다 큰 수만 순서대로 골라 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 *
 * 입출력 예
 * nums            target   result
 * [1, 5, 3, 8]    4        [5, 8]
 * [1, 2]          5        []
 * [10]            9        [10]
 * [7, 7, 7]       7        []
 */
public class Ct67PickBigger {

    public int[] solution(int[] nums, int target) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 숫자 리스트 만들기
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
        // 2. 방금 Ct66 조건으로, 큰 수면 리스트에 add
            if (nums[i] > target) {
                list.add(nums[i]);
            }
        }
        // 3. 리스트 → 배열 옮기기
        int [] answer = new int [list.size()];
        for (int i = 0; i < list.size(); i++) {
//            if (list.isEmpty()) {
//                answer = []; // 모르겠다 ㅅㅂ
//                  break;
//            }
            answer[i] = list.get(i);
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct67PickBigger q = new Ct67PickBigger();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 5, 3, 8}, 4)) + " / 정답: [5, 8]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{1, 2}, 5)) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{10}, 9)) + " / 정답: [10]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{7, 7, 7}, 7)) + " / 정답: []");
    }
}