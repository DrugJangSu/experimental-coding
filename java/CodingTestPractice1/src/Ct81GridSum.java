/*
 * [Ct81] 표 전체 합 (10단계 · 하)
 *
 * 문제
 * 정수 2차원 배열 grid가 주어집니다.
 * grid에 있는 모든 수의 합을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ grid의 줄 수, 칸 수 ≤ 10
 *
 * 입출력 예
 * grid                    result
 * [[1, 2], [3, 4]]        10
 * [[5]]                   5
 * [[1, 2, 3], [4, 5, 6]]  21
 * [[0, 0], [0, 0]]        0
 */
public class Ct81GridSum {

    public int solution(int[][] grid) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 위의 "표 전체를 도는 양식" + 합계 패턴
        // 첨보는 거 많네
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                answer += grid[r][c]; // ???????? 이해 불가
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct81GridSum q = new Ct81GridSum();
        System.out.println("테스트1 결과: " + q.solution(new int[][]{{1, 2}, {3, 4}}) + " / 정답: 10");
        System.out.println("테스트2 결과: " + q.solution(new int[][]{{5}}) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[][]{{1, 2, 3}, {4, 5, 6}}) + " / 정답: 21");
        System.out.println("테스트4 결과: " + q.solution(new int[][]{{0, 0}, {0, 0}}) + " / 정답: 0");
    }
}
