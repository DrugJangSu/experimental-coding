/*
 * [Ct91] 경기 점수판 (11단계 · 하)
 *
 * 문제
 * 경기 결과가 문자열 results로 주어집니다. 각 글자가 한 경기의 결과입니다.
 *   - 'W' (승) : 3점
 *   - 'D' (무) : 1점
 *   - 'L' (패) : 0점
 * 모든 경기의 점수 합을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ results의 길이 ≤ 100
 * - results는 'W', 'D', 'L'로만 이루어져 있습니다.
 *
 * 입출력 예
 * results   result
 * "WWL"     6
 * "D"       1
 * "LLL"     0
 * "WDWD"    8
 */
public class Ct91ScoreBoard {

    public int solution(String results) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < results.length(); i++) {
            char direction = results.charAt(i);
            if (direction == 'W') {
                answer += 3;
            } else if (direction == 'D') {
                answer++;
            } else if (direction == 'L') {
                continue;
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct91ScoreBoard q = new Ct91ScoreBoard();
        System.out.println("테스트1 결과: " + q.solution("WWL") + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution("D") + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution("LLL") + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution("WDWD") + " / 정답: 8");
    }
}