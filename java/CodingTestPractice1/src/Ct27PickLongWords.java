import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct27] 긴 단어만 골라 담기 (4단계 · 상, 도전)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 길이가 3 이상인 단어만 순서대로 골라 담은 문자열 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (해당하는 단어가 없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 1 ≤ 각 단어의 길이 ≤ 20
 * - 단어는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * words                                result
 * ["hi", "java", "cat", "a", "code"]   ["java", "cat", "code"]
 * ["a", "bb"]                          []
 * ["apple"]                            ["apple"]
 * ["abc", "ab", "abcd"]                ["abc", "abcd"]
 */
public class Ct27PickLongWords {

    public String[] solution(String[] words) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 먼저 생각하기: 결과 개수를 미리 알 수 있나?
        // 이것도 알 수는 없겠지. 근데 아까 배열이 아닌 문자열이라 많이 까다로울듯. 지금까지 문자열 문제를 제대로 풀어본 적이 없으니까
        ArrayList<String> list = new ArrayList<>(); // integer가 아닌 string으로 해야되나..? char로 해야되나?
        for (int i = 0; i < words.length; i++) { // 빨간줄 안뜨는걸로 일단 짐작하기는 했는데.. 이건 length이네 () 없이. 이유는 몰?루
            if (words[i].length() >= 3) {
                list.add(words[i]);
            }
        }
        String [] answer = new String[list.size()]; // 와ㅋㅋㅋㅋㅋㅋ String도 가능하네.. 이거 처음 알았음. 이래서 리스트랑 문자열, 배열을 서로 분리해서 봐야된다는 거네 왜 이걸 지금 알았지
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct27PickLongWords q = new Ct27PickLongWords();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new String[]{"hi", "java", "cat", "a", "code"})) + " / 정답: [java, cat, code]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new String[]{"a", "bb"})) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new String[]{"apple"})) + " / 정답: [apple]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new String[]{"abc", "ab", "abcd"})) + " / 정답: [abc, abcd]");
    }
}