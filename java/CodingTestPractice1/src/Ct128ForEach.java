/*
 * [Ct128] 향상된 for로 합계 (LMS 1단계 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 모든 원소의 합을 return 하도록 solution 메서드를 완성하세요.
 * 단, 향상된 for를 쓰고, [i]는 쓰지 마세요.
 *
 * 입출력 예
 * nums            result
 * [1, 2, 3]       6
 * [5]             5
 * [-1, 1]         0
 * [10, 20, 30]    60
 */
public class Ct128ForEach {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 이게 일반 for문
//        for (int i = 0; i < nums.length; i++) {
//            answer += nums[i];
//        }
        // 향상된 for문??
        for (int num : nums) {
            answer += num;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct128ForEach q = new Ct128ForEach();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3}) + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5}) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{-1, 1}) + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new int[]{10, 20, 30}) + " / 정답: 60");
    }
}