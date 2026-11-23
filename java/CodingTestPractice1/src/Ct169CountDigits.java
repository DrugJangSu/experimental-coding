public class Ct169CountDigits {
    public static void main(String[] args) {
        System.out.println(solution("a1b2c3"));      // 3
        System.out.println(solution("hello"));       // 0
        System.out.println(solution("2026year11"));  // 6
    }

    static int solution(String s) {
        // 여기에 작성
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        return count;
    }
}