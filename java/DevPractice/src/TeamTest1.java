/*
오늘의 팀 문제 — 백준 1157번 「단어 공부」
난이도: Bronze 1
유형: 구현 / 문자열
제한 시간: 팀 기준 약 1시간
영어 알파벳으로 이루어진 단어 하나가 주어진다.
대문자와 소문자는 같은 문자로 취급한다.
단어에서 가장 많이 사용된 알파벳을 대문자로 출력하자.
단, 가장 많이 사용된 알파벳이 2개 이상이라면 ?를 출력한다.
<입력 예시>
    Mississipi 결과 : ?
    zZa 결과: z
 */

import java.util.Scanner;

public class TeamTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int max = 0;
        char answer = '?';

        for (int i = 0; i < 26; i++) {
            char letter = alphabet.charAt(i);
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == letter) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                answer = letter;
            } else if (count == max) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}

