import java.util.Arrays;

/*
 * [Ct85] 세로줄마다 합 구하기 (10단계 · 중)
 *
 * 문제
 * 정수 2차원 배열 grid가 주어집니다. (모든 줄의 칸 수는 같습니다.)
 * 각 세로줄(같은 칸 번호끼리)의 합을 칸 번호 순서대로 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ grid의 줄 수, 칸 수 ≤ 10
 *
 * 입출력 예
 * grid                          result
 * [[1, 2], [3, 4]]              [4, 6]
 * [[5]]                         [5]
 * [[1, 2, 3], [4, 5, 6]]        [5, 7, 9]
 * [[0, 0], [1, 1], [2, 2]]      [3, 3]
 */
public class Ct85ColSums {

    public int[] solution(int[][] grid) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // grid[r][c];
        int [] answer = new int [grid[0].length];
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                answer[c] += grid[r][c];
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct85ColSums q = new Ct85ColSums();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[][]{{1, 2}, {3, 4}})) + " / 정답: [4, 6]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[][]{{5}})) + " / 정답: [5]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[][]{{1, 2, 3}, {4, 5, 6}})) + " / 정답: [5, 7, 9]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[][]{{0, 0}, {1, 1}, {2, 2}})) + " / 정답: [3, 3]");
    }
}