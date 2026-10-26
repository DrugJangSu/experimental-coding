/*
 * [Ct116] 자릿수 더하기 - 숫자 그대로 (복습 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * n의 각 자리 숫자를 모두 더한 값을 return 하도록 solution 메서드를 완성하세요.
 * (이번엔 문자열로 바꾸지 말고, % 10 과 / 10 으로 풀어 보세요.)
 *
 * 입출력 예
 * n       result
 * 123     6
 * 9       9
 * 1000    1
 * 987     24
 */
public class Ct116DigitSumMath {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // n이 0보다 큰 동안 반복 (while)
        while (n > 0) { // 배낌
            //    - 일의 자리 꺼내서(n % 10) answer에 더하기
            //    - 일의 자리 버리기(n = n / 10)
            answer += n % 10;
            n = n / 10;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct116DigitSumMath q = new Ct116DigitSumMath();
        System.out.println("테스트1 결과: " + q.solution(123) + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution(9) + " / 정답: 9");
        System.out.println("테스트3 결과: " + q.solution(1000) + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(987) + " / 정답: 24");
    }
}