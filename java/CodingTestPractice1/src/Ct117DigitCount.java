/*
 * [Ct117] 자릿수 세기 (복습 · 하)
 *
 * 문제
 * 자연수 n이 주어집니다.
 * n이 몇 자리 수인지 return 하도록 solution 메서드를 완성하세요.
 * (문자열로 바꾸지 말고 / 10 으로 풀어 보세요.)
 *
 * 입출력 예
 * n        result
 * 123      3
 * 9        1
 * 1000     4
 * 55555    5
 */
public class Ct117DigitCount {

    public int solution(int n) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // n이 0보다 큰 동안 반복
        while (n > 0) {
        //    - 한 자리 버리고(n = n / 10)
            n = n / 10;
        //    - 하나 세기(answer++)
            answer++;

        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct117DigitCount q = new Ct117DigitCount();
        System.out.println("테스트1 결과: " + q.solution(123) + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(9) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(1000) + " / 정답: 4");
        System.out.println("테스트4 결과: " + q.solution(55555) + " / 정답: 5");
    }
}