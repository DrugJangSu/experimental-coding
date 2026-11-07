import java.util.Arrays;

/*
 * [Ct149] 내 오른쪽에 나보다 큰 수 (3단계 준비 · 하)
 *
 * 문제
 * 정수 배열 nums가 주어집니다.
 * 각 칸마다 "자기보다 오른쪽에 있는 수 중 자기보다 큰 수가 몇 개인지" 세어
 * 같은 길이의 배열로 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * nums         result
 * [1, 3, 2]    [2, 0, 0]    (1 오른쪽: 3, 2 → 둘 다 큼 / 3 오른쪽: 2 → 없음 / 2 오른쪽: 없음)
 * [5, 4, 3]    [0, 0, 0]
 * [1, 2, 3]    [2, 1, 0]
 * [2, 2]       [0, 0]       (같은 건 큰 게 아님)
 */
public class Ct149BiggerOnRight {

    public int[] solution(int[] nums) {
        int[] answer = new int[nums.length];    // 처음엔 전부 0
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {     // 내 오른쪽만
                if (nums[j] > nums[i]) {                    // 오른쪽 수가 나보다 크면
                    answer[i]++;                            // 내 칸을 하나 올림
                }
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct149BiggerOnRight q = new Ct149BiggerOnRight();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new int[]{1, 3, 2})) + " / 정답: [2, 0, 0]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new int[]{5, 4, 3})) + " / 정답: [0, 0, 0]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new int[]{1, 2, 3})) + " / 정답: [2, 1, 0]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new int[]{2, 2})) + " / 정답: [0, 0]");
    }
}