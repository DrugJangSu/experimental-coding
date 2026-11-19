/*
 * [Ct162] 시저 암호 (예상 · Lv.1 문자열)
 * 알파벳을 n칸씩 밀기 (z 다음은 a), 대소문자 유지, 공백은 그대로
 */
public class Ct162CaesarCipher {

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char) ('a' + (ch - 'a' + n) % 26));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) ('A' + (ch - 'A' + n) % 26));
            } else {
                sb.append(ch);                                  // 공백은 그대로
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ct162CaesarCipher q = new Ct162CaesarCipher();
        System.out.println("테스트1 결과: " + q.solution("AB", 1) + " / 정답: BC");
        System.out.println("테스트2 결과: " + q.solution("z", 1) + " / 정답: a");
        System.out.println("테스트3 결과: " + q.solution("a B z", 4) + " / 정답: e F d");
    }
}