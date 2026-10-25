/*
 * [Ct96] 최솟값과 최댓값 (복습 · 중, Lv.2 구조)
 *
 * 문제
 * 숫자들이 공백 한 칸으로 구분된 문자열 s가 주어집니다.
 * 이 중 가장 작은 수와 가장 큰 수를 "최솟값 최댓값" 형태의 문자열로
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ 숫자 개수 ≤ 100
 * - 숫자는 음수일 수도 있습니다.
 *
 * 입출력 예
 * s                result
 * "1 2 3 4"        "1 4"
 * "-1 -2 -3 -4"    "-4 -1"
 * "-1 -1"          "-1 -1"
 * "5"              "5 5"
 */
public class Ct96MinMax {

    public String solution(String s) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 자르기 (Ct95)
        // 또 스플릿 쓰면 되나(공백없애기)
        String [] numbers = s.split(" ");
        // 2. 고르는 상자 두 개: min, max → 둘 다 첫 번째 숫자로 시작
        int max = Integer.parseInt(numbers[0]);
        int min = Integer.parseInt(numbers[0]);
        // 3. 두 번째 숫자부터 보면서, 더 작으면 min 바꾸기 / 더 크면 max 바꾸기
        for (int i = 1; i < numbers.length; i++) {
            int check = Integer.parseInt(numbers[i]);
            if (check > max) {
                max = check;
            }
            if (check < min) {
                min = check;
            }
        }
        // 4. answer = min + " " + max;
//        int [] answer = new int [min  max]; // 썅 이게 왜 아니야...
        answer = min + " " + max; // 아주 따라해라 그냥 따라해
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct96MinMax q = new Ct96MinMax();
        System.out.println("테스트1 결과: [" + q.solution("1 2 3 4") + "] / 정답: [1 4]");
        System.out.println("테스트2 결과: [" + q.solution("-1 -2 -3 -4") + "] / 정답: [-4 -1]");
        System.out.println("테스트3 결과: [" + q.solution("-1 -1") + "] / 정답: [-1 -1]");
        System.out.println("테스트4 결과: [" + q.solution("5") + "] / 정답: [5 5]");
    }
}