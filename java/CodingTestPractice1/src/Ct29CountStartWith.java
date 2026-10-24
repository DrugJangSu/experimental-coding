import java.util.ArrayList;

/*
 * [Ct29] 특정 글자로 시작하는 단어 세기 (워밍업 · 하)
 *
 * 문제
 * 단어들이 문자열 배열 words로, 글자 하나가 c로 주어집니다.
 * 첫 글자가 c인 단어가 몇 개인지
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 1 ≤ 각 단어의 길이 ≤ 20
 * - 단어와 c는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * words                              c     result
 * ["banana", "berry", "apple"]       'b'   2
 * ["cat", "dog"]                     'z'   0
 * ["a"]                              'a'   1
 * ["kiwi", "kale", "kite", "lime"]   'k'   3
 */
public class Ct29CountStartWith {

    public int solution(String[] words, char c) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 문자열 시작 - > 최종적으로 몇개인지 모름 -> 리스트로 바꾸고 -> 개수로 확인.
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) == c) {
                list.add(words[i]);
            }
        }
        answer = list.size();

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }
    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct29CountStartWith q = new Ct29CountStartWith();
        System.out.println("테스트1 결과: " + q.solution(new String[]{"banana", "berry", "apple"}, 'b') + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new String[]{"cat", "dog"}, 'z') + " / 정답: 0");
        System.out.println("테스트3 결과: " + q.solution(new String[]{"a"}, 'a') + " / 정답: 1");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"kiwi", "kale", "kite", "lime"}, 'k') + " / 정답: 3");
    }
}