/*
오늘의 팀 문제 — OX 퀴즈
난이도: Bronze 2
목표 시간: 30~40분 풀이 + 20분 토론
OX 퀴즈 결과가 문자열로 주어진다.
O : 정답
X : 오답
점수 계산 규칙은 다음과 같다.
연속해서 O가 나오면 점수가 1점씩 증가한다.
OOXXOXXOOO
라면 점수는
1 + 2 + 0 + 0 + 1 + 0 + 0 + 1 + 2 + 3
이므로 총점은
10
이다.
입력--------------------------
첫 번째 줄에 테스트 케이스의 개수 T가 주어진다.
그다음 T개의 줄에 각각 OX 퀴즈 결과 문자열이 주어진다.
예시 입력:
5
OOXXOXXOOO
OOXXOOXXOO
OXOXOXOXOXOXOX
OOOOOOOOOO
OOOOXOOOOXOOOOX
출력-------------------------
각 테스트 케이스의 총점을 한 줄에 하나씩 출력한다.
예시 출력:
10
9
7
55
30
-------------------------------------
//현재 연속된 O의 개수를 어떤 변수로 관리할까?
//O를 만났을 때 그 변수는 어떻게 변해야 할까?
//X를 만나면 왜 값을 0으로 만들어야 할까?
//총점 변수와 연속 점수 변수를 왜 따로 두는 게 좋을까?
//문자열을 딱 한 번만 순회해서 해결할 수 있을까?
 */
import java.util.Scanner;
public class TeamTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            int count = 0;
            int total = 0;
            String input = sc.nextLine().toUpperCase();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    count++;
                    total += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(total);
        }
    }
}