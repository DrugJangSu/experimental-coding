import java.util.Arrays;

/*
 * [Ct159] 행렬의 덧셈 (1차 특강 · 프로그래머스 Lv.1)
 *
 * 문제
 * 크기가 같은 2차원 배열 arr1, arr2가 주어집니다.
 * 같은 줄, 같은 칸끼리 더한 2차원 배열을 return 하세요.
 *
 * 입출력 예
 * arr1                 arr2                 result
 * [[1, 2], [2, 3]]     [[3, 4], [5, 6]]     [[4, 6], [7, 9]]
 * [[1], [2]]           [[3], [4]]           [[4], [6]]
 * [[0]]                [[0]]                [[0]]
 * [[1, 1, 1]]          [[1, 2, 3]]          [[2, 3, 4]]
 */
public class Ct159MatrixAdd {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int [][] answer = new int[arr1.length][arr1[0].length];
        for (int r = 0; r < arr1.length; r++) {
            for (int c = 0; c < arr1[r].length; c++) {
                answer[r][c] = arr1[r][c] + arr2[r][c];
            }
        }
        return answer;
        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct159MatrixAdd q = new Ct159MatrixAdd();
        System.out.println("테스트1 결과: " + Arrays.deepToString(q.solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}})) + " / 정답: [[4, 6], [7, 9]]");
        System.out.println("테스트2 결과: " + Arrays.deepToString(q.solution(new int[][]{{1}, {2}}, new int[][]{{3}, {4}})) + " / 정답: [[4], [6]]");
        System.out.println("테스트3 결과: " + Arrays.deepToString(q.solution(new int[][]{{0}}, new int[][]{{0}})) + " / 정답: [[0]]");
        System.out.println("테스트4 결과: " + Arrays.deepToString(q.solution(new int[][]{{1, 1, 1}}, new int[][]{{1, 2, 3}})) + " / 정답: [[2, 3, 4]]");
    }
}