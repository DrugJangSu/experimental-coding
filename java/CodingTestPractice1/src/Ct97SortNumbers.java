import java.util.Arrays;

/*
 * [Ct97] 숫자 문자열 정렬하기 (복습 · 중)
 *
 * 문제
 * 숫자들이 공백 한 칸으로 구분된 문자열 s가 주어집니다.
 * 이 숫자들을 작은 순으로 정렬한 정수 배열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ 숫자 개수 ≤ 100
 * - 숫자는 음수일 수도 있습니다.
 *
 * 입출력 예
 * s            result
 * "3 1 2"      [1, 2, 3]
 * "5"          [5]
 * "-1 10 0"    [-1, 0, 10]
 * "2 2 1"      [1, 2, 2]
 */
public class Ct97SortNumbers {

    public int[] solution(String s) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 문자열 → 숫자 배열 (방금 알려 드린 양식)
        // 일단 공백 없애야겠지...?
        String [] notNumbers = s.split(" ");
        int [] numbers = new int [notNumbers.length];
        for (int i = 0; i < notNumbers.length; i++) {
            numbers[i] = Integer.parseInt(notNumbers[i]);
        }
        // 2. 정렬 (Ct40)
        Arrays.sort(numbers);
        // 3. return
        return numbers;

        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct97SortNumbers q = new Ct97SortNumbers();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution("3 1 2")) + " / 정답: [1, 2, 3]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution("5")) + " / 정답: [5]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution("-1 10 0")) + " / 정답: [-1, 0, 10]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution("2 2 1")) + " / 정답: [1, 2, 2]");
    }
}