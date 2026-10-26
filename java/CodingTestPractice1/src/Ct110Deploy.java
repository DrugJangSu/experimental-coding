import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct110] 기능 배포 (Lv.2 "기능개발" 핵심 버전)
 *
 * 입출력 예
 * days                    result
 * [7, 3, 9]               [2, 1]
 * [5, 10, 1, 1, 20, 1]    [1, 3, 2]
 * [1]                     [1]
 * [3, 3, 3]               [3]
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