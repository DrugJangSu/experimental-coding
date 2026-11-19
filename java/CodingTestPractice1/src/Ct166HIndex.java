import java.util.Arrays;

/*
 * [Ct166] H-Index (예상 · Lv.2 정렬)
 * h번 이상 인용된 논문이 h편 이상인 최대 h
 */
public class Ct166HIndex {

    public int solution(int[] citations) {
        Arrays.sort(citations);                       // [0, 1, 3, 5, 6]
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i;                            // 이 논문부터 끝까지 몇 편?
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Ct166HIndex q = new Ct166HIndex();
        System.out.println("테스트1 결과: " + q.solution(new int[]{3, 0, 6, 1, 5}) + " / 정답: 3");
    }
}