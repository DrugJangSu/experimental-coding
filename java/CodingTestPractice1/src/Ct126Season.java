/*
 * [Ct126] 월로 계절 찾기 (LMS 1단계 · 하)
 *
 * 문제
 * 월을 나타내는 정수 month가 주어집니다. (1 ~ 12)
 * 3·4·5월은 "봄", 6·7·8월은 "여름", 9·10·11월은 "가을", 12·1·2월은 "겨울"을
 * return 하도록 solution 메서드를 완성하세요.
 * 단, switch문을 쓰세요.
 *
 * 입출력 예
 * month   result
 * 4       "봄"
 * 7       "여름"
 * 10      "가을"
 * 1       "겨울"
 */
public class Ct126Season {

    public String solution(int month) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        switch (month) {
            case 3:
            case 4:
            case 5:
                answer = "봄";
                break;
            case 6:
            case 7:
            case 8:
                answer = "여름";
                break;
            case 9:
            case 10:
            case 11:
                answer = "가을";
                break;
            case 12:
            case 1:
            case 2:
                answer = "겨울";
                break;
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct126Season q = new Ct126Season();
        System.out.println("테스트1 결과: " + q.solution(4) + " / 정답: 봄");
        System.out.println("테스트2 결과: " + q.solution(7) + " / 정답: 여름");
        System.out.println("테스트3 결과: " + q.solution(10) + " / 정답: 가을");
        System.out.println("테스트4 결과: " + q.solution(1) + " / 정답: 겨울");
    }
}