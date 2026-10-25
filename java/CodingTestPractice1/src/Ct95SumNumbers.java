/*
 * [Ct95] 문장 속 숫자 더하기 (8단계 복습 · 하)
 *
 * 문제
 * 숫자들이 공백 한 칸으로 구분된 문자열 s가 주어집니다.
 * 이 숫자들을 모두 더한 값을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - 숫자는 음수일 수도 있습니다. (예: "-50")
 *
 * 입출력 예
 * s            result
 * "1 2 3"      6
 * "10"         10
 * "5 5 5 5"    20
 * "100 -50"    50
 */
public class Ct95SumNumbers {

    public int solution(String s) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 공백 기준으로 자르기 → 문자열 배열 (예: ["1", "2", "3"])
        String [] numbers = s.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            answer += Integer.parseInt(numbers[i]);
        }
        // 2. 하나씩 진짜 숫자로 바꿔서 더하기


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct95SumNumbers q = new Ct95SumNumbers();
        System.out.println("테스트1 결과: " + q.solution("1 2 3") + " / 정답: 6");
        System.out.println("테스트2 결과: " + q.solution("10") + " / 정답: 10");
        System.out.println("테스트3 결과: " + q.solution("5 5 5 5") + " / 정답: 20");
        System.out.println("테스트4 결과: " + q.solution("100 -50") + " / 정답: 50");
    }
}