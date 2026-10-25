/*
 * [Ct69] 단어 개수 세기 (8단계 · 하)
 *
 * 문제
 * 단어들이 공백 한 칸으로 구분된 문장 s가 주어집니다.
 * 문장에 단어가 몇 개 있는지 return 하도록 solution 메서드를 완성하세요.
 *
 * 제한사항
 * - 1 ≤ s의 길이 ≤ 100
 * - 단어 사이에는 공백이 정확히 한 칸씩 있고, 맨 앞과 맨 뒤에는 공백이 없습니다.
 *
 * 입출력 예
 * s                      result
 * "hello world"          2
 * "java"                 1
 * "a b c d"              4
 * "I love coding test"   4
 */
public class Ct69WordCount {

    public int solution(String s) {
        int answer = 0;
        // ↓↓↓ 여기에 코드 작성 ↓↓↓
        // 1. 공백 기준으로 잘라서 문자열 배열에 담기
        String [] words = s.split(" "); // ????? 뭐가 뭔지는 모르겠고 따로 유틸 import 한 것도 없는데 이게 가능해? 심지어 배열 생성도 안하고 그냥 바로 넣어버리네
        // 2. 단어 개수를 answer에
        answer = words.length; // 또 () 붙였다가 에러뜸


        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct69WordCount q = new Ct69WordCount();
        System.out.println("테스트1 결과: " + q.solution("hello world") + " / 정답: 2");
        System.out.println("테스트2 결과: " + q.solution("java") + " / 정답: 1");
        System.out.println("테스트3 결과: " + q.solution("a b c d") + " / 정답: 4");
        System.out.println("테스트4 결과: " + q.solution("I love coding test") + " / 정답: 4");
    }
}