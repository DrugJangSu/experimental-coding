/*
 * [Ct90] 위아래 이동 (11단계 · 하)
 *
 * 문제
 * 0에서 시작합니다. 명령 문자열 cmds의 각 글자대로 움직입니다.
 *   - 'U' : +1
 *   - 'D' : -1
 * 모든 명령을 마친 뒤의 위치를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ cmds의 길이 ≤ 100
 *
 * 입출력 예
 * cmds     result
 * "UUD"    1
 * "D"      -1
 * "UDUD"   0
 * "UUU"    3
 */
public class Ct90UpDown {

    public int solution(String cmds) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < cmds.length(); i++) {
            char direction = cmds.charAt(i);
            if (direction == 'U') {
                answer++;
            } else if (direction == 'D') {
                answer--;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct90UpDown q = new Ct90UpDown();
        System.out.println("테스트1 결과: " + q.solution("UUD") + " / 정답: 1");
        System.out.println("테스트2 결과: " + q.solution("D") + " / 정답: -1");
        System.out.println("테스트3 결과: " + q.solution("UDUD") + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution("UUU") + " / 정답: 3");
    }
}