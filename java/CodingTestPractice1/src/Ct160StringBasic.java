/*
 * [Ct160] 문자열 다루기 기본 (예상 · Lv.1 문자열)
 * 길이가 4 또는 6이고 숫자로만 되어 있으면 true
 */
public class Ct160StringBasic {

    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {     // 숫자 글자가 아니면
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ct160StringBasic q = new Ct160StringBasic();
        System.out.println("테스트1 결과: " + q.solution("a234") + " / 정답: false");
        System.out.println("테스트2 결과: " + q.solution("1234") + " / 정답: true");
    }
}