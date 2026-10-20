/*
 * [Ct07] 최고 기온 (2단계 · 중)
 *
 * 문제
 * 하루 동안 측정한 기온들이 정수 배열 temps로 주어집니다.
 * 이 중 가장 높은 기온을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ temps의 길이 ≤ 100
 * - -30 ≤ temps의 원소 ≤ 40
 *
 * 입출력 예
 * temps            result
 * [12, 18, 15]     18
 * [25, 10, 7]      25
 * [-5, -2, -9]     -2
 * [3]              3
 */
public class Ct07MaxTemp {

    public int solution(int[] temps) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int max = temps[0];
        for (int i = 1; i <= temps.length -1; i++) {
            if (temps[i] > max) {
                max = temps[i];
            }
        }
        answer = max;
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct07MaxTemp q = new Ct07MaxTemp();
        System.out.println("테스트1 결과: " + q.solution(new int[]{12, 18, 15}) + " / 정답: 18");
        System.out.println("테스트2 결과: " + q.solution(new int[]{25, 10, 7}) + " / 정답: 25");
        System.out.println("테스트3 결과: " + q.solution(new int[]{-5, -2, -9}) + " / 정답: -2");
        System.out.println("테스트4 결과: " + q.solution(new int[]{3}) + " / 정답: 3");
    }
}