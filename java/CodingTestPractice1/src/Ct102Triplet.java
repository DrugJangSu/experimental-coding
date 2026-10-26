/*
 * [Ct102] 합이 0인 세 명 (12단계 · 중, Lv.1 "삼총사" 구조)
 *
 * 문제
 * 학생들의 번호가 정수 배열 nums로 주어집니다.
 * 서로 다른 학생 세 명을 골라 번호를 더했을 때 0이 되는 경우가
 * 몇 가지인지 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 3 ≤ nums의 길이 ≤ 13
 *
 * 입출력 예
 * nums                          result
 * [-2, 3, 0, 2, -5]             2        ((-2, 0, 2), (3, 2, -5))
 * [-3, -2, -1, 0, 1, 2, 3]      5
 * [-1, 1, -1, 1]                0
 * [0, 0, 0]                     1
 */
public class Ct102Triplet {

    public int solution(int[] nums) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 위의 "세 명 고르기" 양식 (n 자리에 nums.length) // 반복문 배낄게
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
        // 2. 세 명의 합이 0이면 answer++  (Ct47에서 쌍의 합 확인했던 것처럼)
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct102Triplet q = new Ct102Triplet();
        System.out.println("테스트1 결과: " + q.solution(new int[]{-2, 3, 0, 2, -5}) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{-3, -2, -1, 0, 1, 2, 3}) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{-1, 1, -1, 1}) + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new int[]{0, 0, 0}) + " / 정답: 1");
    }
}