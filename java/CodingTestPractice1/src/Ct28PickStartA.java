import java.util.ArrayList;
import java.util.Arrays;

/*
 * [Ct28] a로 시작하는 단어 (4단계 · 보너스)
 *
 * 문제
 * 단어들이 문자열 배열 words로 주어집니다.
 * 첫 글자가 'a'인 단어만 순서대로 골라 담은 문자열 배열을
 * return 하도록 solution 메서드를 완성하세요.
 * (해당하는 단어가 없으면 빈 배열을 return 합니다.)
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 1 ≤ 각 단어의 길이 ≤ 20
 * - 단어는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * words                                    result
 * ["apple", "banana", "avocado", "kiwi"]   ["apple", "avocado"]
 * ["cat", "dog"]                           []
 * ["a"]                                    ["a"]
 * ["ant", "bat", "art"]                    ["ant", "art"]
 */
public class Ct28PickStartA {

    public String[] solution(String[] words) {
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 먼저 생각하기: 결과 개수를 미리 알 수 있나? // ㄴㄴ
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) { // 각 단어의 첫 시작하는 알파벳을 확인해야 되니까... 이거 for문 안에 charAt으로 확인해야되나..?
            if (words[i].charAt(0) == 'a') { // 뭐야 ㅅㅂ 이거 왜 오류 안나ㅋㅋㅋㅋㅋㅋ
                list.add(words[i]);
            }
        }
        String [] answer = new String [list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct28PickStartA q = new Ct28PickStartA();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution(new String[]{"apple", "banana", "avocado", "kiwi"})) + " / 정답: [apple, avocado]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution(new String[]{"cat", "dog"})) + " / 정답: []");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution(new String[]{"a"})) + " / 정답: [a]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution(new String[]{"ant", "bat", "art"})) + " / 정답: [ant, art]");
    }
}