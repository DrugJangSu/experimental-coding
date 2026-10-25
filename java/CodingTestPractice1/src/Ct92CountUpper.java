/*
 * [Ct92] 대문자 세기 (8단계 복습 · 하)
 *
 * 문제
 * 영어 대소문자와 공백으로 이루어진 문자열 s가 주어집니다.
 * s에 대문자가 몇 개 있는지 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 *
 * 입출력 예
 * s               result
 * "Hello World"   2
 * "java"          0
 * "ABC"           3
 * "aBcD"          2
 */
public class Ct92CountUpper {

    public int solution(String s) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < s.length(); i++) {
            char upperCheck = s.charAt(i);
            if (Character.isUpperCase(upperCheck)) { // 이럴 줄 알았으면 변수이름을 이렇게 안뒀지... ㅋㅋㅋㅋㅋ 첨보는 거네
                answer++;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct92CountUpper q = new Ct92CountUpper();
        System.out.println("테스트1 결과: " + q.solution("Hello World") + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution("java") + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution("ABC") + " / 정답: 3");
        System.out.println("테스트4 결과: " + q.solution("aBcD") + " / 정답: 2");
    }
}