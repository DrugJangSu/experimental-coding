import java.util.Arrays;

/*
 * [Ct157] 가장 가까운 같은 글자 (2차 모의고사 · 프로그래머스 Lv.1)
 *
 * 문제
 * 문자열 s의 각 위치마다, 자기보다 앞에 있는 같은 글자 중 가장 가까운 것이
 * 몇 칸 앞에 있는지 구해 배열로 return 하세요. 앞에 같은 글자가 없으면 -1입니다.
 *
 * 입출력 예
 * s          result
 * "banana"   [-1, -1, -1, 2, 2, 2]
 * "foobar"   [-1, -1, 1, -1, -1, -1]
 * "a"        [-1]
 * "aaa"      [-1, 1, 1]
 */
public class Ct157ClosestSameChar {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        // ↓↓↓ 여기에 코드 작성 ↓↓↓

        int[] last = new int[26];                // 알파벳 26칸 메모장 (마지막으로 본 자리)
        for (int i = 0; i < 26; i++) {
            last[i] = -1;                        // 처음엔 전부 "못 봄"
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';              // ① 지금 글자 → 메모장 칸 번호 (a=0, b=1 ...)

            if (last[index] == -1) {                    // ② 처음 보는 글자면
                answer[i] = -1;
            } else {
                answer[i] = i - last[index];          // ③ 지금 자리 - 마지막으로 본 자리
            }

            last[index] = i;                          // ④ 메모장에 지금 자리 적어 두기
        }

        // ↑↑↑ 여기까지 ↑↑↑
        return answer;
    }

    // 채점용 main (수정하지 않기)
    public static void main(String[] args) {
        Ct157ClosestSameChar q = new Ct157ClosestSameChar();
        System.out.println("테스트1 결과: " + Arrays.toString(q.solution("banana")) + " / 정답: [-1, -1, -1, 2, 2, 2]");
        System.out.println("테스트2 결과: " + Arrays.toString(q.solution("foobar")) + " / 정답: [-1, -1, 1, -1, -1, -1]");
        System.out.println("테스트3 결과: " + Arrays.toString(q.solution("a")) + " / 정답: [-1]");
        System.out.println("테스트4 결과: " + Arrays.toString(q.solution("aaa")) + " / 정답: [-1, 1, 1]");
    }
}