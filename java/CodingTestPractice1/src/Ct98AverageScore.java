/*
 * [Ct98] 점수 평균 (복습 · 하)
 *
 * 문제
 * 점수들이 공백 한 칸으로 구분된 문자열 s가 주어집니다.
 * 점수들의 평균을 return 하도록 solution 메서드를 완성하세요.
 * (평균은 소수점 아래를 버린 정수입니다.)
 *
 * 제한사항
 * - 1 ≤ 점수 개수 ≤ 100
 * - 0 ≤ 점수 ≤ 100
 *
 * 입출력 예
 * s               result
 * "80 90 70"      80
 * "100"           100
 * "1 2"           1        (1.5 → 1)
 * "50 60 70 80"   65
 */
public class Ct98AverageScore {

    public int solution(String s) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 자르기
        // 또 스플릿 쓰면 되지?
        String [] numbers = s.split(" ");
        // 2. 하나씩 숫자로 바꿔서 합계 구하기 (Ct95 그대로)
        int [] list = new int [numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            list[i] = Integer.parseInt(numbers[i]);
        }
        int total = 0;
        for (int i = 0; i < list.length; i++) { // 난 능지가 딸려서 반복문 두개를 써야됨
            total += list[i];
        }
        // 3. 합계 ÷ 점수 개수
        answer = total / list.length;

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct98AverageScore q = new Ct98AverageScore();
        System.out.println("테스트1 결과: " + q.solution("80 90 70") + " / 정답: 80");
        System.out.println("테스트2 결과: " + q.solution("100") + " / 정답: 100");
        System.out.println("테스트3 결과: " + q.solution("1 2") + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution("50 60 70 80") + " / 정답: 65");
    }
}