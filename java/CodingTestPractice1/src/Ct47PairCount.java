/*
 * [Ct47] 합이 target인 쌍 세기 (6단계 · 중)
 *
 * 문제
 * 정수 배열 nums와 정수 target이 주어집니다.
 * 서로 다른 두 칸을 골라 더한 값이 target이 되는 쌍이 모두 몇 개인지
 * return 하도록 solution 메서드를 완성하세요.
 * (같은 두 칸을 순서만 바꾼 것은 한 쌍으로 셉니다.)
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 *
 * 입출력 예
 * nums             target   result
 * [1, 2, 3, 4]     5        2
 * [1, 1, 1]        2        3
 * [5]              5        0
 * [2, 7, 11, 15]   9        1
 */
public class Ct47PairCount {

    public int solution(int[] nums, int target) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 위의 "모든 쌍 보기" 양식을 쓰고 -> 뭐????
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // 이거 나 한번 오류나서 다시 바꿈... 확실히 1,1 이런 경우도 생기니까 값이 뻥튀기돼. 익숙해져야될듯
        // 2. 쌍의 합이 target이면 answer를 1 올리기 (Ct08 개수 패턴) // 이렇게 하면 되겠지..?
                if (target == nums[i] + nums[j]) {
                    answer++;
                }
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct47PairCount q = new Ct47PairCount();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3, 4}, 5) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 1, 1}, 2) + " / 정답: 3");
        System.out.println("테스트3 결과: " + q.solution(new int[]{5}, 5) + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new int[]{2, 7, 11, 15}, 9) + " / 정답: 1");
    }
}