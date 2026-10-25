import java.util.Arrays;

/*
 * [Ct88] 로봇 이동 (11단계 · 하)
 *
 * 문제
 * 로봇이 좌표 (0, 0)에 서 있습니다.
 * 명령 문자열 cmds가 주어지고, 각 글자대로 한 칸씩 움직입니다.
 *   - 'U' : 위로 한 칸   (y + 1)
 *   - 'D' : 아래로 한 칸 (y - 1)
 *   - 'R' : 오른쪽으로 한 칸 (x + 1)
 *   - 'L' : 왼쪽으로 한 칸   (x - 1)
 * 모든 명령을 마친 뒤 로봇의 위치를 [x, y] 배열로
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ cmds의 길이 ≤ 100
 * - cmds는 'U', 'D', 'R', 'L'로만 이루어져 있습니다.
 *
 * 입출력 예
 * cmds     result
 * "UUR"    [1, 2]
 * "L"      [-1, 0]
 * "UDLR"   [0, 0]
 * "RRDD"   [2, -2]
 */
public class Ct88RobotMove {

    public int[] solution(String cmds) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 현재 위치 x, y를 0으로 시작
        int x = 0;
        int y = 0;
        // 2. 명령을 한 글자씩 보면서, 글자에 따라 x 또는 y를 바꾸기 (if / else if)
        for (int i = 0; i < cmds.length(); i++) {
            if (cmds.charAt(i) == 'U') {
                y++;
            } else if (cmds.charAt(i) == 'D') {
                y--;
            } else if (cmds.charAt(i) == 'R') {
                x++;
            } else if (cmds.charAt(i) == 'L') {
                x--;
            }
        } // 방금 해보니까 x와 y를 반대로 해놨음... 보통은 배열 첫번째가 높낮이 아닌가? 내가 잘못 알고있는건가
        // 근데 문제 예시 보면은 x가 왼쪽 오른쪽인거 같으니까 따라야지 뭐

        // 3. [x, y]를 return
        return new int[]{x, y}; // 솔직히 이게 가장 어려웠어...


        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct88RobotMove q = new Ct88RobotMove();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution("UUR")) + " / 정답: [1, 2]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution("L")) + " / 정답: [-1, 0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution("UDLR")) + " / 정답: [0, 0]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution("RRDD")) + " / 정답: [2, -2]");
    }
}