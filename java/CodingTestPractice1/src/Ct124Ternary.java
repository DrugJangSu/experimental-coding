/*
 * [Ct124] 짝수·홀수를 삼항으로 (LMS 1단계 · 하)
 *
 * 문제
 * 정수 n이 주어집니다.
 * n이 짝수면 "Even", 홀수면 "Odd"를 return 하도록 solution 메서드를 완성하세요.
 * 단, if문을 쓰지 말고 삼항 연산자로 한 줄에 쓰세요.
 *
 * 입출력 예
 * n     result
 * 4     "Even"
 * 7     "Odd"
 * 0     "Even"
 * -3    "Odd"
 */
public class Ct124Ternary {

    public String solution(int n) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 (한 줄) ↓↓↓
//        if (n % 2 == 0) {
//            answer = "Even";
//        } else {
//            answer = "Odd";
//        }

        answer = (n % 2 == 0) ? "Even" : "Odd";
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct124Ternary q = new Ct124Ternary();
        System.out.println("테스트1 결과: " + q.solution(4) + " / 정답: Even");
        System.out.println("테스트2 결과: " + q.solution(7) + " / 정답: Odd");
        System.out.println("테스트3 결과: " + q.solution(0) + " / 정답: Even");
        System.out.println("테스트4 결과: " + q.solution(-3) + " / 정답: Odd");
    }
}