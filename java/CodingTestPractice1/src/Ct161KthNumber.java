import java.util.Arrays;

/*
 * [Ct161] K번째수 (예상 · Lv.1 정렬)
 * array의 i번째~j번째를 잘라 정렬했을 때 k번째 수를 commands마다 구하기
 */
public class Ct161KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int t = 0; t < commands.length; t++) {
            int i = commands[t][0];
            int j = commands[t][1];
            int k = commands[t][2];
            int[] part = Arrays.copyOfRange(array, i - 1, j);   // i번째 ~ j번째 잘라내기
            Arrays.sort(part);
            answer[t] = part[k - 1];                            // k번째 → k - 1번 칸
        }
        return answer;
    }

    public static void main(String[] args) {
        Ct161KthNumber q = new Ct161KthNumber();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})) + " / 정답: [5, 6, 3]");
    }
}