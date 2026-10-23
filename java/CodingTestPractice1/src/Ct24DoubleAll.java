import java.util.Arrays;

/*
 * [Ct24] 전부 두 배 (4단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums의 모든 원소를 두 배로 만든 배열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 *
 * 입출력 예
 * nums           result
 * [1, 2, 3]      [2, 4, 6]
 * [0]            [0]
 * [5, 10]        [10, 20]
 * [100, 0, 7]    [200, 0, 14]
 */
public class Ct24DoubleAll {

    public int[] solution(int[] nums) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 결과 개수는 nums 개수와 똑같다 (미리 알고 있음!)
        //    → 장바구니 없이 바로 계란판(answer) 만들기


        // 2. 선반(nums) i번째 값 × 2 를 계란판(answer) i번째에 넣기


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct24DoubleAll q = new Ct24DoubleAll();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3})) + " / 정답: [2, 4, 6]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{0})) + " / 정답: [0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{5, 10})) + " / 정답: [10, 20]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{100, 0, 7})) + " / 정답: [200, 0, 14]");
    }
}