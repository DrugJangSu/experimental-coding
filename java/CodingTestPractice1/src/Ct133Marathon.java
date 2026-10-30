import java.util.HashMap;

/*
 * [Ct133] 완주하지 못한 선수 (LMS 2부 03 · 프로그래머스 Lv.1 재도전)
 *
 * 문제
 * 마라톤에 참여한 선수 이름 배열 participant와 완주한 선수 이름 배열 completion이 주어집니다.
 * 단 한 명만 완주하지 못했을 때, 그 선수의 이름을 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - completion의 길이는 participant의 길이보다 1 작습니다.
 * - 참가자 중에는 동명이인이 있을 수 있습니다.
 *
 * 입출력 예
 * participant                          completion                    result
 * ["leo", "kiki", "eden"]              ["eden", "kiki"]              "leo"
 * ["marina", "josipa", "nikola",       ["josipa", "filipa",          "vinko"
 *  "vinko", "filipa"]                   "marina", "nikola"]
 * ["mislav", "stanko", "mislav", "ana"] ["stanko", "ana", "mislav"]  "mislav"
 * ["a"]                                []                            "a"
 */
public class Ct133Marathon {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        // 1. 참가자 세기 (처음이면 1, 있으면 +1)
        for (int i = 0; i < participant.length; i++) {
            if (!map.containsKey(participant[i])) {
                map.put(participant[i], 1);
            } else {
                map.put(participant[i], map.get(participant[i]) + 1);
            }
        }

        // 2. 완주자마다 -1
        for (int i = 0; i < completion.length; i++) {
        }

        // 3. 1 이상 남은 사람 찾기
        for (int i = 0; i < participant.length; i++) {
            if (map.get(participant[i]) >= 1) {
                answer = participant[i];
                break;
            }
        }
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct133Marathon q = new Ct133Marathon();
        System.out.println("테스트1 결과: " + q.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}) + " / 정답: leo");
        System.out.println("테스트2 결과: " + q.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}) + " / 정답: vinko");
        System.out.println("테스트3 결과: " + q.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}) + " / 정답: mislav");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"a"}, new String[]{}) + " / 정답: a");
    }
}