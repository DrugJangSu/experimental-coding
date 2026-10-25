/*
 * [Ct80] 최소공배수 (9단계 · 하)
 *
 * 문제
 * 자연수 a와 b가 주어집니다.
 * a와 b의 최소공배수(둘 다로 나누어떨어지는 수 중 가장 작은 수)를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ a, b ≤ 1,000
 *
 * 입출력 예
 * a     b     result
 * 12    18    36
 * 7     3     21
 * 10    5     10
 * 8     8     8
 */
public class Ct80Lcm {

    public int solution(int a, int b) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 최대공약수 구하기 (Ct79 코드 그대로, 담을 상자 이름만 gcd로)
        int gcd = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        // 2. 최소공배수 = a * b / gcd < = 최소공배수 오랜만...
        answer = a * b / gcd;
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct80Lcm q = new Ct80Lcm();
        System.out.println("테스트1 결과: " + q.solution(12, 18) + " / 정답: 36");
        System.out.println("테스트2 결과: " + q.solution(7, 3) + " / 정답: 21");
        System.out.println("테스트3 결과: " + q.solution(10, 5) + " / 정답: 10");
        System.out.println("테스트4 결과: " + q.solution(8, 8) + " / 정답: 8");
    }
}