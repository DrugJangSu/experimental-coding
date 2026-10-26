import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct110] 기능 배포 (Lv.2 "기능개발" 핵심 버전)
 *
 * 문제
 * 여러 기능이 앞에서부터 순서대로 배포되어야 합니다.
 * 각 기능이 완성되는 날이 정수 배열 days로 주어집니다. (days[i]는 i번째 기능이 완성되는 날)
 * 뒤에 있는 기능이 먼저 완성되더라도, 앞에 있는 기능이 배포될 때까지 기다렸다가
 * 앞 기능이 배포되는 날 함께 배포됩니다.
 * 한 번 배포할 때마다 몇 개의 기능이 함께 배포되는지를 순서대로 담은 배열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * (코스 요리 비유: 1번 요리가 나가기 전엔, 뒤 요리가 먼저 완성돼도 못 나감.
 *  1번이 나갈 때 그때까지 완성된 뒤 요리들이 같이 나감.)
 *
 * 제한사항
 * - 1 ≤ days의 길이 ≤ 100
 * - 1 ≤ days의 원소 ≤ 100
 *
 * 입출력 예
 * days                    result
 * [7, 3, 9]               [2, 1]       (7일에 1·2번 함께, 9일에 3번)
 * [5, 10, 1, 1, 20, 1]    [1, 3, 2]    (5일에 1번, 10일에 2·3·4번, 20일에 5·6번)
 * [1]                     [1]
 * [3, 3, 3]               [3]          (같은 날 완성이면 함께 배포)
 */
public class Ct110Deploy {

    public int[] solution(int[] days) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        ArrayList<Integer> list = new ArrayList<>();   // 배포마다 몇 개였는지 담을 장바구니
        int current = days[0];                         // 지금 배포 기준일 (첫 기능으로 시작)
        int count = 1;                                 // 지금 배포에 묶인 개수

        for (int i = 1; i < days.length; i++) {
            if (days[i] <= current) {                          // 빈칸①: 기준일보다 빨리(같은 날 포함) 끝났으면
                count++;                               //   같이 나감
            } else {                                   // 늦게 끝났으면
                list.add(count);                       //   지금까지 묶음을 배포하고
                current = days[i];                     //   이 기능으로 새 기준일
                count = 1;                             //   새 묶음 1개부터
            }
        }
        list.add(count);                                    // 빈칸②: 반복이 끝났을 때 남아 있는 마지막 묶음 처리

        int[] answer = new int[list.size()];           // 옮기기 양식
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct110Deploy q = new Ct110Deploy();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{7, 3, 9})) + " / 정답: [2, 1]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5, 10, 1, 1, 20, 1})) + " / 정답: [1, 3, 2]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{1})) + " / 정답: [1]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{3, 3, 3})) + " / 정답: [3]");
    }
}