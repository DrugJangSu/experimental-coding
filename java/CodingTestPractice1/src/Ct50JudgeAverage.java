import java.util.Arrays;

/*
 * [Ct50] 심사 점수 평균 (실전 모드 · 중)
 *
 * 문제
 * 심사위원들이 준 점수가 정수 배열 scores로 주어집니다.
 * 가장 높은 점수 하나와 가장 낮은 점수 하나를 빼고,
 * 나머지 점수들의 평균을 return 하도록 solution 메서드를 완성하세요.
 * (평균은 소수점 아래를 버린 정수입니다.)
 *
 * 제한사항
 * - 3 ≤ scores의 길이 ≤ 100
 * - 0 ≤ scores의 원소 ≤ 100
 *
 * 입출력 예
 * scores                  result
 * [10, 50, 30, 20]        25
 * [5, 5, 5]               5
 * [1, 100, 50, 50, 2]     34
 * [9, 1, 8]               8
 */
public class Ct50JudgeAverage {

    public int solution(int[] scores) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 정렬하면 가장 낮은 점수와 가장 높은 점수?????? 미친 아래거 필요 없었네
//        int max = scores[0]; // 그냥 혹시 몰라서 둘다 변수 만듦
//        int min = scores[0];
//        for (int i = 1; i < scores.length; i++) {
//            if (scores[i] > max) {
//                max = scores[i];
//            }
//            if (scores[i] < min) {
//                min = scores[i];
//            }
//        }
        // 여기서부터가 찐이여
        Arrays.sort(scores);
        int total = 0;
        for (int i = 1; i < scores.length-1; i++) {
            total += scores[i];
        }
        answer = total / (scores.length -2);

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct50JudgeAverage q = new Ct50JudgeAverage();
        System.out.println("테스트1 결과: " + q.solution(new int[]{10, 50, 30, 20}) + " / 정답: 25");
        System.out.println("테스트2 결과: " + q.solution(new int[]{5, 5, 5}) + " / 정답: 5");
        System.out.println("테스트3 결과: " + q.solution(new int[]{1, 100, 50, 50, 2}) + " / 정답: 34");
        System.out.println("테스트4 결과: " + q.solution(new int[]{9, 1, 8}) + " / 정답: 8");
    }
}