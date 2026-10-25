/*
 * [Ct99] 표에서 특정 숫자 세기 (10단계 복습 · 하)
 *
 * 문제
 * 정수 2차원 배열 grid와 정수 target이 주어집니다.
 * grid에 target이 몇 번 나오는지 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ grid의 줄 수, 칸 수 ≤ 10
 *
 * 입출력 예
 * grid                        target   result
 * [[1, 2], [2, 3]]            2        2
 * [[5]]                       5        1
 * [[1, 1, 1], [1, 1, 1]]      1        6
 * [[1, 2], [3, 4]]            9        0
 */
public class Ct99CountInGrid {

    public int solution(int[][] grid, int target) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // grid[r][c];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (target == grid[r][c]) {
                    answer++;
                }
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct99CountInGrid q = new Ct99CountInGrid();
        System.out.println("테스트1 결과: " + q.solution(new int[][]{{1, 2}, {2, 3}}, 2) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[][]{{5}}, 5) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(new int[][]{{1, 1, 1}, {1, 1, 1}}, 1) + " / 정답: 6");
        System.out.println("테스트4 결과: " + q.solution(new int[][]{{1, 2}, {3, 4}}, 9) + " / 정답: 0");
    }
}