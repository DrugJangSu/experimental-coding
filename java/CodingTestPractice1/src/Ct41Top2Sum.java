import java.util.Arrays;

/*
 * [Ct41] 가장 큰 두 수의 합 (6단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums에서 가장 큰 수와 두 번째로 큰 수를 더한 값을
 * return 하도록 solution 메서드를 완성하세요.
 * (같은 값이 여러 개 있으면 각각 따로 셉니다.)
 *
 * 제한사항
 * - 2 ≤ nums의 길이 ≤ 100
 * - 0 ≤ nums의 원소 ≤ 1,000
 *
 * 입출력 예
 * nums            result
 * [5, 2, 9, 1]    14
 * [3, 3]          6
 * [10, 1, 10]     20
 * [0, 7, 4, 7]    14
 */
public class Ct41Top2Sum {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 일단... 정렬시켜야겠지.
        Arrays.sort(nums);
        // 그리고 뭐 가장 큰거랑 두번째. 첫번째랑 두번째 값이겠네 -> 아 썅 오름차순이니까 반대. 맨 끝이 가장 큰 값.
        answer = nums[(nums.length -1)] + nums[(nums.length-2)];
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct41Top2Sum q = new Ct41Top2Sum();
        System.out.println("테스트1 결과: " + q.solution(new int[]{5, 2, 9, 1}) + " / 정답: 14");
        System.out.println("테스트2 결과: " + q.solution(new int[]{3, 3}) + " / 정답: 6");
        System.out.println("테스트3 결과: " + q.solution(new int[]{10, 1, 10}) + " / 정답: 20");
        System.out.println("테스트4 결과: " + q.solution(new int[]{0, 7, 4, 7}) + " / 정답: 14");
    }
}