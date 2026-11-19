/*
 * [Ct158] 문자열 내 p와 y의 개수 (1차 모의고사 · 프로그래머스 Lv.1 재도전)
 *
 * 문제
 * 대문자와 소문자가 섞인 문자열 s가 주어집니다.
 * s에 'p'의 개수와 'y'의 개수가 같으면 true, 다르면 false를 return 하세요.
 * 대문자와 소문자는 구별하지 않습니다. ('P'도 p로 셉니다.)
 * p와 y가 하나도 없으면(둘 다 0개면) true입니다.
 *
 * 입출력 예
 * s           result
 * "pPoooyY"   true
 * "Pyy"       false
 * "abc"       true
 * "py"        true
 */
public class Ct158PandY {

    public boolean solution(String s) {
        boolean answer = true;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        s = s.toLowerCase();

        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                p++;
            } else if (s.charAt(i) == 'y') {
                y++;
            }
        }
        if (p != y) {
            answer = false;
        }


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct158PandY q = new Ct158PandY();
        System.out.println("테스트1 결과: " + q.solution("pPoooyY") + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution("Pyy") + " / 정답: false");
        System.out.println("테스트3 결과: " + q.solution("abc") + " / 정답: true");
        System.out.println("테스트4 결과: " + q.solution("py") + " / 정답: true");
    }
}