/*
 * [Ct103] 명함 지갑 (12단계 · 중, Lv.1 "최소직사각형" 구조)
 *
 * 문제
 * 명함들의 가로, 세로 길이가 2차원 배열 sizes로 주어집니다.
 * (sizes[i][0]이 i번째 명함의 가로, sizes[i][1]이 세로입니다.)
 * 명함은 돌려서 넣을 수 있습니다.
 * 모든 명함을 넣을 수 있는 가장 작은 지갑의 넓이를 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ 명함 개수 ≤ 10,000
 * - 1 ≤ 가로, 세로 ≤ 1,000
 *
 * 입출력 예
 * sizes                                            result
 * [[60, 50], [30, 70], [60, 30], [80, 40]]         4000
 * [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]    120
 * [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]    133
 */
public class Ct103Wallet {

    public int solution(int[][] sizes) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 긴 변 최댓값 maxLong, 짧은 변 최댓값 maxShort를 0으로 시작
        //    (길이는 전부 1 이상이라 0으로 시작해도 괜찮아요)
        int maxLong = 0;
        int maxShort = 0;

        // 2. 명함을 하나씩 보면서 (반복문 하나, i만)
        //    - 이 명함의 긴 변 = Math.max(가로, 세로), 짧은 변 = Math.min(가로, 세로)
        //    - 긴 변이 maxLong보다 크면 바꾸기, 짧은 변이 maxShort보다 크면 바꾸기
        for (int i = 0; i < sizes.length; i++) {
            int big = Math.max(sizes[i][0], sizes[i][1]);
            int small = Math.min(sizes[i][0], sizes[i][1]);

            if (big > maxLong) {
                maxLong = big;
            }
            if (small > maxShort) {
                maxShort = small;
            }
        // 3. answer = maxLong * maxShort
        answer = maxLong * maxShort;
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct103Wallet q = new Ct103Wallet();
        System.out.println("테스트1 결과: " + q.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}) + " / 정답: 4000");
        System.out.println("테스트2 결과: " + q.solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}) + " / 정답: 120");
        System.out.println("테스트3 결과: " + q.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}) + " / 정답: 133");
    }
}