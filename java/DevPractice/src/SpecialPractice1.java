public class SpecialPractice1 {
    public static void main(String[] args) {
//        String[] s1 = {"a", "b", "c"};
//        String[] s2 = {"com", "b", "d", "p", "c"};
//
//        int answer = 0;
//        for (int i = 0; i < s1.length; i++) {
//            for (int j = 0; j < s2.length; j++) {
//                if (s1[i].equals(s2[j])) {
//                    answer++;
//                    break;
//                }
//            }
//
//        }
//        class Solution {
//            public int solution(String[] s1, String[] s2) {
//                int answer = 0;
//                for (String a : s1) {
//                    for (String b : s2) {
//                        if (a.equals(b)) {
//                            answer++;
//                            break;
//                        }
//                    }
//                }
//                return answer;
//            }
//        }

        char c = 'A';
        System.out.println(c);              // A   ← 모양으로 보여줌
        System.out.println((int) c);        // 65  ← 실제로 들어있는 번호
        System.out.println(c + 1);          // 66  ← 계산하면 번호로 나옴
        System.out.println((char) (c + 1)); // B   ← 66번을 다시 모양으로
        System.out.println('P' - 'A');      // 15

    }
}
