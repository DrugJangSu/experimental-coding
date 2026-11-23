public class Ct172SwapCase {
    public static void main(String[] args) {
        System.out.println(solution("Hello"));     // hELLO
        System.out.println(solution("aBcD"));      // AbCd
        System.out.println(solution("KDT 13기"));  // kdt 13기
    }

    static String solution(String s) {
        // 여기에 작성
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = Character.toUpperCase(c);
            } else if (c >= 'A' && c <= 'Z') {
                c = Character.toLowerCase(c);
            }
            answer += c;
        }
        return answer;
    }
}