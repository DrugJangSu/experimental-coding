import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct20] 합격 점수 골라 담기 (4단계 · 하)
 *
 * 문제
 * 학생들의 시험 점수가 정수 배열 scores로, 합격 기준 점수가 cutline으로 주어집니다.
 * cutline 이상인 점수만 순서대로 골라 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (합격 점수가 하나도 없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ scores의 길이 ≤ 100
 * - 0 ≤ scores의 원소, cutline ≤ 100
 *
 * 입출력 예
 * scores              cutline   result
 * [70, 55, 90, 60]    60        [70, 90, 60]
 * [40, 50]            60        []
 * [100, 100]          100       [100, 100]
 * [59, 60, 61]        60        [60, 61]
 */
public class Ct20PickPass {

    public int[] solution(int[] scores, int cutline) {
        ArrayList<Integer> list = new ArrayList<>();
        // ↓↓↓ 여기에 코드 작성 (list에 골라 담기) ↓↓↓
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= cutline) {
                list.add(scores[i]);
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑

        // ↓↓↓ 빈칸 채우기 (장바구니 → 배열로 옮기기) ↓↓↓
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct20PickPass q = new Ct20PickPass();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{70, 55, 90, 60}, 60)) + " / 정답: [70, 90, 60]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{40, 50}, 60)) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{100, 100}, 100)) + " / 정답: [100, 100]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{59, 60, 61}, 60)) + " / 정답: [60, 61]");
    }
}