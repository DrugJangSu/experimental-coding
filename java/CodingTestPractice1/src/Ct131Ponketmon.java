import java.util.HashSet;

/*
 * [Ct131] 폰켓몬 (LMS 2부 03 · 프로그래머스 Lv.1)
 *
 * 문제
 * 폰켓몬 N마리가 있고, 그중 N/2마리를 가져갈 수 있습니다.
 * 같은 종류 번호는 같은 종류의 폰켓몬입니다.
 * 최대한 많은 "종류"를 가져가려고 할 때, 가져갈 수 있는 종류 수의 최댓값을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - nums의 길이 N은 짝수입니다.
 *
 * 입출력 예
 * nums                  result
 * [3, 1, 2, 3]          2       (4마리 중 2마리, 종류는 3가지 → 최대 2종류)
 * [3, 3, 3, 2, 2, 4]    3       (6마리 중 3마리, 종류는 3가지 → 최대 3종류)
 * [3, 3, 3, 2, 2, 2]    2       (6마리 중 3마리, 종류는 2가지 → 최대 2종류)
 * [1, 2]                1
 */
public class Ct131Ponketmon {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            set.add(nums[i]);
//        }
        // 향상된 for문 사용해보기
        for (int num : nums) {
            set.add(num);
        }
        answer = Math.min(set.size(), nums.length/2);

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct131Ponketmon q = new Ct131Ponketmon();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 1, 2, 3}) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{3, 3, 3, 2, 2, 4}) + " / 정답: 3");
        System.out.println("테스트3 결과: " + q.solution(new int[]{3, 3, 3, 2, 2, 2}) + " / 정답: 2");
        System.out.println("테스트4 결과: " + q.solution(new int[]{1, 2}) + " / 정답: 1");
    }
}