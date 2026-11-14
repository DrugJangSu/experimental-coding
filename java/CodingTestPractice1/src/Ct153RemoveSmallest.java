import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct153] 제일 작은 수 제거하기 (LMS 2부 07 · 프로그래머스 Lv.1)
 *
 * 문제
 * 정수 배열 arr에서 가장 작은 수를 제거한 배열을 return 하도록 solution 메서드를 완성하세요.
 * 단, 남는 게 없으면(배열 길이가 1이면) [-1]을 return 합니다.
 * (같은 수는 없습니다.)
 *
 * 입출력 예
 * arr             result
 * [4, 3, 2, 1]    [4, 3, 2]
 * [10]            [-1]
 * [5, 1, 3]       [5, 3]
 * [2, 7, 9, 4]    [7, 9, 4]
 */
public class Ct153RemoveSmallest {

    public int[] solution(int[] arr) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;

        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct153RemoveSmallest q = new Ct153RemoveSmallest();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{4, 3, 2, 1})) + " / 정답: [4, 3, 2]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{10})) + " / 정답: [-1]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{5, 1, 3})) + " / 정답: [5, 3]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{2, 7, 9, 4})) + " / 정답: [7, 9, 4]");
    }
}