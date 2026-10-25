import java.util.Arrays;

/*
 * [Ct84] 줄마다 합 구하기 (10단계 · 중)
 *
 * 문제
 * 정수 2차원 배열 grid가 주어집니다.
 * 각 줄의 합을 줄 순서대로 담은 배열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ grid의 줄 수, 칸 수 ≤ 10
 *
 * 입출력 예
 * grid                          result
 * [[1, 2], [3, 4]]              [3, 7]
 * [[5]]                         [5]
 * [[1, 2, 3], [4, 5, 6]]        [6, 15]
 * [[0, 0], [1, 1], [2, 2]]      [0, 2, 4]
 */
public class Ct84RowSums {

    public int[] solution(int[][] grid) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 줄 개수만큼 계란판(answer) 만들기 (개수를 미리 아니까 Ct24처럼 바로)
        // grid[r][c]
        int [] answer = new int [grid.length];
        // 2. 표 전체를 돌면서, r번 줄의 숫자는 answer의 r번 칸에 더하기
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                answer[r] += grid[r][c];
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct84RowSums q = new Ct84RowSums();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[][]{{1, 2}, {3, 4}})) + " / 정답: [3, 7]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[][]{{5}})) + " / 정답: [5]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[][]{{1, 2, 3}, {4, 5, 6}})) + " / 정답: [6, 15]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[][]{{0, 0}, {1, 1}, {2, 2}})) + " / 정답: [0, 2, 4]");
    }
}