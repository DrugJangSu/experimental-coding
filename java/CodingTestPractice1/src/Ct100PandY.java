/*
 * [Ct100] p와 y의 개수 (실전 모드 · Lv.1 구조)
 *
 * 문제
 * 영어 대소문자로 이루어진 문자열 s가 주어집니다.
 * s에 있는 'p'의 개수와 'y'의 개수를 비교해서, 같으면 true, 다르면 false를
 * return 하도록 solution 메서드를 완성하세요.
 * 대문자와 소문자는 구별하지 않습니다. ('P'도 'p'로 셉니다.)
 * 'p'와 'y'가 하나도 없으면 둘 다 0개라서 true입니다.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 50
 *
 * 입출력 예
 * s           result
 * "pPoooyY"   true      (p 2개, y 2개)
 * "Pyy"       false     (p 1개, y 2개)
 * "abc"       true      (p 0개, y 0개)
 * "pY"        true
 */
public class Ct100PandY {

    public boolean solution(String s) {
        boolean answer = false;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        int pCount = 0; // p 개수
        int yCount = 0; // y 개수
        for (int i = 0; i < s.length(); i++) {
//            if (Character.isUpperCase(s.charAt(i))) { // 결국 toLowerCase를 까먹어서 찾아봄
//                Character.toLowerCase(s.charAt(i)); // 결국 이거가 작동 안하는 거 같아서 아래 노가다함
//            }
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') { // 노가다1
                pCount++;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') { // 노가다2
                yCount++;
            }
        }
        if (pCount == yCount) {
            answer = true;
        }
        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct100PandY q = new Ct100PandY();
        System.out.println("테스트1 결과: " + q.solution("pPoooyY") + " / 정답: true");
        System.out.println("테스트2 결과: " + q.solution("Pyy") + " / 정답: false");
        System.out.println("테스트3 결과: " + q.solution("abc") + " / 정답: true");
        System.out.println("테스트4 결과: " + q.solution("pY") + " / 정답: true");
    }
}