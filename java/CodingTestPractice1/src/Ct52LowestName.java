/*
 * [Ct52] 최저 점수 학생 (실전 모드 · 중)
 *
 * 문제
 * 학생 이름들이 문자열 배열 names로, 각 학생의 점수가 정수 배열 scores로 주어집니다.
 * (names[i]의 점수는 scores[i]입니다.)
 * 점수가 가장 낮은 학생의 이름을 return 하도록 solution 메서드를 완성하세요.
 * 가장 낮은 점수가 여러 명이라면, 그중 가장 앞에 있는 학생의 이름을 return 합니다.
 *
 * 제한사항
 * - 1 ≤ names의 길이 = scores의 길이 ≤ 100
 * - 0 ≤ scores의 원소 ≤ 100
 *
 * 입출력 예
 * names                     scores              result
 * ["kim", "lee", "park"]    [80, 60, 90]        "lee"
 * ["a"]                     [50]                "a"
 * ["x", "y", "z"]           [70, 70, 70]        "x"
 * ["p", "q", "r", "s"]      [30, 10, 10, 40]    "q"
 */
public class Ct52LowestName {

    public String solution(String[] names, int[] scores) {
        String answer = names[0];
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < minScore) {
                minScore = scores[i];
                answer = names[i];
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct52LowestName q = new Ct52LowestName();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"kim", "lee", "park"}, new int[]{80, 60, 90}) + "] / 정답: [lee]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"a"}, new int[]{50}) + "] / 정답: [a]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"x", "y", "z"}, new int[]{70, 70, 70}) + "] / 정답: [x]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"p", "q", "r", "s"}, new int[]{30, 10, 10, 40}) + "] / 정답: [q]");
    }
}