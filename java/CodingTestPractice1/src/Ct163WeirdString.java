/*
 * [Ct163] 이상한 문자 만들기 (예상 · Lv.1 문자열)
 * 단어마다 짝수 번째 글자는 대문자, 홀수 번째는 소문자 (단어 안에서 0부터)
 */
public class Ct163WeirdString {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;                                  // 단어 안에서 몇 번째 글자인지
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                sb.append(ch);
                idx = 0;                              // 공백 만나면 새 단어 시작
            } else {
                if (idx % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
                idx++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ct163WeirdString q = new Ct163WeirdString();
        System.out.println("테스트1 결과: " + q.solution("try hello world") + " / 정답: TrY HeLlO WoRlD");
    }
}