import java.util.Arrays;

/*
 * [Ct87] 표에서 위치 찾기 (10단계 · 중)
 *
 * 문제
 * 정수 2차원 배열 grid와 정수 target이 주어집니다.
 * grid에서 target이 처음 나오는 위치를 [줄 번호, 칸 번호] 배열로
 * return 하도록 solution 메서드를 완성하세요.
 * (위에 있는 줄부터, 같은 줄이면 왼쪽부터 찾습니다.)
 * target이 없으면 [-1, -1]을 return 합니다.
 *
 * 제한사항
 * - 1 ≤ grid의 줄 수, 칸 수 ≤ 10
 *
 * 입출력 예
 * grid                      target   result
 * [[1, 2], [3, 4]]          3        [1, 0]
 * [[5]]                     5        [0, 0]
 * [[1, 2, 3], [4, 5, 6]]    6        [1, 2]
 * [[1, 2], [3, 4]]          9        [-1, -1]
 * [[7, 7], [7, 7]]          7        [0, 0]
 */
public class Ct87FindInGrid {

    public int[] solution(int[][] grid, int target) {
        int[] answer = {-1, -1};     // 기본값: 못 찾음 (Ct09의 -1)
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // grid[r][c];
        // 표 전체를 돌면서
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == target) {
                //    target을 찾으면 → answer[0]에 줄 번호, answer[1]에 칸 번호를 넣고 → 바로 return answer; <= 이거 몰라서 그냥 넣으려니까 계속 에러떴음ㅋㅋㅋ
                    answer[0] = r;
                    answer[1] = c;
//                    break; <= 이게 틀렸네.... 마지막 테스트가 성공을 안해
                    return answer; // 이거 결국은 두개 생기는건데 이래도 되나.. 일단 테스트는 성공 뜨네
                }
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct87FindInGrid q = new Ct87FindInGrid();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[][]{{1, 2}, {3, 4}}, 3)) + " / 정답: [1, 0]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[][]{{5}}, 5)) + " / 정답: [0, 0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[][]{{1, 2, 3}, {4, 5, 6}}, 6)) + " / 정답: [1, 2]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[][]{{1, 2}, {3, 4}}, 9)) + " / 정답: [-1, -1]");
        System.out.println("테스트5 결과: " + Arrays.toString(q.solution(new int[][]{{7, 7}, {7, 7}}, 7)) + " / 정답: [0, 0]");
    }
}