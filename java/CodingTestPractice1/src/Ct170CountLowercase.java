public class Ct170CountLowercase {
    public static void main(String[] args) {
        System.out.println(solution("a1b2c3"));      // 3
        System.out.println(solution("Hello"));       // 4
        System.out.println(solution("2026YEAR"));    // 0
    }

    static int solution(String s) {
        // 여기에 작성
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        return count;
    }
}