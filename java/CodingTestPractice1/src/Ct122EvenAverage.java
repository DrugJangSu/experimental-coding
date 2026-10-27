/*
 * [Ct122] 짝수들의 평균
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * nums에 있는 짝수들의 평균을 return 하도록 solution 메서드를 완성하세요.
 * (평균은 소수점 아래를 버린 정수입니다.)
 * 짝수가 하나도 없으면 -1을 return 합니다.
 *
 * 입출력 예
 * nums            result
 * [1, 2, 3, 4]    3       ((2 + 4) / 2)
 * [1, 3]          -1      (짝수 없음)
 * [10]            10
 * [2, 3, 4]       3       ((2 + 4) / 2)
 */
public class Ct122EvenAverage {

    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        int total = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                total += nums[i];
                count++;
            }
        }
        if (count == 0) {
            answer = -1;
        } else {
            answer = total / count;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct122EvenAverage q = new Ct122EvenAverage();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3, 4}) + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(new int[]{1, 3}) + " / 정답: -1");
        System.out.println("테스트3 결과: " + q.solution(new int[]{10}) + " / 정답: 10");
        System.out.println("테스트4 결과: " + q.solution(new int[]{2, 3, 4}) + " / 정답: 3");
    }
}