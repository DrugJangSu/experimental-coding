/*
 * [Ct119] 홀수 자릿수 더하기
 *
 * 문제
 * 자연수 n이 주어집니다.
 * n의 각 자리 숫자 중 홀수만 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * n        result
 * 1234     4       (1 + 3)
 * 2468     0
 * 5        5
 * 13579    25
 */
public class Ct119OddDigitSum {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        while (n > 0) {
        if ((n % 10) % 2 != 0) {
            answer += (n % 10);
        }
        n = n / 10;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct119OddDigitSum q = new Ct119OddDigitSum();
        System.out.println("테스트1 결과: " + q.solution(1234) + " / 정답: 4");
        System.out.println("테스트2 결과: " + q.solution(2468) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(5) + " / 정답: 5");
        System.out.println("테스트4 결과: " + q.solution(13579) + " / 정답: 25");
    }
}