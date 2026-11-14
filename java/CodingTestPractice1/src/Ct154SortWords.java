import java.util.Arrays;

/*
 * [Ct154] 단어 사전 순으로 정리하기 (4단계 정렬 · 하)
 *
 * 문제
 * 영어 소문자 단어들이 담긴 배열 words가 주어집니다.
 * 단어들을 사전 순서로 정렬한 배열을 return 하도록 solution 메서드를 완성하세요.
 *
 * 입출력 예
 * words                           result
 * ["banana", "apple", "cherry"]   [apple, banana, cherry]
 * ["b", "a"]                      [a, b]
 * ["dog"]                         [dog]
 * ["car", "cat", "can"]           [can, car, cat]
 */
public class Ct154SortWords {

    public String[] solution(String[] words) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        Arrays.sort(words);
        return words;
        // ↑↑↑ 여기까지 ↑↑↑
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct154SortWords q = new Ct154SortWords();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new String[]{"banana", "apple", "cherry"})) + " / 정답: [apple, banana, cherry]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new String[]{"b", "a"})) + " / 정답: [a, b]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new String[]{"dog"})) + " / 정답: [dog]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new String[]{"car", "cat", "can"})) + " / 정답: [can, car, cat]");
    }
}
