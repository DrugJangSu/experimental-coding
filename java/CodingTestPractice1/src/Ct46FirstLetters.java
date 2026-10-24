import java.util.Arrays;

/*
 * [Ct46] 사전순 첫 글자 모으기 (6단계 · 하)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * words를 사전순으로 정렬한 뒤, 각 단어의 첫 글자를 순서대로 이어 붙인 문자열을
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 단어는 영어 소문자로만 이루어져 있고, 길이는 1 이상입니다.
 *
 * 입출력 예
 * words                           result
 * ["banana", "apple", "cherry"]   "abc"
 * ["dog"]                         "d"
 * ["zoo", "ant", "moon", "bee"]   "abmz"
 * ["cat", "car", "cab"]           "ccc"
 */
public class Ct46FirstLetters {

    public String solution(String[] words) {
        String answer = "";
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 사전순 정렬
        Arrays.sort(words); // 문자열을 사전순으로 하는 평션이 솔직히 있는지도 몰랐음
        // 2. 정렬된 단어를 하나씩 보면서, 첫 글자를 answer에 이어 붙이기
        for (int i = 0; i < words.length; i++) {
            answer += words[i].charAt(0);
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct46FirstLetters q = new Ct46FirstLetters();
        System.out.println("테스트1 결과: [" + q.solution(new String[]{"banana", "apple", "cherry"}) + "] / 정답: [abc]");
        System.out.println("테스트2 결과: [" + q.solution(new String[]{"dog"}) + "] / 정답: [d]");
        System.out.println("테스트3 결과: [" + q.solution(new String[]{"zoo", "ant", "moon", "bee"}) + "] / 정답: [abmz]");
        System.out.println("테스트4 결과: [" + q.solution(new String[]{"cat", "car", "cab"}) + "] / 정답: [ccc]");
    }
}