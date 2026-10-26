/*
 * [Ct118] 가장 큰 자릿수 (복습 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * n의 각 자리 숫자 중 가장 큰 숫자를 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * n       result
 * 1234    4
 * 909     9
 * 5       5
 * 1000    1
 */
public class Ct118MaxDigit {

    public int solution(int n) {
        int answer = 0;     // 가장 큰 자릿수 (자릿수는 0 이상이라 0으로 시작해도 괜찮아요)
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // n이 0보다 큰 동안 반복
        while (n > 0) {
        //    - 일의 자리 꺼내기 (d = n % 10)
            int d = n % 10;
        //    - d가 answer보다 크면 answer 바꾸기
            if (d > answer) {
                answer = d;
            }
            n = n / 10;
        //    - 일의 자리 버리기 (n = n / 10)

        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct118MaxDigit q = new Ct118MaxDigit();
        System.out.println("테스트1 결과: " + q.solution(1234) + " / 정답: 4");
        System.out.println("테스트2 결과: " + q.solution(909) + " / 정답: 9");
        System.out.println("테스트3 결과: " + q.solution(5) + " / 정답: 5");
        System.out.println("테스트4 결과: " + q.solution(1000) + " / 정답: 1");
    }
}