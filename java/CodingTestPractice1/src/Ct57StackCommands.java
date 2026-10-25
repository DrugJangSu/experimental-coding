import java.util.Stack;

/*
 * [Ct57] 스택 명령 처리 (워밍업 · 하)
 *
 * 문제
 * 명령들이 정수 배열 cmds로 주어집니다. 앞에서부터 차례로 처리합니다.
 *   - 0이 아닌 숫자 : 그 숫자를 스택에 push
 *   - 0             : 스택에서 pop (스택이 비어 있으면 아무것도 안 함)
 * 모든 명령을 처리한 뒤, 스택이 비어 있으면 -1을,
 * 아니면 맨 위 숫자를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ cmds의 길이 ≤ 100
 * - 0 ≤ cmds의 원소 ≤ 1,000
 *
 * 입출력 예
 * cmds               result
 * [1, 2, 0, 3]       3
 * [5, 0]             -1
 * [0, 7]             7
 * [4, 8, 0, 0, 0]    -1
 */
public class Ct57StackCommands {

    public int solution(int[] cmds) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 숫자 스택 만들기

        // 2. cmds를 하나씩 보면서
        //    - 0이 아니면 → push
        //    - 0이면      → 스택이 비어 있지 않을 때만 pop

        // 3. 다 끝나고: 비었으면 -1, 아니면 맨 위(peek)를 answer에


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct57StackCommands q = new Ct57StackCommands();
        System.out.println("테스트1 결과: " + q.solution(new int[]{1, 2, 0, 3}) + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5, 0}) + " / 정답: -1");
        System.out.println("테스트3 결과: " + q.solution(new int[]{0, 7}) + " / 정답: 7");
        System.out.println("테스트4 결과: " + q.solution(new int[]{4, 8, 0, 0, 0}) + " / 정답: -1");
    }
}