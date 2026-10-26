/*
 * [Ct111] 둘 중 큰 수 (복습 · 하)
 *
 * 문제
 * 정수 a와 b가 주어집니다.
 * 둘 중 더 큰 수를 return 하도록 solution 메서드를 완성하세요.
 * (같으면 그 수를 return 합니다.)
 *
 * 입출력 예
 * a     b     result
 * 3     5     5
 * 10    2     10
 * -1    -5    -1
 * 7     7     7
 */
public class Ct111Bigger {

    public int solution(int a, int b) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        answer = Math.max(a, b);
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct111Bigger q = new Ct111Bigger();
        System.out.println("테스트1 결과: " + q.solution(3, 5) + " / 정답: 5");
        System.out.println("테스트2 결과: " + q.solution(10, 2) + " / 정답: 10");
        System.out.println("테스트3 결과: " + q.solution(-1, -5) + " / 정답: -1");
        System.out.println("테스트4 결과: " + q.solution(7, 7) + " / 정답: 7");
    }
}