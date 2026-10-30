import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct130] 자연수 뒤집어 배열로 만들기 (LMS 2부 02 · 프로그래머스 Lv.1)
 *
 * 문제
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로
 * return 하도록 solution 메서드를 완성하세요.
 * 예를 들어 n이 12345이면 [5, 4, 3, 2, 1]을 return 합니다.
 *
 * 제한사항
 * - n은 10,000,000,000 이하인 자연수입니다.
 *
 * 입출력 예
 * n             result
 * 12345         [5, 4, 3, 2, 1]
 * 1             [1]
 * 1000          [0, 0, 0, 1]
 * 9876543210    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
public class Ct130ReverseDigits {

    public int[] solution(long n) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        ArrayList<Integer> list = new ArrayList<>();

        while (n > 0) {
            list.add((int) (n % 10));
            n = n / 10;
        }
        int [] answer = new int [list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct130ReverseDigits q = new Ct130ReverseDigits();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(12345L)) + " / 정답: [5, 4, 3, 2, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(1L)) + " / 정답: [1]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(1000L)) + " / 정답: [0, 0, 0, 1]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(9876543210L)) + " / 정답: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }
}