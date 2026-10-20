/*
 * [Ct11] a 세기 (3단계 · 하)
 *
 * 문제
 * 영어 소문자로만 이루어진 문자열 s가 주어집니다.
 * s 안에 소문자 'a'가 몇 번 나오는지 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - s는 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * s          result
 * "banana"   3
 * "apple"    1
 * "kiwi"     0
 * "aaaa"     4
 */
public class Ct11CountA {

    public int solution(String s) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                answer++;
            }
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct11CountA q = new Ct11CountA();
        System.out.println("테스트1 결과: " + q.solution("banana") + " / 정답: 3");
        System.out.println("테스트2 결과: " + q.solution("apple") + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution("kiwi") + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution("aaaa") + " / 정답: 4");
    }
}