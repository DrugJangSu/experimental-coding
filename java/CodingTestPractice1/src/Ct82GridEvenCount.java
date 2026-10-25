/*
 * [Ct82] 표에서 짝수 세기 (10단계 · 하)
 *
 * 문제
 * 정수 2차원 배열 grid가 주어집니다.
 * grid에 있는 짝수가 몇 개인지 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ grid의 줄 수, 칸 수 ≤ 10
 * - 0 ≤ grid의 원소 ≤ 100
 *
 * 입출력 예
 * grid                      result
 * [[1, 2], [3, 4]]          2
 * [[5]]                     0
 * [[2, 4, 6], [1, 3, 5]]    3
 * [[0, 0], [0, 0]]          4
 */
public class Ct82GridEvenCount {

    public int solution(int[][] grid) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) { // 빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄빨간줄
                if (grid[r][c] % 2 == 0) {
                    answer++;
                }
            }

        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct82GridEvenCount q = new Ct82GridEvenCount();
        System.out.println("테스트1 결과: " + q.solution(new int[][]{{1, 2}, {3, 4}}) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[][]{{5}}) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[][]{{2, 4, 6}, {1, 3, 5}}) + " / 정답: 3");
        System.out.println("테스트4 결과: " + q.solution(new int[][]{{0, 0}, {0, 0}}) + " / 정답: 4");
    }
}