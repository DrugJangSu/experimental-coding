import java.util.ArrayList;
import java.util.List;

public class Ct174PickDigits {
    public static void main(String[] args) {
        System.out.println(solution("a1b2c3"));      // [1, 2, 3]
        System.out.println(solution("2026year11"));  // [2, 0, 2, 6, 1, 1]
        System.out.println(solution("hello"));       // []
    }

    static List<Integer> solution(String s) {
        // 여기에 작성
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                list.add(c - '0');
            }
        }
        return list;
    }
}