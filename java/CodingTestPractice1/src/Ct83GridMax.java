/*
 * [Ct83] 표에서 가장 큰 수 (10단계 · 하)
 *
 * 문제
 * 정수 2차원 배열 grid가 주어집니다.
 * grid에서 가장 큰 수를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ grid의 줄 수, 칸 수 ≤ 10
 * - -100 ≤ grid의 원소 ≤ 100
 *
 * 입출력 예
 * grid                        result
 * [[1, 2], [3, 4]]            4
 * [[5]]                       5
 * [[-1, -5], [-3, -2]]        -1
 * [[7, 9, 2], [8, 1, 9]]      9
 */
public class Ct83GridMax {

    public int solution(int[][] grid) {
        int answer = grid[0][0];
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // int[r][c] row, column <- 이렇게 써두고 시작하는게 정신건강에 이로운듯
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] > answer) {
                    answer = grid[r][c];
                }
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct83GridMax q = new Ct83GridMax();
        System.out.println("테스트1 결과: " + q.solution(new int[][]{{1, 2}, {3, 4}}) + " / 정답: 4");
        System.out.println("테스트2 결과: " + q.solution(new int[][]{{5}}) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[][]{{-1, -5}, {-3, -2}}) + " / 정답: -1");
        System.out.println("테스트4 결과: " + q.solution(new int[][]{{7, 9, 2}, {8, 1, 9}}) + " / 정답: 9");
    }
}