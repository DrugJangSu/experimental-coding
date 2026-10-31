import java.util.HashMap;

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
            map.put(completion[i], map.get(completion[i]) - 1);
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