import java.util.*;

/*
 * [Ct167] 전화번호 목록 (예상 · Lv.2 해시)
 * 어떤 번호가 다른 번호의 앞부분(접두어)이면 false
 */
public class Ct167PhoneBook {

    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();
        for (String p : phone_book) {
            set.add(p);
        }
        for (String p : phone_book) {
            for (int len = 1; len < p.length(); len++) {
                if (set.contains(p.substring(0, len))) {    // 내 앞부분이 목록에 있나?
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ct167PhoneBook q = new Ct167PhoneBook();
        System.out.println("테스트1 결과: " + q.solution(new String[]{"119", "97674223", "1195524421"}) + " / 정답: false");
        System.out.println("테스트2 결과: " + q.solution(new String[]{"123", "456", "789"}) + " / 정답: true");
    }
}