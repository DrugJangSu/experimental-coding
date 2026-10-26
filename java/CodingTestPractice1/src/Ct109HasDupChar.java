import java.util.HashMap;

/*
 * [Ct109] 같은 글자가 있나? (5단계 복습 · 하)
 *
 * 문제
 * 영어 소문자로 이루어진 문자열 s가 주어집니다.
 * 같은 글자가 두 번 이상 나오면 true, 모든 글자가 다르면 false를
 * return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 *
 * 입출력 예
 * s         result
 * "abc"     false
 * "hello"   true      (l이 두 번)
 * "a"       false
 * "aa"      true
 */
public class Ct109HasDupChar {

    public boolean solution(String s) {
        boolean answer = false;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 글자를 하나씩 서랍장에 넣기 (서랍 안 값은 아무 숫자나, 예: 1)
        HashMap<Character, Integer> map = new HashMap<>(); // Hashmap 써야되는지도 몰랐어.. 배꼈음
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        // 2. 서랍 개수와 글자 수가 다르면 → 중복 있음 (Ct35)
        if (map.size() != s.length()) {
            answer = true;
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct109HasDupChar q = new Ct109HasDupChar();
        System.out.println("테스트1 결과: " + q.solution("abc") + " / 정답: false");
        System.out.println("테스트2 결과: " + q.solution("hello") + " / 정답: true");
        System.out.println("테스트3 결과: " + q.solution("a") + " / 정답: false");
        System.out.println("테스트4 결과: " + q.solution("aa") + " / 정답: true");
    }
}