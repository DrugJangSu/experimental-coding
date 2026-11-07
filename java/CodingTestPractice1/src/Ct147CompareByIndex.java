/*
 * [Ct147] 번호로 중요도 비교하기 (3단계 준비 · 하)
 *
 * 문제
 * 문서들의 중요도가 priorities로 주어집니다. (칸 번호 = 문서 번호)
 * 문서 번호 a와 b가 주어질 때,
 * a번 문서의 중요도가 b번 문서의 중요도보다 크면 true, 아니면 false를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * priorities      a    b    result
 * [2, 1, 3, 2]    2    0    true     (2번 중요도 3 > 0번 중요도 2)
 * [2, 1, 3, 2]    1    3    false    (1번 중요도 1 > 3번 중요도 2 ? 아니요)
 * [5, 5]          0    1    false    (같으면 큰 게 아님)
 * [1, 9, 4]       1    2    true     (1번 중요도 9 > 2번 중요도 4)
 */
public class Ct147CompareByIndex {

    public boolean solution(int[] priorities, int a, int b) {
        boolean answer = false;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        if (priorities[a] > priorities[b]) {
            answer = true;
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct147CompareByIndex q = new Ct147CompareByIndex();
        System.out.println("테스트1 결과: " + q.solution(new int[]{2, 1, 3, 2}, 2, 0) + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution(new int[]{2, 1, 3, 2}, 1, 3) + " / 정답: false");
        System.out.println("테스트3 결과: " + q.solution(new int[]{5, 5}, 0, 1) + " / 정답: false");
        System.out.println("테스트4 결과: " + q.solution(new int[]{1, 9, 4}, 1, 2) + " / 정답: true");
    }
}