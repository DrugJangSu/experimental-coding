import java.util.HashMap;

/*
 * [Ct63] 처음 겹친 단어 (5단계 복습 · 중, 보류 재도전)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 앞에서부터 차례로 보다가, "이미 앞에서 나왔던 단어"가 처음 다시 나오면
 * 그 단어를 return 하도록 solution 메서드를 완성하세요.
 * 끝까지 겹치는 단어가 없으면 "none"을 return 합니다.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 *
 * 입출력 예
 * words                                  result
 * ["apple", "banana", "apple", "kiwi"]   "apple"
 * ["a", "b", "c"]                        "none"
 * ["x", "y", "y", "x"]                   "y"
 * ["k", "k"]                             "k"
 */
public class Ct63FirstDupRetry {

    public String solution(String[] words) {
        String answer = "none";     // 기본값: 못 찾음
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 장부(HashMap) 만들기
        HashMap<String, Integer> map = new HashMap<>(); // 기본세팅 작성하고
        // 2. 단어를 하나씩 보면서 (반복문은 하나!)
        //    - 이미 장부에 있으면 → 그 단어가 답, 멈추기
        //    - 없으면            → 장부에 적기 (값은 아무 숫자나, 예: 1)
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], i);
            } else {
                answer = words[i];
                break;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct63FirstDupRetry q = new Ct63FirstDupRetry();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"apple", "banana", "apple", "kiwi"}) + "] / 정답: [apple]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"a", "b", "c"}) + "] / 정답: [none]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"x", "y", "y", "x"}) + "] / 정답: [y]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"k", "k"}) + "] / 정답: [k]");
    }
}