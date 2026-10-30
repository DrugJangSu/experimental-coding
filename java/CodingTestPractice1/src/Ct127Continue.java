/*
 * [Ct127] 3의 배수 빼고 더하기 (LMS 1단계 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * 1부터 n까지의 수 중 3의 배수는 건너뛰고, 나머지를 모두 더한 값을
 * return 하도록 solution 메서드를 완성하세요.
 * 단, continue를 쓰세요.
 *
 * 입출력 예
 * n     result
 * 5     12      (1 + 2 + 4 + 5)
 * 3     3       (1 + 2)
 * 1     1
 * 10    37      (1 + 2 + 4 + 5 + 7 + 8 + 10)
 */
public class Ct127Continue {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 != 0) {
//                answer += i;
//            }
//        }
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue;
            }
            answer += i;
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct127Continue q = new Ct127Continue();
        System.out.println("테스트1 결과: " + q.solution(5) + " / 정답: 12");
        System.out.println("테스트2 결과: " + q.solution(3) + " / 정답: 3");
        System.out.println("테스트3 결과: " + q.solution(1) + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(10) + " / 정답: 37");
    }
}