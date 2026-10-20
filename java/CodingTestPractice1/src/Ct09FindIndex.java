/*
 * [Ct09] 사물함 찾기 (2단계 · 중)
 *
 * 문제
 * 사물함에 붙은 번호들이 정수 배열 lockers로, 찾는 번호가 target으로 주어집니다.
 * target이 배열에 있으면 그 위치(인덱스)를, 없으면 -1을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ lockers의 길이 ≤ 100
 * - 1 ≤ lockers의 원소, target ≤ 1,000
 * - 같은 번호가 여러 개 있을 수 있으며, 이때는 가장 앞에 있는 위치를 return 합니다.
 *
 * 입출력 예
 * lockers          target   result
 * [3, 8, 5, 1]     5        2
 * [3, 8, 5, 1]     3        0
 * [3, 8, 5, 1]     9        -1
 * [7, 7, 7]        7        0
 */
public class Ct09FindIndex {

    public int solution(int[] lockers, int target) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
//        for (int locker : lockers) {
//            if (locker == target) {
//                answer = locker.index();
//            }
//        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i] == target) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct09FindIndex q = new Ct09FindIndex();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 8, 5, 1}, 5) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new int[]{3, 8, 5, 1}, 3) + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new int[]{3, 8, 5, 1}, 9) + " / 정답: -1");
        System.out.println("테스트4 결과: " + q.solution(new int[]{7, 7, 7}, 7) + " / 정답: 0");
    }
}