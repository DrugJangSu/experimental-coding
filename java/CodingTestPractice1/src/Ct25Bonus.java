import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct25] 재시험 보너스 (4단계 · 중)
 *
 * 문제
 * 학생들의 시험 점수가 정수 배열 scores로 주어집니다.
 * 60점 미만인 점수만 골라, 각각 10점을 더한 값을 순서대로 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (60점 미만인 점수가 없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ scores의 길이 ≤ 100
 * - 0 ≤ scores의 원소 ≤ 100
 *
 * 입출력 예
 * scores              result
 * [50, 70, 59, 90]    [60, 69]
 * [60, 80]            []
 * [0]                 [10]
 * [55, 55, 61]        [65, 65]
 */
public class Ct25Bonus {

    public int[] solution(int[] scores) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 먼저 생각하기: 결과 개수를 미리 알 수 있나?
        // 알 수 없음. 고로 ArrayList 필요하겠네... 굳이 문자열까지 가져와서 배열 -> 문자열 -> 배열 만들어야 된다는 거지 이런 경우에?
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                list.add(scores[i] + 10); // 문자열에 넣는 건 .add()
            }
        }
        int[] answer = new int[list.size()]; // 내가 자꾸 헷갈림. 일반 배열은 .length이지만 문자열은 .size()인거야?
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); // 문자열에서 뽑아오는 건 .get()
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct25Bonus q = new Ct25Bonus();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{50, 70, 59, 90})) + " / 정답: [60, 69]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{60, 80})) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{0})) + " / 정답: [10]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{55, 55, 61})) + " / 정답: [65, 65]");
    }
}