/*
 * [Ct10] 평균 이상 (2단계 · 상, 도전)
 *
 * 문제
 * 학생들의 시험 점수가 정수 배열 scores로 주어집니다.
 * 점수가 전체 평균 이상인 학생 수를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ scores의 길이 ≤ 100
 * - 0 ≤ scores의 원소 ≤ 100
 *
 * 입출력 예
 * scores          result
 * [60, 70, 80]    2
 * [100, 50]       1
 * [90, 90, 90]    3
 * [70, 71]        1
 */
public class Ct10AboveAverage {

    public int solution(int[] scores) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        double average = (double) total / scores.length;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= average) {
                answer++;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct10AboveAverage q = new Ct10AboveAverage();
        System.out.println("테스트1 결과: " + q.solution(new int[]{60, 70, 80}) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{100, 50}) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(new int[]{90, 90, 90}) + " / 정답: 3");
        System.out.println("테스트4 결과: " + q.solution(new int[]{70, 71}) + " / 정답: 1");
    }
}