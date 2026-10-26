/*
 * [Ct101] 길이가 범위 안인 단어 세기 (워밍업 · 하)
 *
 * 문제
 * 단어들이 문자열 배열 words로, 정수 a와 b가 주어집니다.
 * 글자 수가 a 이상 b 이하인 단어가 몇 개인지 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ words의 길이 ≤ 100
 * - 1 ≤ a ≤ b ≤ 20
 *
 * 입출력 예
 * words                         a   b   result
 * ["hi", "hello", "java", "a"]  2   4   2       (hi, java)
 * ["abc"]                       1   3   1
 * ["x", "yy"]                   3   5   0
 * ["aa", "bb", "cc"]            2   2   3
 */
public class Ct101WordLengthRange {

    public int solution(String[] words, int a, int b) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 문자열 또 돌아아 되겠네... 반복문 두번 써야되나?
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            if (words[i].length() >= a && words[i].length() <= b) {
                answer++;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct101WordLengthRange q = new Ct101WordLengthRange();
        System.out.println("테스트1 결과: " + q.solution(new String[]{"hi", "hello", "java", "a"}, 2, 4) + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(new String[]{"abc"}, 1, 3) + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(new String[]{"x", "yy"}, 3, 5) + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"aa", "bb", "cc"}, 2, 2) + " / 정답: 3");
    }
}