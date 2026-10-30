import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct132] 같은 숫자는 싫어 - 리스트로 (LMS 2부 04 · 프로그래머스 Lv.1 재도전)
 *
 * 문제
 * 배열 arr에서 연속으로 나타나는 숫자는 하나만 남기고 전부 제거한 배열을
 * return 하도록 solution 메서드를 완성하세요. (순서는 유지)
 *
 * 입출력 예
 * arr                      result
 * [1, 1, 3, 3, 0, 1, 1]    [1, 3, 0, 1]
 * [4, 4, 4, 3, 3]          [4, 3]
 * [5]                      [5]
 * [1, 2, 3]                [1, 2, 3]
 */
public class Ct132NoSameNumber {

    public int[] solution(int[] arr) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        int [] answer = new int [list.size()];
//        for (int n : list) {
//            answer[i] = list[i];
//        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct132NoSameNumber q = new Ct132NoSameNumber();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 1, 3, 3, 0, 1, 1})) + " / 정답: [1, 3, 0, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{4, 4, 4, 3, 3})) + " / 정답: [4, 3]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{5})) + " / 정답: [5]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3})) + " / 정답: [1, 2, 3]");
    }
}