import java.util.HashMap;

/*
 * [Ct34] 출석한 학생 점수 합계 (5단계 · 하)
 *
 * 문제
 * 학생 이름들이 문자열 배열 names로, 각 학생의 점수가 정수 배열 scores로 주어집니다.
 * (names[i]의 점수는 scores[i]입니다.)
 * 오늘 출석한 학생 이름들이 문자열 배열 attend로 주어질 때,
 * 출석한 학생들의 점수 합계를 return 하도록 solution 메서드를 완성하세요.
 * 명단에 없는 이름은 0점으로 계산합니다.
 *
 * 제한사항
 * - 1 ≤ names의 길이 = scores의 길이 ≤ 100
 * - 1 ≤ attend의 길이 ≤ 100
 * - 학생 이름은 서로 다릅니다.
 *
 * 입출력 예 (names, scores는 모두 아래와 같음)
 * names  = ["kim", "lee", "park"]
 * scores = [90, 80, 70]
 *
 * attend                    result
 * ["kim", "park"]           160
 * ["choi"]                  0
 * ["lee", "lee"]            160
 * ["kim", "choi", "lee"]    170
 */
public class Ct34ScoreSum {

    public int solution(String[] names, int[] scores, String[] attend) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 점수표(HashMap) 만들기
        HashMap<String, Integer> list = new HashMap<>();
        for (int i = 0; i < scores.length; i++) {
            list.put(names[i], scores[i]);
        }
        // 2. 출석한 학생을 한 명씩 보면서, 점수를 answer에 더하기
        //    (이번엔 getOrDefault로! 없는 이름은 0점)
        for (int i = 0; i < attend.length; i++) {
            if (!list.containsKey(attend[i])) {
            continue;
        } else {
            answer += list.get(attend[i]);
            }
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct34ScoreSum q = new Ct34ScoreSum();
        String[] names = {"kim", "lee", "park"};
        int[] scores = {90, 80, 70};
        System.out.println("테스트1 결과: " + q.solution(names, scores, new String[]{"kim", "park"}) + " / 정답: 160");
        System.out.println("테스트2 결과: " + q.solution(names, scores, new String[]{"choi"}) + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(names, scores, new String[]{"kim", "choi", "lee"}) + " / 정답: 170");
    }
}