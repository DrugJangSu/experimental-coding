import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map);                        // {}            빈 표

        map.put("grape", 1);
        System.out.println(map);                        // {grape=1}     새 줄 추가

        System.out.println(map.containsKey("grape"));   // true          적혀 있음
        System.out.println(map.containsKey("kiwi"));    // false         안 적혀 있음
        System.out.println(map.get("grape"));           // 1             grape 옆 숫자

        map.put("grape", 2);
        System.out.println(map);                        // {grape=2}     줄은 그대로, 숫자만 고쳐 씀
    }
}