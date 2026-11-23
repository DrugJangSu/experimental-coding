public class Ct171CountUppercase {
    public static void main(String[] args) {
        System.out.println(solution("Hello"));            // 1
        System.out.println(solution("ABCdef"));           // 3
        System.out.println(solution("KDT 13기 Backend")); // 4
    }

    static int solution(String s) {
        // 여기에 작성
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        return count;
    }
}