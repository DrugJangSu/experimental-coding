/*
 * [Ct86] 대각선 합 (10단계 · 하)
 *
 * 문제
 * 정사각형 모양의 정수 2차원 배열 grid가 주어집니다.
 * 왼쪽 위에서 오른쪽 아래로 가는 대각선 위의 수들의 합을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - grid는 줄 수와 칸 수가 같습니다. (1 ~ 10)
 *
 * 입출력 예
 * grid                                  result
 * [[1, 2], [3, 4]]                      5        (1 + 4)
 * [[5]]                                 5
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]]     15       (1 + 5 + 9)
 * [[2, 0], [0, 2]]                      4
 */
public class Ct86Diagonal {

    public int solution(int[][] grid) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // i를 0부터 (줄 개수 - 1)까지 돌면서, grid[i][i]를 더하기
        // grid[r][c];
        for (int i = 0; i < grid.length; i++) {
            answer += grid[i][i];
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct86Diagonal q = new Ct86Diagonal();
        System.out.println("테스트1 결과: " + q.solution(new int[][]{{1, 2}, {3, 4}}) + " / 정답: 5");
        System.out.println("테스트2 결과: " + q.solution(new int[][]{{5}}) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) + " / 정답: 15");
        System.out.println("테스트4 결과: " + q.solution(new int[][]{{2, 0}, {0, 2}}) + " / 정답: 4");
    }
}