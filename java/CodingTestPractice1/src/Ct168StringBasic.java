public class Ct168StringBasic {
    public static void main(String[] args) {
        System.out.println(solution("a234"));   // false
        System.out.println(solution("1234"));   // true
        System.out.println(solution("12345"));  // false
        System.out.println(solution("123456")); // true
    }

    static boolean solution(String s) {
        // 여기에 작성
        if (s.length() !=  4 && s.length() != 6) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}