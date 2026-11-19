/*
 * [Ct165] JadenCase 문자열 만들기 (예상 · Lv.2 문자열)
 * 단어의 첫 글자만 대문자, 나머지는 소문자 (공백이 여러 개일 수 있음)
 */
public class Ct165JadenCase {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;                         // 지금 글자가 단어의 첫 글자인가
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                sb.append(ch);
                first = true;                         // 공백 다음은 다시 첫 글자
            } else if (first) {
                sb.append(Character.toUpperCase(ch));
                first = false;
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ct165JadenCase q = new Ct165JadenCase();
        System.out.println("테스트1 결과: " + q.solution("3people unFollowed me") + " / 정답: 3people Unfollowed Me");
        System.out.println("테스트2 결과: " + q.solution("for the last week") + " / 정답: For The Last Week");
    }
}