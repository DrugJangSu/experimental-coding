import java.util.HashMap;

/*
 * [Ct36] 과일 개수 세기 (5단계 · 따라 치기)
 *
 * 문제
 * 바구니에 든 과일 이름들이 문자열 배열 fruits로, 찾을 과일이 target으로 주어집니다.
 * 세기 장부(HashMap)를 만든 뒤, target이 몇 개인지 return 하도록
 * solution 메서드를 완성하세요. (없으면 0입니다.)
 *
 * 제한사항
 * - 1 ≤ fruits의 길이 ≤ 100
 * - 과일 이름은 영어 소문자로만 이루어져 있습니다.
 *
 * 입출력 예
 * fruits                         target    result
 * ["grape", "melon", "grape"]    "grape"   2
 * ["grape", "melon", "grape"]    "melon"   1
 * ["grape", "melon", "grape"]    "kiwi"    0
 * ["a", "a", "a", "a"]           "a"       4
 */
public class Ct36FruitCount {

    public int solution(String[] fruits, String target) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        // 1. 세기 장부 만들기 (위 양식을 보면서 직접 타이핑)
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {

        }

        // 2. target 개수를 answer에 담기
        //    (장부에 있으면 꺼내서 answer에, 없으면 answer는 그대로 0)


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct36FruitCount q = new Ct36FruitCount();
        String[] fruits = {"grape", "melon", "grape"};
        System.out.println("테스트1 결과: " + q.solution(fruits, "grape") + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution(fruits, "melon") + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution(fruits, "kiwi") + " / 정답: 0");
        System.out.println("테스트4 결과: " + q.solution(new String[]{"a", "a", "a", "a"}, "a") + " / 정답: 4");
    }
}