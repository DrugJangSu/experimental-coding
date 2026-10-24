/*
 * [Ct48] 두 배열의 공통 숫자 개수 (6단계 · 중)
 *
 * 문제
 * 정수 배열 a와 b가 주어집니다.
 * a와 b에 모두 들어 있는 숫자가 몇 개인지
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ a의 길이, b의 길이 ≤ 100
 * - a 안의 숫자끼리는 서로 다르고, b 안의 숫자끼리도 서로 다릅니다.
 *
 * 입출력 예
 * a            b            result
 * [1, 2, 3]    [2, 3, 4]    2
 * [5]          [5]          1
 * [1, 2]       [3, 4]       0
 * [7, 8, 9]    [9, 8, 7]    3
 */
public class Ct48CommonCount {

    public int solution(int[] a, int[] b) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // a의 숫자 하나하나를, b의 숫자 전부와 비교하기
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) { // 배열이 서로 다르니까 이번에는 중복 상관없을듯..?
                if (a[i] == b[j]) {
                    answer++;
                }
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct48CommonCount q = new Ct48CommonCount();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 3}, new int[]{2, 3, 4}) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5}, new int[]{5}) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(new int[]{1, 2}, new int[]{3, 4}) + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 8, 9}, new int[]{9, 8, 7}) + " / 정답: 3");
    }
}