/*
 * [Ct02] 짝수 홀수 (1단계 · 하)
 *
 * 문제
 * 정수 num이 주어질 때, num이 짝수면 "even", 홀수면 "odd"를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 0 ≤ num ≤ 1,000
 * - 0은 짝수입니다.
 *
 * 입출력 예
 * num   result
 * 4     "even"
 * 7     "odd"
 * 0     "even"
 */
public class Ct02EvenOdd {

    public String solution(int num) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        if (num % 2 == 0) {
            answer = "even";
        } else {
            answer = "odd";
        }



        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct02EvenOdd q = new Ct02EvenOdd();
        System.out.println("테스트1 결과: " + q.solution(4) + " / 정답: even");
        System.out.println("테스트2 결과: " + q.solution(7) + " / 정답: odd");
        System.out.println("테스트3 결과: " + q.solution(0) + " / 정답: even");
    }
}