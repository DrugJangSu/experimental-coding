/*
 * [Ct08] 합격자 수 (2단계 · 하)
 *
 * 문제
 * 학생들의 시험 점수가 정수 배열 scores로, 합격 기준 점수가 cutline으로 주어집니다.
 * 점수가 cutline 이상인 학생은 합격입니다.
 * 합격한 학생 수를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ scores의 길이 ≤ 100
 * - 0 ≤ scores의 원소 ≤ 100
 * - 0 ≤ cutline ≤ 100
 *
 * 입출력 예
 * scores              cutline   result
 * [70, 55, 90, 60]    60        3
 * [40, 50, 30]        60        0
 * [100, 100]          100       2
 * [59, 60, 61]        60        2
 */
public class Ct08PassCount {

    public int solution(int[] scores, int cutline) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= cutline) {
                answer++;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct08PassCount q = new Ct08PassCount();
        System.out.println("테스트1 결과: " + q.solution(new int[]{70, 55, 90, 60}, 60) + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution(new int[]{40, 50, 30}, 60) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{100, 100}, 100) + " / 정답: 2");
        System.out.println("테스트4 결과: " + q.solution(new int[]{59, 60, 61}, 60) + " / 정답: 2");
    }
}