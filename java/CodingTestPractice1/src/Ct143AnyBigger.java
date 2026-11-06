/*
 * [Ct143] 더 큰 게 하나라도 있나 (3단계 준비 · 하)
 *
 * 문제
 * 정수 배열 nums와 정수 x가 주어집니다.
 * nums 안에 x보다 큰 숫자가 하나라도 있으면 true, 없으면 false를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums         x    result
 * [1, 2, 3]    2    true     (3이 있음)
 * [1, 1]       1    false    (같은 건 큰 게 아님)
 * [5]          3    true
 * [2, 2, 2]    5    false
 */
public class Ct143AnyBigger {

    public boolean solution(int[] nums, int x) {
        boolean answer = false;      // 처음엔 "없다"로 시작
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int num : nums) {
            if (num > x) {
                answer = true;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct143AnyBigger q = new Ct143AnyBigger();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3}, 2) + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 1}, 1) + " / 정답: false");
        System.out.println("테스트3 결과: " + q.solution(new int[]{5}, 3) + " / 정답: true");
        System.out.println("테스트4 결과: " + q.solution(new int[]{2, 2, 2}, 5) + " / 정답: false");
    }
}